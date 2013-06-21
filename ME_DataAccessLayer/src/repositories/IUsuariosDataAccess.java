package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IUsuariosDataAccess {

	public ResultSet queryUsersByUserPass(String pUser, String pPass) throws SQLException;
}
