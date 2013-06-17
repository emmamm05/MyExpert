/**
 * 
 */
package repositories;

import java.util.List;

import models.Recomendacion;

/**
 * @author emma
 *
 */
public class RecomendationsRepository {
	
	public boolean getNuevasRecomendaciones(
			List<Recomendacion> pRecomendaciones, 
			String Usuario, String timestamp){
		Recomendacion recomendacion1 = new Recomendacion();
		recomendacion1.setDestinatario("destinatario");
		recomendacion1.setAutor("autor");
		recomendacion1.setFecha("2001");
		recomendacion1.setProcessed(true);
		recomendacion1.setTipoAutor(1);
		
		Recomendacion recomendacion2 = new Recomendacion();
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
			List<Recomendacion> pRecomendaciones, 
			String Usuario, String timestamp){
		Recomendacion recomendacion1 = new Recomendacion();
		recomendacion1.setDestinatario("destinatario");
		recomendacion1.setAutor("autor");
		recomendacion1.setFecha("2001");
		recomendacion1.setProcessed(true);
		recomendacion1.setTipoAutor(1);
		
		Recomendacion recomendacion2 = new Recomendacion();
		recomendacion2.setDestinatario("destinatario2");
		recomendacion2.setAutor(Usuario);
		recomendacion2.setFecha(timestamp);
		recomendacion2.setProcessed(true);
		recomendacion2.setTipoAutor(0);
		
		pRecomendaciones.add(recomendacion1);
		pRecomendaciones.add(recomendacion2);
		return true;
	}
	
	public Recomendacion getRecomendacion( int pId ){
		Recomendacion recomendacion1 = new Recomendacion();
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
	
	public boolean addNuevaRecomendacion(Recomendacion pRecomendacion){
		return false;		
	}
		
}