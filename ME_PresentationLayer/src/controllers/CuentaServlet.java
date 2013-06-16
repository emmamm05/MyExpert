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
public class CuentaServlet{
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response showRegisterPage(){
		  return Response.ok(new Viewable("/Registro")).build();
	  }
	  
	  // This method is called if HTML is request
	  @Path("/newUser")
	  @POST
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response requestUserRegister( 
			  @FormParam("Username") String user, 
			  @FormParam("Password") String pwd,
			  @FormParam("RepeatPassword") String rpwd,
			  @FormParam("Email") String mail,
			  @FormParam("RolUser") boolean userRol,
			  @FormParam("RolAdmin") boolean userAdmin,
			  @FormParam("RolPlan") boolean userPlan) {
		  
		System.out.println("Valor de la variable userRol");
		System.out.println(userRol);
		
		ConfiguracionCuenta config = new ConfiguracionCuenta();
		RegistroModel newUserRegister = new RegistroModel();
		
		newUserRegister.setUsername(user);
		newUserRegister.setPassword(pwd);
		newUserRegister.setRepeatPassword(rpwd);
		newUserRegister.setMail(mail);
		
		if (userRol){
			newUserRegister.setRol("Usuario");
		}
		else if (userAdmin){
			System.out.println("Se quiere un rol de administrados");
			newUserRegister.setRol("Administrador");
		}
		else if (userPlan){
			newUserRegister.setRol("Administrador de planilla");
		}
		
		boolean isValid = config.registrarNuevoUsuario(newUserRegister);
		
		if (user.equals(isValid)){
			//File fichero = new File ("c:/User/Luis Alonso/Desktop/fichero.txt");
			return Response.ok(new Viewable("/Configuracion",newUserRegister )).build();
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
			  @FormParam("sexo") String pSexo,
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
		  newUserModel.setGenero(pSexo);
		  newUserModel.setGeneros(pGenre);
		  
		  boolean isValid = config.configurarCuentaDeUsuario(newUserModel);
		  
		  if (isValid){
			  return Response.ok(new Viewable("/Perfil",newUserModel )).build();
		  }
		  return Response.ok(new Viewable("/Configurar_1",newUserModel )).build();
	  } 

}
