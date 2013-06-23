/**
 * 
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import logic.Login;
import models.UsuarioModel;

import autentificacion.BasicAuth;

import com.sun.jersey.api.view.Viewable;
import com.sun.research.ws.wadl.Request;



/**
 * @author emma
 *
 */

@Path("/Perfil")
public class PerfilController {
	
	public final static int ADMIN_ROLE = 0;
	public final static int EXPERT_ROLE = 1;
	
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response showPerfilPage(
			  @QueryParam("UUID") String pUUID){
		    UsuarioModel user = BasicAuth.getUser(pUUID);
		    String perfilPageLocation;
		    if ( user.getRole() == ADMIN_ROLE ){
		    	perfilPageLocation = "/AdminPerfil";		    	
		    }else{
		    	perfilPageLocation = "/Perfil";
		    }
			return Response.ok(new Viewable( perfilPageLocation , user ) ).build();
	  }
	
}
