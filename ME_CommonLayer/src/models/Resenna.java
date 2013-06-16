/**
 * 
 */
package models;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author emma
 *
 */
@XmlRootElement(name = "resenna")
public class Resenna {
	
	int    mId;
	int    mIdExperto;
	String mContenido;
	String mNombreAutor;
	Date   mFechaPublicacion;
	/**
	 * @return the mId
	 */
	@XmlElement
	public int getId() {
		return mId;
	}
	/**
	 * @return the mIdExperto
	 */
	@XmlElement
	public int getIdExperto() {
		return mIdExperto;
	}
	/**
	 * @return the mContenido
	 */
	@XmlElement
	public String getContenido() {
		return mContenido;
	}
	/**
	 * @return the mNombreAutor
	 */
	@XmlElement
	public String getNombreAutor() {
		return mNombreAutor;
	}
	/**
	 * @return the mFechaPublicacion
	 */
	@XmlElement
	public Date getFechaPublicacion() {
		return mFechaPublicacion;
	}
	/**
	 * @param mId the mId to set
	 */
	public void setId(int mId) {
		this.mId = mId;
	}
	/**
	 * @param mIdExperto the mIdExperto to set
	 */
	public void setIdExperto(int mIdExperto) {
		this.mIdExperto = mIdExperto;
	}
	/**
	 * @param mContenido the mContenido to set
	 */
	public void setContenido(String mContenido) {
		this.mContenido = mContenido;
	}
	/**
	 * @param mNombreAutor the mNombreAutor to set
	 */
	public void setNombreAutor(String mNombreAutor) {
		this.mNombreAutor = mNombreAutor;
	}
	/**
	 * @param mFechaPublicacion the mFechaPublicacion to set
	 */
	public void setFechaPublicacion(Date mFechaPublicacion) {
		this.mFechaPublicacion = mFechaPublicacion;
	}
	
	
	
}
