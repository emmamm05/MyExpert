/**
 * 
 */
package autentificacion;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import logic.Login;
import models.UsuarioModel;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

/**
 * @author emma
 *
 */
public class AuthFilter implements ContainerRequestFilter{
	@Override
    public ContainerRequest filter(ContainerRequest containerRequest){
		
        String method = containerRequest.getMethod();
        String path   = containerRequest.getPath(true);
        String UUID   = containerRequest.getQueryParameters().getFirst("UUID");
        
        System.out.println("Auth-method: "+method);
        System.out.println("Auth-path: "+path);
        System.out.println("Auth-UUID: "+UUID);
        
        //@TODO: cambiar por regex
        if ( path.equals( "application.wadl") 
    		|| path.equals("application.wadl/xsd0.xsd")
    		|| path.equals("Login")
    		|| path.contains("Registro")){
        	System.out.println("Auth:Public");
            return containerRequest;
            
        }else if ( UUID == null ){
        	System.out.println("Auth:UUID Null");
        	throw new WebApplicationException(Status.UNAUTHORIZED);
        }
        
        UsuarioModel user = BasicAuth.getUser(UUID);
        
        if ( user == null ){
        	System.out.println("Auth:User Null");
        	throw new WebApplicationException(Status.UNAUTHORIZED);
        	
		}else if ( path.contains("Generos") && user.getRole() != UsuarioModel.ADMIN_ROLE ){
        	
			System.out.println("Auth:Role !=");
			throw new WebApplicationException(Status.UNAUTHORIZED);       	
        	
        }
        System.out.println("Auth:Pass");
        return containerRequest;
    }
}
