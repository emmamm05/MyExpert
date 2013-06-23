package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.RecomendacionModel;

public class RecomendacionesDataAccess extends Conexion{
	
	public ResultSet addRecomendacion( RecomendacionModel pRecomendacion ) throws SQLException{
		
		PreparedStatement stmt = 
				this.getConexion().prepareStatement("{call dbo.sprAddNuevaRecomendacion(?)}");
		stmt.setString(1, pRecomendacion.getDescripcion() );
		stmt.setString(2 , pRecomendacion.getmCodigoExperto() );
		stmt.setString(3, pRecomendacion.getCodigoSolicitante() );
		stmt.setString(4, pRecomendacion.getCodigoGenero() );
		stmt.setInt(5, pRecomendacion.getAnno() );
		stmt.setString(6, pRecomendacion.getCodigoTitulo() );
		stmt.setString(7, pRecomendacion.getmNombreSolicitante() );
		
		return stmt.executeQuery();	
		
	}
	
	public void getRecomendaciones( String pCodigoUsuarioExterno ){
		
	}
	
}
