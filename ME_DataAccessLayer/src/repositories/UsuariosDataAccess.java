package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosDataAccess extends Conexion implements IUsuariosDataAccess{

	UsuariosDataAccess(){
		super.crearConexion();
	}

	@Override
	public ResultSet verificaLoginUsuario(String pUsername, String pPassword)
			throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement stmt = 
				this.getConexion().prepareStatement("{call dbo.sprVerificaUsuario(?,?)}");
		stmt.setString(1, pUsername);
		stmt.setString(2, pPassword);
		
		return stmt.executeQuery();			
	}
	
	/**
	 * Metodo encargado de, primero verificar si no existe ya el usuario en la base de datos y luego
	 * lo guarda en la BD
	 */
	@Override
	public boolean registraNuevoUsuario(String pUser, String pPass,
			String pEmail, String pRole) {
		
		Conexion baseDeDatos = new Conexion();
		
		boolean isValid = true;
		int contador = 0;
		
		try{
			baseDeDatos.crearConexion();
			
			PreparedStatement pstmt = baseDeDatos.getConexion().prepareStatement("{call dbo.sprVerificaUsuario(?,?)}");
			pstmt.setString(1, pUser);
			pstmt.setString(2, pPass);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				contador++;
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
				
				PreparedStatement pstmt = baseDeDatos.getConexion().prepareStatement("{call dbo.sprRegistraUsuario(?,?,?)}");
				pstmt.setString(1, pUser);
				pstmt.setString(2, pPass);
				if ("RolUser".equals(pRole)){
					pstmt.setInt(3, 1);
				}else{
					pstmt.setInt(3, 0);
				}
				pstmt.executeQuery();
			}catch(Exception e){
				e.printStackTrace();
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
	 * Metodo encargado de guardar la informacion adicional del nuevo usuario en la base de datos
	 */
	@Override
	public boolean guardarInformacionAdicional(String pUsername, String pNombre, String pPais, String pGenero, String pGeneros, String pExperiencia, String pMail, String pDate) {
		
		String[] nombreCompleto = pNombre.split(" ");
		try{
			Conexion baseDeDatos = new Conexion();
			baseDeDatos.crearConexion();
			
			PreparedStatement pstmt = baseDeDatos.getConexion().prepareStatement("{call dbo.sprGuardarInfoUsuario(?,?,?,?,?,?,?,?,?)}");
			pstmt.setString(1, nombreCompleto[0]);
			pstmt.setString(2, nombreCompleto[1]);
			pstmt.setString(3, pMail);
			pstmt.setInt(4, 1);//Cambiar esto
			pstmt.setString(5, pExperiencia);
			pstmt.setString(6, pDate);
			pstmt.setString(7, "");
			pstmt.setInt(8,1);
			pstmt.setInt(9, 1);
			
			pstmt.executeQuery();
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("Error al tratar de establecer conexion desde el repositorio");
			return false;
		}
		
		return true;
	}

	@Override
	public ResultSet actualizarInformacionAdicional(String pUsername, String pNombre, String pPais, String pGenero, String pGeneros, String pExperiencia, String pMail) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Metodo encargado de retornar todos los generos
	 * que se encuentran almacenados en la base de datos
	 */
	public ResultSet getGeneros(){
		ResultSet rs = null;
		
		try{
			Conexion baseDeDatos = new Conexion();
			baseDeDatos.crearConexion();
			
			PreparedStatement pstmt = baseDeDatos.getConexion().prepareStatement("{call dbo.sprGetGenerosPersonas()}");
			rs = pstmt.executeQuery();
		}catch(Exception e){
			System.out.println("Error al tratar de establecer conexion desde el repositorio");
			e.printStackTrace();
		}
		
		return rs;
	}

	@Override
	public ResultSet getPerfil(String pUsername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet cambiarClave(String pUsername, String pPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet getSolicitud(String pCodigoExperto,
			String pCodigoSolicitante, String pTimestamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet getAllExpertos() throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement stmt = 
				this.getConexion().prepareStatement("{call dbo.sprGetAllExpertos()}");
		
		return stmt.executeQuery();	
	}
	
}
