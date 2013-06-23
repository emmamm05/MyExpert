package logic;

import java.sql.Timestamp;
import java.util.List;

import models.GeneroModel;
import models.PuntuacionesXmlModel;
import models.TituloModel;

public interface ICatalogosLogic {

	public List<GeneroModel> getGeneros(Timestamp pTimestamp);
	public List<GeneroModel> getAllGeneros();
	public List<TituloModel> getTitulos(Timestamp pTimestamp);
	public List<TituloModel> getAllTitulos();
	public void getAllPuntaciones(PuntuacionesXmlModel pModel);
	public boolean addGenero(GeneroModel pGenero, String pUsuario);
	public boolean deshabilitarGenero( String pCodigo );
	public boolean habilitarGenero(String pCodigo);
	public boolean editGenero(GeneroModel pGenero, String pUsuario);
	public boolean getGenero(GeneroModel pGenero);
	public void addTitulo(TituloModel pTitulo, String pUsuario);
}
