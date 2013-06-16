package models;

import java.security.Timestamp;

/**
 * 
 * @author Luis Alonso
 *
 */
public class PelicualModel extends TituloModel implements IModel {
	
	private long mDuracion;
	private Timestamp mFechaDePublicacion;
	
	/**
	 * Constructor
	 */
	public PelicualModel(){
		
	}

	/**
	 * @return the mDuracion
	 */
	public long getDuracion() {
		return mDuracion;
	}

	/**
	 * @param mDuracion the mDuracion to set
	 */
	public void setDuracion(long mDuracion) {
		this.mDuracion = mDuracion;
	}

	/**
	 * @return the mFechaDePublicacion
	 */
	public Timestamp getFechaDePublicacion() {
		return mFechaDePublicacion;
	}

	/**
	 * @param mFechaDePublicacion the mFechaDePublicacion to set
	 */
	public void setFechaDePublicacion(Timestamp mFechaDePublicacion) {
		this.mFechaDePublicacion = mFechaDePublicacion;
	}
}
