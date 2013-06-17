package repositories;

import java.util.List;
import java.util.UUID;

import models.Recomendacion;
import models.User;


/**
 * @author emma
 * Se encarga de administrar los repositorios relacionados a los usuarios
 * incluyendo las busquedas
 */
public class UserRepository {


	/**
	 * @param pUsername
	 * @param pPassword
	 * @return el modelo de usuario completo excepto la contrasenna
	 * del usuario cuyo username y contrasenna coinciden con los
	 * parametros
	 */
	public User getUserModel( String pUsername , String pPassword ){
		User logindata = new User();
		logindata.setUser("luisa05");
		logindata.setPwd("1234");
		logindata.setNombre("Luisa Matamoros");
		logindata.setEmail("luisa05@email.com");
		logindata.setGenero("Femenino");
		logindata.setRole(User.BASIC_ROLE);
		logindata.setPais("Colombia");
		for ( int i = 0 ; i < 10 ; i++){
			Recomendacion  recomendation = new Recomendacion();
			recomendation.setAutor( "autor"+Integer.toString(i) );
			recomendation.setDestinatario( "destinatario"+Integer.toString(i) );
			recomendation.setId(UUID.randomUUID().hashCode());
			logindata.getBuzon().put(recomendation.getId(), recomendation );
		}
		return logindata;
	}
	
	/**
	 * @param name: Nombre de usuario que se busca
	 * @return Se devuelve una lista de modelos de usuario
	 * con atributos nulos exceptuando el username y el 
	 * nombre completo. Dicha lista contiene los usuarios 
	 * cuyo username contiene al parametro name.
	 */
	public List<User> getUsersByUsername(String name){
		return null;
	}
	
	/**
	 * @param name: Nombre de usuario que se busca
	 * @return Se devuelve una lista de modelos de usuario
	 * con atributos nulos exceptuando el username y el 
	 * nombre completo. Dicha lista contiene los usuarios 
	 * cuyo Nombre Completo contiene al parametro name.
	 */
	public List<User> getUsersByFullName(String name){
		return null;
	}
}
