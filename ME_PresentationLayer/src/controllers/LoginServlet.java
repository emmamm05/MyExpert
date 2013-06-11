package controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.FormParam;

import test.cLogin;




import Models.UserModel;

import com.sun.jersey.api.view.Viewable;

import factory.ViewModelBuilder;


@Path("/Login")
public class LoginServlet {

	  // This method is called if TEXT_PLAIN is request
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
	    return "Hello Jersey";
	  }

	  // This method is called if XML is request
	  @GET
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHello() {
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	  }

	  // This method is called if HTML is request
	  @POST
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response sayHtmlHello( 
			  @FormParam("Username") String user, 
			  @FormParam("Password") String pwd ) {
		
		cLogin loginBL = new cLogin();
		UserModel loginRequested = new UserModel();  
		loginRequested.setUser(user);
		loginRequested.setPwd(pwd);
		
		ViewModelBuilder vmFactory = new ViewModelBuilder();
				
		if (loginBL.Validate(loginRequested)){	
			System.out.println("Autentificacion Valida");
			return Response.ok(new Viewable("/Perfil",
					vmFactory.buildPerfilViewModel(
							loginBL.getLoginDTO())
					)).build();
		}
		System.out.println("Autentificacion Invalida");
		return Response.ok(new Viewable("/Login",
				vmFactory.buildLoginViewModel(true)
				)).build();
	  }
	  
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response showLoginPage(){
		  return Response.ok(new Viewable("/Login")).build();
	  }
		
}
