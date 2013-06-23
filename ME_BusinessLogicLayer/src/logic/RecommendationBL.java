package logic;

import java.util.ArrayList;
import java.util.List;

import repositories.RepositorioRecomendaciones;

import models.RecomendacionModel;

/**
 * @author emma
 *
 */
public class RecommendationBL {
	
	RepositorioRecomendaciones mRepository;
	
	public RecommendationBL(){
		mRepository = new RepositorioRecomendaciones();
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
		RepositorioRecomendaciones repo = new RepositorioRecomendaciones();
		repo.addNuevaRecomendacion(pRecomendacion);
	}
	
}