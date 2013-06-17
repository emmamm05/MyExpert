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
import models.User;

import com.sun.jersey.api.view.Viewable;
import com.sun.research.ws.wadl.Request;

/**
 * @author emma
 *
 */

@Path("/Perfil")
public class PerfilServlet {

	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response showPerfilPage(
			  @QueryParam("UUID") String pUUID){
		    User user = Login.getLoggedUser(pUUID);
			return Response.ok(new Viewable("/Perfil", user ) ).build();
	  }
	
}
