/**
 * 
 */
package autentificacion;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.DatatypeConverter;

import logic.LogicFactory;
import models.UsuarioModel;

/**
 * @author emma
 *
 */
public class BasicAuth {
	
	public static String[] decode(String auth) {
        //Replacing "Basic THE_BASE_64" to "THE_BASE_64" directly
        auth = auth.replaceFirst("[B|b]asic ", "");
 
        //Decode the Base64 into byte[]
        byte[] decodedBytes = DatatypeConverter.parseBase64Binary(auth);
 
        //If the decode fails in any case
        if( decodedBytes == null || decodedBytes.length == 0 ){
            return null;
        }
 
        //Now we can convert the byte[] into a splitted array :
        //  - the first one is login,
        //  - the second one password
        return new String(decodedBytes).split(":", 2);   
	}
	
//	public static String getUser(HttpServletRequest req) {
//		String header = req.getHeader("authorization");
//		return BasicAuth.decode(header)[0];	
//	}
	
	public static UsuarioModel getUser(String pUUID){
		LogicFactory logicFactory = new LogicFactory();
		return logicFactory.createAutorizacionLogic().getLoggedUser(pUUID);
	}
	
}
