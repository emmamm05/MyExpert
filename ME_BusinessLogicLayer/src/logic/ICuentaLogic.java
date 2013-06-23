package logic;


import models.RegistroModel;
import java.util.List;
import models.UsuarioModel;

public interface ICuentaLogic {
	
	public boolean registrarNuevoUsuario(RegistroModel pUserRegister);
	public boolean configurarCuentaDeUsuario(UsuarioModel pUser);

	public void RegistrarNuevoUsuario( UsuarioModel pUsuario );
	public void ConfigurarCuenta( UsuarioModel pUsuario );
	public void DarDeBaja( UsuarioModel pUsuario );
	public void ReincorporarUsuario( UsuarioModel pUsuario );
	public List<UsuarioModel> getAllExpertos();
}
