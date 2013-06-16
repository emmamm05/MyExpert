/**
 * 
 */
package models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author emma
 *
 */

@XmlRootElement(name = "recomendation")
public class Recomendation implements IModel{
	private String  mAutor;
	private int     mTipoAutor;
	private String  mDestinatario;
	private String  mFecha;
	private boolean mProcessed;
	private boolean mAnswered;
	
	/**
	 * @return the mAutor
	 */
	@XmlElement
	public String getAutor() {
		return mAutor;
	}
	/**
	 * @return the mTipoAutor
	 */
	@XmlElement
	public int getTipoAutor() {
		return mTipoAutor;
	}
	/**
	 * @return the mDestinatario
	 */
	@XmlElement
	public String getDestinatario() {
		return mDestinatario;
	}
	/**
	 * @return the mFecha
	 */
	@XmlElement
	public String getFecha() {
		return mFecha;
	}
	/**
	 * @return the mProcessed
	 */
	@XmlElement
	public boolean isProcessed() {
		return mProcessed;
	}
	/**
	 * @return the mAnswered
	 */
	@XmlElement
	public boolean isAnswered() {
		return mAnswered;
	}
	/**
	 * @param mAutor the mAutor to set
	 */
	public void setAutor(String mAutor) {
		this.mAutor = mAutor;
	}
	/**
	 * @param mTipoAutor the mTipoAutor to set
	 */
	public void setTipoAutor(int mTipoAutor) {
		this.mTipoAutor = mTipoAutor;
	}
	/**
	 * @param mDestinatario the mDestinatario to set
	 */
	public void setDestinatario(String mDestinatario) {
		this.mDestinatario = mDestinatario;
	}
	/**
	 * @param mFecha the mFecha to set
	 */
	public void setFecha(String mFecha) {
		//Validar Formato
		this.mFecha = mFecha;
	}
	/**
	 * @param mProcessed the mProcessed to set
	 */
	public void setProcessed(boolean mProcessed) {
		this.mProcessed = mProcessed;
	}
	/**
	 * @param mAnswered the mAnswered to set
	 */
	public void setAnswered(boolean mAnswered) {
		this.mAnswered = mAnswered;
	}
	
}
