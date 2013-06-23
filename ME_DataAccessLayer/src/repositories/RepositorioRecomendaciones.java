/**
 * 
 */
package repositories;

import java.util.List;

import models.RecomendacionModel;

/**
 * @author emma
 *
 */
public class RepositorioRecomendaciones {
	
	public boolean getNuevasRecomendaciones(
			List<RecomendacionModel> pRecomendaciones, 
			String Usuario, String timestamp){
		RecomendacionModel recomendacion1 = new RecomendacionModel();
		recomendacion1.setDestinatario("destinatario");
		recomendacion1.setAutor("autor");
		recomendacion1.setFecha("2001");
		recomendacion1.setProcessed(true);
		recomendacion1.setTipoAutor(1);
		
		RecomendacionModel recomendacion2 = new RecomendacionModel();
		recomendacion2.setDestinatario("destinatario2");
		recomendacion2.setAutor(Usuario);
		recomendacion2.setFecha(timestamp);
		recomendacion2.setProcessed(true);
		recomendacion2.setTipoAutor(0);
		
		pRecomendaciones.add(recomendacion1);
		pRecomendaciones.add(recomendacion2);
		return true;
	}
	
	public boolean getNuevasSolicitudes(
			List<RecomendacionModel> pRecomendaciones, 
			String Usuario, String timestamp){
		RecomendacionModel recomendacion1 = new RecomendacionModel();
		recomendacion1.setDestinatario("destinatario");
		recomendacion1.setAutor("autor");
		recomendacion1.setFecha("2001");
		recomendacion1.setProcessed(true);
		recomendacion1.setTipoAutor(1);
		
		RecomendacionModel recomendacion2 = new RecomendacionModel();
		recomendacion2.setDestinatario("destinatario2");
		recomendacion2.setAutor(Usuario);
		recomendacion2.setFecha(timestamp);
		recomendacion2.setProcessed(true);
		recomendacion2.setTipoAutor(0);
		
		pRecomendaciones.add(recomendacion1);
		pRecomendaciones.add(recomendacion2);
		return true;
	}
	
	public RecomendacionModel getRecomendacion( int pId ){
		RecomendacionModel recomendacion1 = new RecomendacionModel();
		recomendacion1.setDestinatario("destinatario"+ Integer.toString(pId));
		recomendacion1.setAutor("autor");
		recomendacion1.setId(pId);
		recomendacion1.setFecha("2001");
		recomendacion1.setProcessed(true);
		recomendacion1.setTipoAutor(1);
		return recomendacion1;
	}

	
	public String getLastUpdateTime(String Usuario){
		return null;
	}
	
	public boolean addNuevaRecomendacion(RecomendacionModel pRecomendacion){
		return false;		
	}
		
}
