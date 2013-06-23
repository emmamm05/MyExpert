package logic;

import models.RecomendacionModel;
import models.UsuarioModel;

public interface IBuzonLogic {
	
	public void getSolicitudes(UsuarioModel pUsuario);
	public void getRecomendacion(RecomendacionModel pRecomendacion);
	public void responderMensaje(RecomendacionModel pRecomendacion);
	public void addRecomendacion(RecomendacionModel pRecomendacion);
	
}
