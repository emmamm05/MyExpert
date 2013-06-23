package logic;

import repositories.RepositoriosFactory;
import models.RecomendacionModel;
import models.UsuarioModel;

public class BuzonLogic implements IBuzonLogic {

	@Override
	public void getSolicitudes(UsuarioModel pUsuario) {
		
	}

	@Override
	public void getRecomendacion(RecomendacionModel pRecomendacion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void responderMensaje(RecomendacionModel pRecomendacion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRecomendacion(RecomendacionModel pRecomendacion) {
		RepositoriosFactory factory = new RepositoriosFactory();
		factory.createRepositorioRecomendaciones().addNuevaRecomendacion(pRecomendacion);		
	}

	
	
}
