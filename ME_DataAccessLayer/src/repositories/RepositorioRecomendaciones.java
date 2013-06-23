/**
 * 
 */
package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import models.RecomendacionModel;

/**
 * @author emma
 *
 */
public class RepositorioRecomendaciones implements IRepositorioRecomendaciones{
	
	@Override
	public boolean getNuevasRecomendaciones(
			List<RecomendacionModel> pRecomendaciones, 
			String Usuario, String timestamp){
		
		return true;
	}
	
	@Override
	public boolean getNuevasSolicitudes(
			List<RecomendacionModel> pRecomendaciones, 
			String Usuario, String timestamp){
		return true;
	}
	
	public RecomendacionModel getRecomendacion( int pId ){
		return null;
	}

	
	public String getLastUpdateTime(String Usuario){
		return null;
	}
	
	public void addNuevaRecomendacion(RecomendacionModel pRecomendacion){
		RecomendacionesDataAccess access = new RecomendacionesDataAccess();
		try {
			ResultSet rs = access.addRecomendacion(pRecomendacion);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}
