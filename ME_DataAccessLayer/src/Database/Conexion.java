package Database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 
 * @author Luis Alonso
 *
 */
public class Conexion {
	
	private static String mNombre = "jdbc:odbc:MyCinema";
	private Connection mConexion;
	private Statement mSentencia;
	private CallableStatement mSentencia_2;
	
	public Conexion(){
		
	}

	/**
	 * @return the mNombre
	 */
	public static String getNombre() {
		return mNombre;
	}

	/**
	 * @param mNombre the mNombre to set
	 */
	public static void setNombre(String mNombre) {
		Conexion.mNombre = mNombre;
	}

	/**
	 * @return the mConexion
	 */
	public Connection getConexion() {
		return mConexion;
	}

	/**
	 * @param mConexion the mConexion to set
	 */
	public void setConexion(Connection mConexion) {
		this.mConexion = mConexion;
	}

	/**
	 * @return the mSentencia
	 */
	public Statement getSentencia() {
		return mSentencia;
	}

	/**
	 * @param mSentencia the mSentencia to set
	 */
	public void setSentencia(Statement mSentencia) {
		this.mSentencia = mSentencia;
	}
	
	/**
	 * Se encarga de establecer la conexion con la base de datos
	 * de MyExpert
	 */
	public void crearConexion(){
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			this.mConexion = DriverManager.getConnection(this.mNombre.toString());
			this.mSentencia = this.mConexion.createStatement();
		}catch(Exception e){
			System.out.println("Error al conectarse con la base de datos");
		}
		
	}
	
	/**
	 * Se encarga de cerrar la conexion con la base
	 * de datos de MyExpert
	 */
	public void cerrarConexion(){
		try{
			this.mConexion.close();
			this.mSentencia.close();
		}catch(Exception e){
			System.out.println("Error al tratar de cerra la base de datos");
		}
	}

	/**
	 * @return the mSentencia_2
	 */
	public CallableStatement getSentencia_2() {
		return mSentencia_2;
	}

	/**
	 * @param mSentencia_2 the mSentencia_2 to set
	 */
	public void setSentencia_2(CallableStatement mSentencia_2) {
		this.mSentencia_2 = mSentencia_2;
	}
	
}
