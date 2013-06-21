package models;

import java.sql.Timestamp;
import java.util.HashMap;

/**
 * Encargada de manejar toda la informacion conrrespondiente de determinado titulo
 * @author Luis Alonso
 *
 */
public class TituloModel{
	
	private int mID;
	private String mNombre;
	private String mDescripcion;
	private String mDirector;
	private Timestamp mAnno;
	private HashMap<Integer, Integer> mCalificacionExpertos;
	private int mCalificacionesIMDB;
	private int mCalificacionesComunidad;
	private ResennaModel mResenna;
	private GeneroModel mGenero;
	
	/**
	 * Constructor
	 */
	public TituloModel(){
		
	}

	/**
	 * @return the mID
	 */
	public int getID() {
		return mID;
	}

	/**
	 * @param mID the mID to set
	 */
	public void setID(int mID) {
		this.mID = mID;
	}

	/**
	 * @return the mNombre
	 */
	public String getNombre() {
		return mNombre;
	}

	/**
	 * @param mNombre the mNombre to set
	 */
	public void setNombre(String mNombre) {
		this.mNombre = mNombre;
	}

	/**
	 * @return the mAnno
	 */
	public Timestamp getAnno() {
		return mAnno;
	}

	/**
	 * @param mAnno the mAnno to set
	 */
	public void setAnno(Timestamp mAnno) {
		this.mAnno = mAnno;
	}

	/**
	 * @return the mDescripcion
	 */
	public String getDescripcion() {
		return mDescripcion;
	}

	/**
	 * @param mDescripcion the mDescripcion to set
	 */
	public void setDescripcion(String mDescripcion) {
		this.mDescripcion = mDescripcion;
	}

	/**
	 * @return the mDirector
	 */
	public String getDirector() {
		return mDirector;
	}

	/**
	 * @param mDirector the mDirector to set
	 */
	public void setDirector(String mDirector) {
		this.mDirector = mDirector;
	}

	/**
	 * @return the mCalificacionExpertos
	 */
	public HashMap<Integer, Integer> getCalificacionExpertos() {
		return mCalificacionExpertos;
	}

	/**
	 * @param mCalificacionExpertos the mCalificacionExpertos to set
	 */
	public void setCalificacionExpertos(HashMap<Integer, Integer> mCalificacionExpertos) {
		this.mCalificacionExpertos = mCalificacionExpertos;
	}

	/**
	 * @return the mCalificacionesIMDB
	 */
	public int getCalificacionesIMDB() {
		return mCalificacionesIMDB;
	}

	/**
	 * @param mCalificacionesIMDB the mCalificacionesIMDB to set
	 */
	public void setCalificacionesIMDB(int mCalificacionesIMDB) {
		this.mCalificacionesIMDB = mCalificacionesIMDB;
	}

	/**
	 * @return the mCalificacionesComunidad
	 */
	public int getCalificacionesComunidad() {
		return mCalificacionesComunidad;
	}

	/**
	 * @param mCalificacionesComunidad the mCalificacionesComunidad to set
	 */
	public void setCalificacionesComunidad(int mCalificacionesComunidad) {
		this.mCalificacionesComunidad = mCalificacionesComunidad;
	}

	/**
	 * @return the mResenna
	 */
	public ResennaModel getResenna() {
		return mResenna;
	}

	/**
	 * @param mResenna the mResenna to set
	 */
	public void setResenna(ResennaModel mResenna) {
		this.mResenna = mResenna;
	}

	/**
	 * @return the mGenero
	 */
	public GeneroModel getGenero() {
		return mGenero;
	}

	/**
	 * @param mGenero the mGenero to set
	 */
	public void setGenero(GeneroModel mGenero) {
		this.mGenero = mGenero;
	}
}
