package repositories;

import java.util.List;

import models.RecomendacionModel;

public interface IRepositorioRecomendaciones {

	public boolean getNuevasRecomendaciones(List<RecomendacionModel> pRecomendaciones,
			String Usuario, String timestamp);

	public boolean getNuevasSolicitudes(List<RecomendacionModel> pRecomendaciones,
			String Usuario, String timestamp);
	
	public void addNuevaRecomendacion( RecomendacionModel pRecomendacion );
	
}
