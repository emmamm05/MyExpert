package controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.FormParam;

import logic.ConfiguracionCuenta;
import models.RegistroModel;
import models.UserModel;

import com.sun.jersey.api.view.Viewable;

@Path("/Registro")
public class CuentaController{
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response showRegisterPage(){
		  return Response.ok(new Viewable("/Registro")).build();
	  }
	  
	  // This method is called if HTML is request
	  @Path("newUser")
	  @POST
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response requestUserRegister( 
			  @FormParam("Username") String user, 
			  @FormParam("Password") String pwd,
			  @FormParam("RepeatPassword") String rpwd,
			  @FormParam("Email") String mail,
			  @FormParam("RolUser") String userRol,
			  @FormParam("RolAdmin") String userAdmin,
			  @FormParam("RolPlan") String userPlan) {
		
		ConfiguracionCuenta config = new ConfiguracionCuenta();
		RegistroModel newUserRegister = new RegistroModel();
		
		newUserRegister.setUsername(user);
		newUserRegister.setPassword(pwd);
		newUserRegister.setRepeatPassword(rpwd);
		newUserRegister.setMail(mail);
		
		if ("RolUser".equals(userRol)){
			newUserRegister.setRol("Usuario");
		}
		else if ("RolAdmin".equals(userAdmin)){
			newUserRegister.setRol("Administrador");
		}
		else if ("RolPlan".equals(userPlan)){
			newUserRegister.setRol("Administrador de planilla");
		}
		
		boolean isValid = config.registrarNuevoUsuario(newUserRegister);
		
		if (isValid){
			return Response.ok(new Viewable("/Configuracion_1",newUserRegister )).build();
		}
		
		
		return Response.ok(new Viewable("/Registro",newUserRegister )).build();
	  }
	  
	  @Path("/userConfig")
	  @POST
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response requestUserConfiguration(
			  @FormParam("user") String pUser, 
			  @FormParam("name") String pName,
			  @FormParam("correo") String pMail,
			  @FormParam("femenino") String pFemenino,
			  @FormParam("masculino") String pMasculino,
			  @FormParam("paises") String pCountry,
			  @FormParam("generos") String pGenre,
			  @FormParam("experiencia") String pExpirience){
		  
		  
		  ConfiguracionCuenta config = new ConfiguracionCuenta();
		  UserModel newUserModel = new UserModel();
		  newUserModel.setUser(pUser);
		  newUserModel.setNombre(pName);
		  newUserModel.setPais(pCountry);
		  newUserModel.setEmail(pMail);
		  newUserModel.setExperiencia(pExpirience);
		  newUserModel.setGeneros(pGenre);
		  
		  if ("femenino".equals(pFemenino)){
			  newUserModel.setGenero(pFemenino);
		  }else if ("masculino".equals(pMasculino)){
			  newUserModel.setGenero(pMasculino);
		  }
		  
		  boolean isValid = config.configurarCuentaDeUsuario(newUserModel);
		  
		  if (isValid){
			  System.out.println("Se ingresaron todos los datos requridos");
			  return Response.ok(new Viewable("/Perfil",newUserModel )).build();
		  }
		  return Response.ok(new Viewable("/Configurar_1",newUserModel )).build();
	  } 

}
