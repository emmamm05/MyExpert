package controllers;

import java.io.IOException;
import java.net.URI;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.FormParam;

import logic.Login;
import models.UsuarioModel;
import models.ViewLoginModel;

import autentificacion.BasicAuth;

import com.sun.jersey.api.view.Viewable;


@Path("/Login")
public class LoginController {

	  @Context
	  UriInfo uriInfo;

	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response showLoginPage( String pMessage ){
			ViewLoginModel loginView = new ViewLoginModel();
			loginView.setMessage(pMessage);
			return Response.ok(new Viewable("/Login",loginView )).build();
	  }	  
	  
	  // This method is called if HTML is request
	  @POST
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response handlerLogin( 
			  @FormParam("Username") String user, 
			  @FormParam("Password") String pwd,
			  @Context HttpServletRequest request,
			  @Context HttpServletResponse response) throws IOException {
				  
		UsuarioModel loginRequested = new UsuarioModel();
		loginRequested.setUser(user);
		loginRequested.setPwd(pwd);
		String id = UUID.randomUUID().toString();
		boolean isValid = Login.Validate(loginRequested, id );
				
		if ( isValid ){
//			response.setHeader("UUID", id);
			System.out.println("Autentificacion Valida");
			UriBuilder builder = uriInfo.getBaseUriBuilder();
			builder.path("/Perfil");
			builder.queryParam("UUID", id);
			URI uri = builder.build();
			Response res = Response.seeOther(uri).header("UUID", request.getHeader("UUID")).build();
			return res;						
		}
		System.out.println("Autentificacion Invalida");
		return showLoginPage("Autentificacion Invalida");
	  }
	  
	
}
