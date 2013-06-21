package models;

import java.sql.Timestamp;

/**
 * Se encarga de manejar los datos de temporada de una serie en
 * particular
 * @author Luis Alonso
 *
 */
public class TemporadaModel extends TituloModel{
	
	private Timestamp mFechaDeLanzamiento;
	private Timestamp mFechaDeConclusion;
	
	/**
	 * Constructor
	 */
	public TemporadaModel(){
		
	}

	/**
	 * @return the mFechaDeLanzamiento
	 */
	public Timestamp getFechaDeLanzamiento() {
		return mFechaDeLanzamiento;
	}

	/**
	 * @param mFechaDeLanzamiento the mFechaDeLanzamiento to set
	 */
	public void setFechaDeLanzamiento(Timestamp mFechaDeLanzamiento) {
		this.mFechaDeLanzamiento = mFechaDeLanzamiento;
	}

	/**
	 * @return the mFechaDeConclusion
	 */
	public Timestamp getFechaDeConclusion() {
		return mFechaDeConclusion;
	}

	/**
	 * @param mFechaDeConclusion the mFechaDeConclusion to set
	 */
	public void setFechaDeConclusion(Timestamp mFechaDeConclusion) {
		this.mFechaDeConclusion = mFechaDeConclusion;
	}
}
