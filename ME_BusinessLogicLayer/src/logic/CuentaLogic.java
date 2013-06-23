package logic;

import java.util.List;

import repositories.IRepositorioUsuarios;
import repositories.RepositoriosFactory;

import models.UsuarioModel;

public class CuentaLogic implements ICuentaLogic {

	@Override
	public void RegistrarNuevoUsuario(UsuarioModel pUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ConfigurarCuenta(UsuarioModel pUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void DarDeBaja(UsuarioModel pUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ReincorporarUsuario(UsuarioModel pUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UsuarioModel> getAllExpertos() {
		RepositoriosFactory factory = new RepositoriosFactory();
		IRepositorioUsuarios repositorio = factory.createRepositorioUsuarios();
		return repositorio.getAllExpertos();
	}
	

}
