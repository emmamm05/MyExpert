package repositories;

import java.sql.Timestamp;
import java.util.List;

import models.GeneroModel;

public interface IRepositorioGeneros {
	
	public List<GeneroModel> getGeneros(Timestamp pTimestamp);
	public List<GeneroModel> getAllGeneros();
	public boolean addGenero( GeneroModel pGenero, String pUsuario );
	public boolean deshabilitarGenero( String pCodigo );
	public boolean habilitarGenero(String pCodigo);
	public boolean editGenero(GeneroModel pGenero, String pUsuario);
	public boolean getGenero(GeneroModel pGenero);
}
