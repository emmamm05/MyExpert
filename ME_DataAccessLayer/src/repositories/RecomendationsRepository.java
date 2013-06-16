/**
 * 
 */
package repositories;

import java.util.List;

import models.Recomendation;

/**
 * @author emma
 *
 */
public class RecomendationsRepository {
	
	public boolean getNuevasRecomendaciones(
			List<Recomendation> pRecomendaciones, 
			String Usuario, String timestamp){
		Recomendation recomendacion1 = new Recomendation();
		recomendacion1.setDestinatario("destinatario");
		recomendacion1.setAutor("autor");
		recomendacion1.setFecha("2001");
		recomendacion1.setProcessed(true);
		recomendacion1.setTipoAutor(1);
		
		Recomendation recomendacion2 = new Recomendation();
		recomendacion2.setDestinatario("destinatario2");
		recomendacion2.setAutor(Usuario);
		recomendacion2.setFecha(timestamp);
		recomendacion2.setProcessed(true);
		recomendacion2.setTipoAutor(0);
		
		pRecomendaciones.add(recomendacion1);
		pRecomendaciones.add(recomendacion2);
		return true;
	}

	
	public String getLastUpdateTime(String Usuario){
		return null;
	}
		
}
