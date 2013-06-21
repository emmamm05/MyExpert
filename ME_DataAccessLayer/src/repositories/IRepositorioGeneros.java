package repositories;

import java.sql.Timestamp;
import java.util.List;

import models.GeneroModel;

public interface IRepositorioGeneros {
	
	public List<GeneroModel> getGeneros(Timestamp pTimestamp);
	public List<GeneroModel> getAllGeneros();

}
