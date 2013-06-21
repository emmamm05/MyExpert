package repositories;

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
	
	//private static String mNombre = "jdbc:odbc:MyExpert://localhost:1433";
	private static String mNombre = "jdbc:sqlserver://localhost:1433;databaseName=MyExpert;user=emma;password=1234";
	
	private Connection mConexion;
	private Statement mSentencia;
	private CallableStatement mCallableSentence;
	
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
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			this.mConexion = DriverManager.getConnection(mNombre);
			this.mSentencia = this.mConexion.createStatement();
		}catch(Exception e){
			System.out.println("Error al conectarse con la base de datos");
			e.printStackTrace();
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
	public CallableStatement getCallableSentence() {
		return mCallableSentence;
	}

	/**
	 * @param pCallableSentence the mSentencia_2 to set
	 */
	public void setCallableSentence(CallableStatement pCallableSentence) {
		this.mCallableSentence = pCallableSentence;
	}
	
}
