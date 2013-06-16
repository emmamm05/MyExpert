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
	
	/**
	 * @param pUserName: Nombre del nuevo usuario a registrarse
	 * @param pPassword: Contrasena del nuevo usuario
	 * @param pMail: correo del nuevo usuario
	 * @param pRol: rol correspondiente del nuevo usuario
	 * @return Se devuelve un valor booleano correspondiente al
	 * resultado del proceso de guardar la informacion en la base
	 * de datos.
	 */
	public boolean setNewUser(String pUserName, String pPassword, String pMail, String pRol){
		
		/*
		 * Aqui se coloca la logica para guardar la informacion del usuario en la base de datos
		 */
		
		return true;
	}
	
	/**
	 * 
	 * @param pUser: Username del nuevo usuario experto
	 * @param pNombre: Nombre completo del usuario
	 * @param pPais: Pais de procedencia del usuario
	 * @param pSexo: Genero del nuevo usuario
	 * @param pGenero: Generos de pelicuals que domina el usuario
	 * @param pExperiencia: Experincia en el septimo arte el nuevo usuario
	 * @param pEmail: Correo electronico de contacto del nuevo usuario
	 * @return Se retorna el valor boolenao del resultado del proceso de guardar los datos
	 * en la base de datos
	 */
	public boolean guardarInformacionAdicionalDeUsuario(String pUser, String pNombre, String pPais, String pSexo, String pGenero, String pExperiencia, String pEmail){
		//Aqui se coloca la logica para guardar esta informacion dentro de la base de datos
		return true;
	}
}
