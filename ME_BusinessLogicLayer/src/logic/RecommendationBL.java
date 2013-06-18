package logic;

import java.util.ArrayList;
import java.util.List;

import repositories.RecomendationsRepository;

import models.RecomendacionModel;

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
	
	public List<RecomendacionModel> getNewRecommendations(String pUsuario,String timestamp){
		List<RecomendacionModel> recomendaciones = new ArrayList<RecomendacionModel>();
		mRepository.getNuevasRecomendaciones(recomendaciones,pUsuario, timestamp);
		return recomendaciones;
	}
	
	public String getRecomendationLastUpdate(String pUsuario){
		return mRepository.getLastUpdateTime(pUsuario);		
	}
	
	public void addNuevaRecomendacion(RecomendacionModel pRecomendacion){
		RecomendationsRepository repo = new RecomendationsRepository();
		repo.addNuevaRecomendacion(pRecomendacion);
	}
	
}
