package repositories;

import java.util.List;

import models.UserModel;


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
	public UserModel getUserModel( String pUsername , String pPassword ){
		UserModel logindata = new UserModel();
		logindata.setUser("luisa05");
		logindata.setPwd("1234");
		logindata.setNombre("Luisa Matamoros");
		logindata.setEmail("luisa05@email.com");
		logindata.setGenero("Femenino");
		logindata.setPais("Colombia");
		return logindata;
	}
	
	/**
	 * @param name: Nombre de usuario que se busca
	 * @return Se devuelve una lista de modelos de usuario
	 * con atributos nulos exceptuando el username y el 
	 * nombre completo. Dicha lista contiene los usuarios 
	 * cuyo username contiene al parametro name.
	 */
	public List<UserModel> getUsersByUsername(String name){
		return null;
	}
	
	/**
	 * @param name: Nombre de usuario que se busca
	 * @return Se devuelve una lista de modelos de usuario
	 * con atributos nulos exceptuando el username y el 
	 * nombre completo. Dicha lista contiene los usuarios 
	 * cuyo Nombre Completo contiene al parametro name.
	 */
	public List<UserModel> getUsersByFullName(String name){
		return null;
	}
}
