package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import models.GeneroModel;

public class GenerosDataAccess extends Conexion{
	
	GenerosDataAccess(){
		super.crearConexion();
	}

	public ResultSet getGeneros(Timestamp pTimestamp)
		throws SQLException {
			// TODO Auto-generated method stub
			
			PreparedStatement stmt = 
					this.getConexion().prepareStatement("{call dbo.sprGetGenerosTitulos(?)}");
			stmt.setTimestamp(1, pTimestamp);
			
			return stmt.executeQuery();	
	}
	
	public ResultSet getAllGeneros() {
		return null;
	}
	
	public ResultSet addGenero( String pGenero , String pDescripcion, String pCodigo, String pUsuario )
		throws SQLException {
		
		PreparedStatement stmt = 
				this.getConexion().prepareStatement("{call dbo.sprAddGenero(?,?,?,?)}");
		stmt.setString(1, pGenero);
		stmt.setString(2, pDescripcion);
		stmt.setString(3, pCodigo);
		stmt.setString(4, pUsuario);
		
		return stmt.executeQuery();		
	}
	
	public ResultSet deshabilitarGenero( String pCodigo ) throws SQLException {
		
		PreparedStatement stmt = 
				this.getConexion().prepareStatement("{call dbo.sprDeshabilitarGenero(?)}");
		stmt.setString(1, pCodigo);
		
		return stmt.executeQuery();		
	}
	
	public ResultSet habilitarGenero( String pCodigo ) throws SQLException {
		
		PreparedStatement stmt = 
				this.getConexion().prepareStatement("{call dbo.sprHabilitarGenero(?)}");
		stmt.setString(1, pCodigo);
		
		return stmt.executeQuery();		
	}
	
	public ResultSet getGenero(String pCodigo) throws SQLException {
		PreparedStatement stmt = 
				this.getConexion().prepareStatement("{call dbo.sprGetGenero(?)}");
		stmt.setString(1, pCodigo);
		
		return stmt.executeQuery();
	}
	
	public ResultSet editGenero( String pGenero , String pDescripcion, String pCodigo, String pUsuario ) throws SQLException{
		PreparedStatement stmt = 
				this.getConexion().prepareStatement("{call dbo.sprUpdateGenero(?,?,?,?)}");
		stmt.setString(1, pGenero);
		stmt.setString(2, pDescripcion);
		stmt.setString(3, pCodigo);
		stmt.setString(4, pUsuario);
		
		return stmt.executeQuery();
	}
	
}
