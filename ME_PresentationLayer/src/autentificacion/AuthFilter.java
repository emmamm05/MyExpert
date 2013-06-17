/**
 * 
 */
package autentificacion;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import logic.Login;
import models.User;


import repositories.UserRepository;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

/**
 * @author emma
 *
 */
public class AuthFilter implements ContainerRequestFilter{
	@Override
    public ContainerRequest filter(ContainerRequest containerRequest){
//        GET, POST, PUT, DELETE, ...
        String method = containerRequest.getMethod();
        // myresource/get/56bCA for example
        String path = containerRequest.getPath(true);
        
        
        System.out.println("method: "+method);
        System.out.println("path: "+ path);
        //We do allow wadl to be retrieve
        if ( path.equals( "application.wadl") 
    		|| path.equals("application.wadl/xsd0.xsd")
    		|| path.equals("Login")){
        	System.out.println("Private URL");
            return containerRequest;
        }
// 
//        //Get the authentification passed in HTTP headers parameters
//        String auth = containerRequest.getHeaderValue("authorization");
// 
//        //If the user does not have the right (does not provide any HTTP Basic Auth)
//        if(auth == null){
//        	System.out.println("No Auth header");
//            throw new WebApplicationException(Status.UNAUTHORIZED);
//        }
// 
//        //lap : loginAndPassword
//        String[] lap = BasicAuth.decode(auth);
// 
//        //If login or password fail
//        if(lap == null || lap.length != 2){
//        	System.out.println("Format auth header invalid");
//            throw new WebApplicationException(Status.UNAUTHORIZED);
//        }
// 
//        User user = new User();
//        user.setUser(lap[0]);
//        user.setPwd(lap[1]);
//        if (Login.getLoggedUser(lap[0]) == null ){
//        	System.out.println("Is not logged");
//        	throw new WebApplicationException(Status.UNAUTHORIZED);
//        }
// 
//        //TODO : HERE YOU SHOULD ADD PARAMETER TO REQUEST, TO REMEMBER USER ON YOUR REST SERVICE...
		String id = containerRequest.getHeaderValue("auth");
		System.out.println(id);
		System.out.println(Login.getLoggedUser(id));
		String UUID = containerRequest.getQueryParameters().getFirst("UUID");
		if ( UUID != null && Login.getLoggedUser(UUID) != null ){
			return containerRequest;
		}
		String UUID2 = containerRequest.getHeaderValue("UUID");
		if ( UUID2 != null && Login.getLoggedUser(UUID2) != null ){
			return containerRequest;
		}
		if ( null == Login.getLoggedUser(id) ){
			throw new WebApplicationException(Status.UNAUTHORIZED);
		}
        return containerRequest;
    }
}
