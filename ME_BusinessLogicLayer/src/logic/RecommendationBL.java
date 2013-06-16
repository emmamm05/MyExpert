package logic;

import java.util.ArrayList;
import java.util.List;

import repositories.RecomendationsRepository;

import models.Recomendation;

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
	
	public List<Recomendation> getNewRecommendations(String pUsuario,String timestamp){
		List<Recomendation> recomendaciones = new ArrayList<Recomendation>();
		mRepository.getNuevasRecomendaciones(recomendaciones,pUsuario, timestamp);
		return recomendaciones;
	}
	
	public String getRecomendationLastUpdate(String pUsuario){
		return mRepository.getLastUpdateTime(pUsuario);		
	}	
	
	
	
}
