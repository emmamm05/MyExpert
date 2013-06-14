package controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.FormParam;

import logic.Login;
import models.UserModel;
import models.ViewLoginModel;

import com.sun.jersey.api.view.Viewable;


@Path("/Login")
public class LoginServlet {

	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response showLoginPage(){
		  return Response.ok(new Viewable("/Login")).build();
	  }
	  
	  // This method is called if HTML is request
	  @POST
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response sayHtmlHello( 
			  @FormParam("Username") String user, 
			  @FormParam("Password") String pwd ) {
		
		Login loginBL = new Login();
		
		UserModel loginRequested = new UserModel();
		loginRequested.setUser(user);
		loginRequested.setPwd(pwd);
		
		boolean isValid = loginBL.Validate(loginRequested);//temporalmente
		UserModel loginMatched = loginBL.getLoggedUser();
				
		if ( isValid ){	
			System.out.println("Autentificacion Valida");
			return Response.ok(new Viewable("/Perfil", loginMatched )).build();
		}
		System.out.println("Autentificacion Invalida");
		ViewLoginModel loginView = new ViewLoginModel();
		loginView.setMessage("Autentificacion Invalida");
		loginView.setUserModel(loginMatched);
		return Response.ok(new Viewable("/Login",loginView )).build();
	  }
	  
		
}
