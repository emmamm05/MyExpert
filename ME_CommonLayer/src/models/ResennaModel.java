package models;

import java.sql.Timestamp;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Encargada de los datos de resenna de determinado titulo
 * @author Luis Alonso
 *
 */
@XmlRootElement(name = "resenna")
public class ResennaModel implements IModel {
	
	private int mId;
	private String mContenido;
	private String mAutor;
	private int mIdAutor;
	private Timestamp mFechaDePublicacion;
	private int mCalificacionDeExperto;
	
	/**
	 * Constructor
	 */
	
	public ResennaModel(){
		
	}

	/**
	 * @return the mId
	 */
	@XmlElement
	public int getId() {
		return mId;
	}

	/**
	 * @param mId the mId to set
	 */
	public void setId(int mId) {
		this.mId = mId;
	}

	/**
	 * @return the mContenido
	 */
	@XmlElement
	public String getContenido() {
		return mContenido;
	}

	/**
	 * @param mContenido the mContenido to set
	 */
	public void setContenido(String mContenido) {
		this.mContenido = mContenido;
	}

	/**
	 * @return the mAutor
	 */
	@XmlElement
	public String getAutor() {
		return mAutor;
	}

	/**
	 * @param mAutor the mAutor to set
	 */
	public void setAutor(String mAutor) {
		this.mAutor = mAutor;
	}

	/**
	 * @return the mIdAutor
	 */
	@XmlElement
	public int getIdAutor() {
		return mIdAutor;
	}

	/**
	 * @param mIdAutor the mIdAutor to set
	 */
	public void setIdAutor(int mIdAutor) {
		this.mIdAutor = mIdAutor;
	}

	/**
	 * @return the mFechaDePublicacion
	 */
	@XmlElement
	public Timestamp getFechaDePublicacion() {
		return mFechaDePublicacion;
	}

	/**
	 * @param mFechaDePublicacion the mFechaDePublicacion to set
	 */
	public void setFechaDePublicacion(Timestamp mFechaDePublicacion) {
		this.mFechaDePublicacion = mFechaDePublicacion;
	}

	/**
	 * @return the mCalificacionDeExperto
	 */
	@XmlElement
	public int getCalificacionDeExperto() {
		return mCalificacionDeExperto;
	}

	/**
	 * @param mCalificacionDeExperto the mCalificacionDeExperto to set
	 */
	public void setCalificacionDeExperto(int mCalificacionDeExperto) {
		this.mCalificacionDeExperto = mCalificacionDeExperto;
	}
}