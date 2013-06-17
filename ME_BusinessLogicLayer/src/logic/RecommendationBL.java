package logic;

import java.util.ArrayList;
import java.util.List;

import repositories.RecomendationsRepository;

import models.Recomendacion;

/**
 * @author emma
 *
 */
public class RecommendationBL {
	
	RecomendationsRepository mRepository;
	
	public RecommendationBL(){
		mRepository = new RecomendationsRepository();
	}
	
	public void addNewRecomendacion(){
		
	}
	
	public List<Recomendacion> getNewRecommendations(String pUsuario,String timestamp){
		List<Recomendacion> recomendaciones = new ArrayList<Recomendacion>();
		mRepository.getNuevasRecomendaciones(recomendaciones,pUsuario, timestamp);
		return recomendaciones;
	}
	
	public String getRecomendationLastUpdate(String pUsuario){
		return mRepository.getLastUpdateTime(pUsuario);		
	}
	
	public void addNuevaRecomendacion(Recomendacion pRecomendacion){
		RecomendationsRepository repo = new RecomendationsRepository();
		repo.addNuevaRecomendacion(pRecomendacion);
	}
	
}
