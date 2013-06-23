package logic;

import java.util.List;

import models.TituloModel;

public interface IBusquedasLogic {

	public List<TituloModel> buscarPorDirector( String pDirector );
	public List<TituloModel> buscarPorNombre( String pNombre ); 
	
}
