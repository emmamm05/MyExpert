package logic;

import models.UsuarioModel;

public interface IAutorizacionLogic {

	public boolean ValidarUsuario(UsuarioModel pLoginRequested, String pUuid);
	public UsuarioModel getLoggedUser(String pUuid);
	
}
