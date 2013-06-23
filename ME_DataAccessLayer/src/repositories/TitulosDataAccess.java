package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class TitulosDataAccess extends Conexion{
	
		TitulosDataAccess(){
			super.crearConexion();
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
