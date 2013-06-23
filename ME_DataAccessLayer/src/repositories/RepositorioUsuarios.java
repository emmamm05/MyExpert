package repositories;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import models.RecomendacionModel;
import models.UsuarioModel;
import models.RegistroModel;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.Query;

/**
 * @author emma
 * Se encarga de administrar los repositorios relacionados a los usuarios
 * incluyendo las busquedas
 */
public class RepositorioUsuarios implements IRepositorioUsuarios{
	
	/**
	 * Metodo encarga de verificar en la base de datos la 
	 * autetificacion del usuario
	 * @param pUsuarioModel
	 * @return boolean
	 */
	public boolean verificaLoginUsuario( UsuarioModel pUsuarioModel ){
		
		//Colocar la logica para conectares con el data access
		
		return true;
	}


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
				
				dbUser.setUser( rs.getString("Username") );
				dbUser.setNombre("Luisa Matamoros");
				dbUser.setEmail("luisa05@email.com");
				dbUser.setGenero("Femenino");
				dbUser.setRole( rs.getInt("Rol") );	
				
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
	 
	public boolean registraNuevoUsuario( RegistroModel pUsuarioModel ){
		
		UsuariosDataAccess dataAccess = new UsuariosDataAccess();
		return dataAccess.registraNuevoUsuario(pUsuarioModel.getUsername(), pUsuarioModel.getPassword(), pUsuarioModel.getMail(), pUsuarioModel.getRol());
		
	}
	
	/**
	 * Metodo encargado de guardar la informacion adicional del uauario en la
	 * base de datos por medio del data access
	 */
	public boolean guardarInformacionAdicional( UsuarioModel pUsuario ){
		
		UsuariosDataAccess dataAccess = new UsuariosDataAccess();
		String date = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		
		dataAccess.guardarInformacionAdicional(pUsuario.getUser(), pUsuario.getNombre(), pUsuario.getPais(), pUsuario.getGenero(), pUsuario.getGeneros(), pUsuario.getExperiencia(), pUsuario.getEmail(), date);
		
		return true;
	}
	
	/**
	 * Metodo encargado de actualizar la informacion adicional del usuario
	 * en al base de datos por medio del data access
	 */
	public boolean actualizarInformacionAdicional( UsuarioModel pUsuario ){
		
		//Colocar la logica para conectarse con el data access
		
		return true;
	}
	
	/**
	 * Metodo encargado de obtener la informacion
	 * necesario para mostara el perfil del usuario
	 */
	public boolean getPerfilUsuario( UsuarioModel pUsuario ){
		
		//Colocar la logica para conectarse con el data access
		
		return true;
	}
	
	/**
	 * Metodo encargado de cambiar la clace de un determinado
	 * usuario
	 */
	public boolean cambiarClave( UsuarioModel pUsuarioModel ){
		
		//Colocar la logica para conectarse con el data access
		
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


	@Override
	public void getSolicitud(RecomendacionModel pRecomendacion) {
		
				
	}

	@Override
	public List<UsuarioModel> getAllExpertos() {
		UsuariosDataAccess access = new UsuariosDataAccess();
		ResultSet rs = null;
		List<UsuarioModel> expertos = new ArrayList<UsuarioModel>();
		
		try {
			rs = access.getAllExpertos();
			
			while ( rs.next() ){
				
				UsuarioModel usuario = new UsuarioModel();
				usuario.setUser( rs.getString("Username") );
				usuario.setNombre( rs.getString("Nombre") );
				usuario.setApellidos( rs.getString("Apellido1") );
				
				expertos.add( usuario );				
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return expertos;
	}
}
