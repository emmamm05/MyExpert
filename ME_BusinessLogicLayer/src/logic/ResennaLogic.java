package logic;

import java.util.List;

import repositories.RepositoriosFactory;

import models.ResennaModel;

public class ResennaLogic implements IResennaLogic {

	@Override
	public void crearResenna(ResennaModel pResenna) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ResennaModel> getResennas(String pCodigoTitulo) {
		// TODO Auto-generated method stub
		RepositoriosFactory repoFactory = new RepositoriosFactory();
		return  repoFactory
					.createRepositorioTitulos()
					.getResennas(pCodigoTitulo);
	}

	@Override
	public void getResennaCompleta(ResennaModel pResenna) {
		// TODO Auto-generated method stub
		RepositoriosFactory repoFactory = new RepositoriosFactory();
		repoFactory.createRepositorioTitulos().getResennaCompleta(pResenna);
	}

}
