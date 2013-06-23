package logic;

import java.sql.Timestamp;
import java.util.List;


import models.GeneroModel;
import models.PuntuacionesXmlModel;
import models.TituloModel;

import repositories.RepositoriosFactory;

public class CatalogosLogic implements ICatalogosLogic {
	
	public CatalogosLogic(){
		
	}

	public List<GeneroModel> getGeneros(Timestamp pTimestamp) {
		
		RepositoriosFactory repoFactory = new RepositoriosFactory();
		return  repoFactory
					.createRepositorioGeneros()
					.getGeneros(pTimestamp);

	}
	
	public List<GeneroModel> getAllGeneros() {
		
		RepositoriosFactory repoFactory = new RepositoriosFactory();
		return  repoFactory
					.createRepositorioGeneros()
					.getAllGeneros();

	}

	public List<TituloModel> getTitulos(Timestamp pTimestamp) {
		// TODO Auto-generated method stub
		RepositoriosFactory repoFactory = new RepositoriosFactory();
		return  repoFactory
					.createRepositorioTitulos()
					.getTitulos(pTimestamp);
	}

	public List<TituloModel> getAllTitulos() {
		// TODO Auto-generated method stub
		RepositoriosFactory repoFactory = new RepositoriosFactory();
		return  repoFactory
					.createRepositorioTitulos()
					.getAllTitulos();
	}

	@Override
	public boolean addGenero(GeneroModel pGenero, String pUsuario) {
		// TODO Auto-generated method stub
		RepositoriosFactory repoFactory = new RepositoriosFactory();		
		return  repoFactory
				.createRepositorioGeneros()
				.addGenero(pGenero, pUsuario);
	}

	@Override
	public boolean deshabilitarGenero(String pCodigo) {
		// TODO Auto-generated method stub
		RepositoriosFactory repoFactory = new RepositoriosFactory();
		return repoFactory
				.createRepositorioGeneros()
				.deshabilitarGenero(pCodigo);
	}
	
	@Override
	public boolean habilitarGenero(String pCodigo) {
		// TODO Auto-generated method stub
		RepositoriosFactory repoFactory = new RepositoriosFactory();
		return repoFactory
				.createRepositorioGeneros()
				.habilitarGenero(pCodigo);
	}

	@Override
	public boolean getGenero(GeneroModel pGenero) {
		// TODO Auto-generated method stub
		RepositoriosFactory repoFactory = new RepositoriosFactory();
		return repoFactory
				.createRepositorioGeneros()
				.getGenero(pGenero);
	}

	@Override
	public boolean editGenero(GeneroModel pGenero, String pUsuario) {
		// TODO Auto-generated method stub
		RepositoriosFactory repoFactory = new RepositoriosFactory();
		return repoFactory
				.createRepositorioGeneros()
				.editGenero(pGenero, pUsuario);
	}

	@Override
	public void getAllPuntaciones(PuntuacionesXmlModel pModel) {
		RepositoriosFactory repoFactory = new RepositoriosFactory();
		repoFactory.createRepositorioTitulos().getPuntuaciones(pModel);
	}
	

}
