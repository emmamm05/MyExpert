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

	private String mCodigo;
	private String mNombre;
	private String mDescripcion;
	private boolean mEnabled;
	
	/**
	 * Constructor
	 */
	public GeneroModel(){
		
	}

	/**
	 * @return the mId
	 */
	@XmlElement
	public String getCodigo() {
		return mCodigo;
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
	public void setCodigo(String pCodigo) {
		this.mCodigo = pCodigo;
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
	
	public void setEnabled(boolean pEnabled){
		this.mEnabled = pEnabled;
	}
	
	@XmlElement
	public boolean getEnabled(){
		return this.mEnabled;
	}
	
}
