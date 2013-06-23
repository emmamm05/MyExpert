package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosDataAccess extends Conexion implements IUsuariosDataAccess{

	UsuariosDataAccess(){
		super.crearConexion();
	}

	@Override
	public ResultSet verificaLoginUsuario(String pUsername, String pPassword)
			throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement stmt = 
				this.getConexion().prepareStatement("{call dbo.sprVerificaUsuario(?,?)}");
		stmt.setString(1, pUsername);
		stmt.setString(2, pPassword);
		
		return stmt.executeQuery();			
	}

	@Override
	public ResultSet registraNuevoUsuario(String puser, String pPass,
			String pEmail, String pRol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet guardarInformacionAdicional(Object[] pParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet actualizarInformacionAdicional(Object[] pParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet getPerfil(String pUsername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet cambiarClave(String pUsername, String pPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet getSolicitud(String pCodigoExperto,
			String pCodigoSolicitante, String pTimestamp) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
