package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TituloDataAccess implements ITitulosDataAccess{
	
	/**
	 * Metodo encargado de almacenar en la base de datos la resenna de
	 * determinado titulos
	 */
	public boolean almacenarResenna(String pTitulo, String pContenidoResenna, String pAutor, float pPuntuacion){
		
		try{
			Conexion baseDeDatos = new Conexion();
			baseDeDatos.crearConexion();
			PreparedStatement pstmt = baseDeDatos.getConexion().prepareStatement("{call dbo.sprAlmacenarResenna(?,?,?,?)}");
			pstmt.setString(1, pTitulo);
			pstmt.setString(2, pContenidoResenna);
			pstmt.setString(3, pAutor);
			pstmt.setFloat(4, pPuntuacion);
			pstmt.executeQuery();
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("Error al tratar de establecer conexion desde el repositorio");
			return false;
		}
		
		return true;
	}
	
	/**
	 * Metodo encargado de obtener de la base de datos la lista de titulos
	 * que coincidadn con el nombre del director que la produce
	 */
	public ResultSet getTitulosPorDirector(String pNombreDirector){

		ResultSet rs = null;
		
		try{
			Conexion baseDeDatos = new Conexion();
			baseDeDatos.crearConexion();
			
			PreparedStatement pstmt = baseDeDatos.getConexion().prepareStatement("{call dbo.sprGetTitulosPorDirector('"+pNombreDirector+"')}");
			//pstmt.setString(1, pNombreDirector);
			
			rs = pstmt.executeQuery();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error al tratar de establecer conexion desde el repositorio");
		}
		
		return rs;
	}
	
	/**
	 * Metodo encargado de obtener de la base de datos la lista de titulos
	 * que coinciden con el nombre de titulo que proporciona el cliente.
	 */
	public ResultSet getTitulosPorTitulo(String pNombreTitulo){

		ResultSet rs = null;
		
		try{
			Conexion baseDeDatos = new Conexion();
			baseDeDatos.crearConexion();
			
			PreparedStatement pstmt = baseDeDatos.getConexion().prepareStatement("{call dbo.sprGetTitulosPorNombre(?)}");
			pstmt.setString(1, pNombreTitulo);
			rs = pstmt.executeQuery();
		}catch(Exception e){
			System.out.println("Error al tratar de establecer conexion desde el repositorio");
			e.printStackTrace();
		}
		
		
		
		return rs;
	}
	
	/**
	 * metodo encargado de obtener de la base de datos la informacion
	 * complemenntaria a mostrar en el perfil del respectivo titulos
	 * @param pNombreTitulo
	 * @return ResultSet
	 */
	public ResultSet getInformacionAdicionalDeTitulo(String pNombreTitulo){
		ResultSet rs = null;
		
		try{
			Conexion baseDeDatos = new Conexion();
			baseDeDatos.crearConexion();
			
			PreparedStatement pstmt = baseDeDatos.getConexion().prepareStatement("{call dbo.sprCargarInformacionTitulo(?)}");
			pstmt.setString(1, pNombreTitulo);
			rs = pstmt.executeQuery();
		}catch(Exception e){
			System.out.println("Error al tratar de establecer conexion desde el repositorio");
		}
		
		return rs;
	}

}
