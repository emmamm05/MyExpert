package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import models.UsuarioModel;

public interface IUsuariosDataAccess {

	public ResultSet verificaLoginUsuario(String pUser, String pPass) throws SQLException;
	public ResultSet registraNuevoUsuario( String puser, String pPass, String pEmail, String pRol );
	public ResultSet guardarInformacionAdicional( Object[] pParams );
	public ResultSet actualizarInformacionAdicional( Object[] pParams );
	public ResultSet getPerfil( String pUsername );
	public ResultSet cambiarClave( String pUsername, String pPassword );
}
