/**
 * 
 */
package models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author emma
 *
 */
@XmlRootElement(name = "genero")
public class GeneroModel {

	private int    mId;
	private String mNombre;
	private String mDescripcion;
	
	/**
	 * Constructor
	 */
	public GeneroModel(){
		
	}

	/**
	 * @return the mId
	 */
	@XmlElement
	public int getId() {
		return mId;
	}
	/**
	 * @return the mNombre
	 */
	@XmlElement
	public String getNombre() {
		return mNombre;
	}
	/**
	 * @return the mDescripcion
	 */
	@XmlElement
	public String getDescripcion() {
		return mDescripcion;
	}
	/**
	 * @param mId the mId to set
	 */
	public void setId(int mId) {
		this.mId = mId;
	}
	/**
	 * @param mNombre the mNombre to set
	 */
	public void setNombre(String mNombre) {
		this.mNombre = mNombre;
	}
	/**
	 * @param mDescripcion the mDescripcion to set
	 */
	public void setDescripcion(String mDescripcion) {
		this.mDescripcion = mDescripcion;
	}
	
}
