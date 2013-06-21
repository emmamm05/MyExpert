package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosDataAccess extends Conexion implements IUsuariosDataAccess{

	UsuariosDataAccess(){
		super.crearConexion();
	}
	
	@Override
	public ResultSet queryUsersByUserPass(String pUsername, String pPassword) throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement stmt = 
			this.getConexion().prepareStatement("{call dbo.sprVerificaUsuario(?,?)}");
		stmt.setString(1, pUsername);
		stmt.setString(2, pPassword);
		
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			System.out.println( "Querying user" + rs.getString(1) );
		}		
		return null;
	}
	
}
