package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Date;
import java.sql.Types;

public class TitulosDataAccess extends Conexion{
	
		TitulosDataAccess(){
			super.crearConexion();
		}
		
		public ResultSet addTitulo( Object[] pParams ) throws SQLException{
			PreparedStatement stmt = 
					this.getConexion().prepareStatement("{call dbo.sprAddTitulo(?,?,?,?,?,?,?,?,?,?)}");
			stmt.setString(1, (String)pParams[0]);
			stmt.setString(2, (String)pParams[1]);
			stmt.setString(3, (String)pParams[2]);
			stmt.setInt(4, (Integer)pParams[3]);
			stmt.setInt(5, (Integer)pParams[4]);
			stmt.setString(6, (String)pParams[5]);
			stmt.setFloat(7, (Float)pParams[6]);
			//stmt.setDate(8, (Date)pParams[7]);
			stmt.setString(8, (String)pParams[8]);
			//stmt.setString(10, null);
			stmt.setInt(9, (Integer)pParams[10]);
			stmt.setString(10, (String)pParams[11]);
			
			return stmt.executeQuery();
		}
		

		public ResultSet getTitulos(Timestamp pTimestamp) throws SQLException{
			PreparedStatement stmt = 
					this.getConexion().prepareStatement("{call dbo.sprGetTitulos(?)}");
			stmt.setTimestamp(1, pTimestamp);
			
			return stmt.executeQuery();	
		}
		
		public ResultSet getTitulo(String pCodigoTitulo) throws SQLException{
			PreparedStatement stmt = 
					this.getConexion().prepareStatement("{call dbo.sprGetTitulo(?)}");
			stmt.setString(1, pCodigoTitulo);
			
			return stmt.executeQuery();	
		}
		
		public ResultSet getAllTitulos(){
			return null;
		}
		
		public ResultSet getResenna(String pCodigoTitulo) throws SQLException{
			PreparedStatement stmt = 
					this.getConexion().prepareStatement("{call dbo.sprGetResennaPorTitulo(?)}");
			stmt.setString(1, pCodigoTitulo);
			
			return stmt.executeQuery();	
		}
		
		public ResultSet getResennaCompleta(String pCodigoTitulo, String pCodigoAutor) throws SQLException{
			PreparedStatement stmt = 
					this.getConexion().prepareStatement("{call dbo.sprGetResenaCompleta(?,?)}");
			stmt.setString(1, pCodigoAutor);
			stmt.setString(2, pCodigoTitulo);
			
			return stmt.executeQuery();	
		}
		
		public ResultSet getPuntuacionesExpertos(String pCodigoTitulo) throws SQLException{
			PreparedStatement stmt = 
					this.getConexion().prepareStatement("{call dbo.sprGetPuntuacionesPorTitulo(?)}");
			stmt.setString(1, pCodigoTitulo);
			
			return stmt.executeQuery();
		}
}
