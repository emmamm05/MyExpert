package models;

import java.io.Serializable;
import java.security.Timestamp;
import java.sql.Date;

/**
 * 
 * @author Luis Alonso
 *
 */
public class PeliculaModel extends TituloModel implements Serializable {
	
	private float mDuracion;
	private Date mFechaDePublicacion;
	
	/**
	 * Constructor
	 */
	public PeliculaModel(){
		
	}

	/**
	 * @return the mDuracion
	 */
	public float getDuracion() {
		return mDuracion;
	}

	/**
	 * @param mDuracion the mDuracion to set
	 */
	public void setDuracion(float mDuracion) {
		this.mDuracion = mDuracion;
	}

	/**
	 * @return the mFechaDePublicacion
	 */
	public Date getFechaDePublicacion() {
		return mFechaDePublicacion;
	}

	/**
	 * @param mFechaDePublicacion the mFechaDePublicacion to set
	 */
	public void setFechaDePublicacion(Date mFechaDePublicacion) {
		this.mFechaDePublicacion = mFechaDePublicacion;
	}
}
