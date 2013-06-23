package logic;

import java.util.List;

import models.UsuarioModel;

public interface ICuentaLogic {

	public void RegistrarNuevoUsuario( UsuarioModel pUsuario );
	public void ConfigurarCuenta( UsuarioModel pUsuario );
	public void DarDeBaja( UsuarioModel pUsuario );
	public void ReincorporarUsuario( UsuarioModel pUsuario );
	public List<UsuarioModel> getAllExpertos();
}
