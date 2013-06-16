package controllers;

import java.io.IOException;
import java.net.URI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.FormParam;

import logic.Login;
import models.UserModel;
import models.ViewLoginModel;

import com.sun.jersey.api.view.Viewable;


@Path("/Login")
public class LoginServlet {

	  @Context
	  UriInfo uriInfo;
	  Login loginBL = new Login();

	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response showLoginPage( String pMessage ){
			ViewLoginModel loginView = new ViewLoginModel();
			loginView.setMessage(pMessage);
			return Response.ok(new Viewable("/Login",loginView )).build();
	  }	  
	  
	  @Path("/Perfil")
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response showPerfilPage(@Context HttpServletRequest req){
		  	HttpSession session = req.getSession(true);
		    UserModel user = loginBL.getLoggedUser();
		    System.out.println(user.toString());
			return Response.ok(new Viewable("/Perfil", user )).build();
	  }
	  
	  // This method is called if HTML is request
	  @POST
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response handlerLogin( 
			  @FormParam("Username") String user, 
			  @FormParam("Password") String pwd,
			  @Context final HttpServletResponse response) throws IOException {
		
		Login loginBL = new Login();

		  
		UserModel loginRequested = new UserModel();
		loginRequested.setUser(user);
		loginRequested.setPwd(pwd);
		
		boolean isValid = loginBL.Validate(loginRequested);
		//temporalmente necesita validarse antes de llamar getLoggedUser
		UserModel loginMatched = loginBL.getLoggedUser();
				
		if ( isValid ){	
			System.out.println("Autentificacion Valida");
			//return showPerfilPage( loginMatched );
			//response.sendRedirect("http://localhost:8080/ME_PresentationLayer/rest/Login/perfil");
			System.out.println(uriInfo.getBaseUriBuilder());
			URI uri = uriInfo.getBaseUriBuilder().path("/Login/Perfil").build();
			System.out.println(uri.getPath());
			System.out.println(loginMatched.toString());
			return Response.seeOther(uri).build();						
		}
		System.out.println("Autentificacion Invalida");
		return showLoginPage("Autentificacion Invalida");
	  }
	  
		
}
