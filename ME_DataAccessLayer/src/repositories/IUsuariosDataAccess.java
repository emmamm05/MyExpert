package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import models.UsuarioModel;

public interface IUsuariosDataAccess {

	public ResultSet verificaLoginUsuario(String pUser, String pPass) throws SQLException;
	public boolean registraNuevoUsuario( String puser, String pPass, String pEmail, String pRol );
	public boolean guardarInformacionAdicional( String pUsername, String pNombre, String pPais, String pGenero, String pGeneros, String pExperiencia, String pMail, String pDate );
	public ResultSet actualizarInformacionAdicional(String pUsername, String pNombre, String pPais, String pGenero, String pGeneros, String pExperiencia, String pMail );
	public ResultSet getPerfil( String pUsername );
	public ResultSet cambiarClave( String pUsername, String pPassword );
	public ResultSet getSolicitud( String pCodigoExperto, String pCodigoSolicitante, String pTimestamp );
	public ResultSet getAllExpertos() throws SQLException;
	public ResultSet getGeneros();
}
