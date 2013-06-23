package logic;

import models.UsuarioModel;

public interface ICuentaLogic {

	public void RegistrarNuevoUsuario( UsuarioModel pUsuario );
	public void ConfigurarCuenta( UsuarioModel pUsuario );
	public void DarDeBaja( UsuarioModel pUsuario );
	public void ReincorporarUsuario( UsuarioModel pUsuario );
}
