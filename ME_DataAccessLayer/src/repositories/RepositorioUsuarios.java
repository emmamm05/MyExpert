package repositories;

import java.util.List;
import java.util.UUID;

import models.RecomendacionModel;
import models.UsuarioModel;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.Query;

/**
 * @author emma
 * Se encarga de administrar los repositorios relacionados a los usuarios
 * incluyendo las busquedas
 */
public class RepositorioUsuarios {


	/**
	 * @param pUsername
	 * @param pPassword
	 * @return el modelo de usuario completo excepto la contrasenna
	 * del usuario cuyo username y contrasenna coinciden con los
	 * parametros
	 */
	public UsuarioModel getUserModel( String pUsername , String pPassword ){
		
		UsuariosDataAccess access = new UsuariosDataAccess();
		UsuarioModel dbUser = new UsuarioModel();
		ResultSet rs = null;
		
		try {
			rs = access.verificaLoginUsuario(pUsername, pPassword);
			
			while ( rs.next() ){
				
				dbUser.setUser( rs.getString("Usuario") );
				dbUser.setNombre("Luisa Matamoros");
				dbUser.setEmail("luisa05@email.com");
				dbUser.setGenero("Femenino");
				dbUser.setRole( rs.getInt("Rol"));	
				
				System.out.println( dbUser.toString() );
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return dbUser;
	}
	
	/**
	 * @param name: Nombre de usuario que se busca
	 * @return Se devuelve una lista de modelos de usuario
	 * con atributos nulos exceptuando el username y el 
	 * nombre completo. Dicha lista contiene los usuarios 
	 * cuyo username contiene al parametro name.
	 */
	public List<UsuarioModel> getUsersByUsername(String name){
		return null;
	}
	
	/**
	 * @param name: Nombre de usuario que se busca
	 * @return Se devuelve una lista de modelos de usuario
	 * con atributos nulos exceptuando el username y el 
	 * nombre completo. Dicha lista contiene los usuarios 
	 * cuyo Nombre Completo contiene al parametro name.
	 */
	public List<UsuarioModel> getUsersByFullName(String name){
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
		
		Conexion baseDeDatos = new Conexion();
		
		boolean isValid = true;
		int contador = 0;
		
		try{
			baseDeDatos.crearConexion();
			
			PreparedStatement pstmt = baseDeDatos.getConexion().prepareStatement("{call dbo.sprVerificaUsuario(?,?)}");
			pstmt.setString(1, pUserName);
			pstmt.setString(2, pPassword);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
		}catch(Exception e){
			System.out.println("Error al tratar de establecer conexion desde el repositorio");
		}
		
		if (contador > 0){
			System.out.println("Ya existe el usuario");
			isValid = false;
		}
		
		if (isValid){
			try{
				//baseDeDatos.crearConexion();
				
				PreparedStatement pstmt = baseDeDatos.getConexion().prepareStatement("{call dbo.sprRegistraUsuario(?,?)}");
				pstmt.setString(1, pUserName);
				pstmt.setString(2, pPassword);
				System.out.println("antes");
				pstmt.executeQuery();
				System.out.println("despues");
			}catch(Exception e){
				System.out.println("Error al tratar de establecer conexion desde el repositorio 2");
			}
		}
		
		try{
			baseDeDatos.cerrarConexion();
		}catch(Exception e){
			System.out.println("Error al trata de cerrar conexion desde el repositorio");
		}
		
		return isValid;
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
