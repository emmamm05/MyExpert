package repositories;

import java.util.List;

import models.RecomendacionModel;
import models.UsuarioModel;
import models.RegistroModel;

public interface IRepositorioUsuarios {

	public boolean verificaLoginUsuario( UsuarioModel pUsuarioModel );
	public boolean registraNuevoUsuario( RegistroModel pUsuarioModel );
	public boolean guardarInformacionAdicional( UsuarioModel pUsuario );
	public boolean actualizarInformacionAdicional( UsuarioModel pUsuario );
	public boolean getPerfilUsuario( UsuarioModel pUsuario );
	public boolean cambiarClave( UsuarioModel pUsuarioModel );	
	public void getSolicitud( RecomendacionModel pRecomendacion );
	public List<UsuarioModel> getAllExpertos();
}
