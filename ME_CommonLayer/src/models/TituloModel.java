/**
 * 
 */
package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author emma
 *
 */
@XmlRootElement(name = "titulo")
public class TituloModel implements IModel, Serializable{
	
	int mId;
	String mNombre;
	String mDescripcion;
	String mDirectores;
	Date mDateTime;
	HashMap<Integer,Integer> mCalificacionesExpertos;
	int mCalificacionComunidad;
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
	 * @return the mDirectores
	 */
	@XmlElement
	public String getDirectores() {
		return mDirectores;
	}
	/**
	 * @return the mDateTime
	 */
	public Date getDateTime() {
		return mDateTime;
	}
	/**
	 * TODO: Tal vez sea necesario un adapter aqui
	 * @return the mCalificacionesExpertos
	 */
	public HashMap<Integer, Integer> getCalificacionesExpertos() {
		return mCalificacionesExpertos;
	}
	/**
	 * @return the mCalificacionComunidad
	 */
	@XmlElement
	public int getCalificacionComunidad() {
		return mCalificacionComunidad;
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
	/**
	 * @param mDirectores the mDirectores to set
	 */
	public void setDirectores(String mDirectores) {
		this.mDirectores = mDirectores;
	}
	/**
	 * @param mDateTime the mDateTime to set
	 */
	public void setDateTime(Date mDateTime) {
		this.mDateTime = mDateTime;
	}
	/**
	 * @param mCalificacionesExpertos the mCalificacionesExpertos to set
	 */
	public void setCalificacionesExpertos(
			HashMap<Integer, Integer> mCalificacionesExpertos) {
		this.mCalificacionesExpertos = mCalificacionesExpertos;
	}
	/**
	 * @param mCalificacionComunidad the mCalificacionComunidad to set
	 */
	public void setCalificacionComunidad(int mCalificacionComunidad) {
		this.mCalificacionComunidad = mCalificacionComunidad;
	}
	
}
