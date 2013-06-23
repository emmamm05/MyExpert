/**
 * 
 */
package models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author emma
 *
 */

@XmlRootElement(name = "Recomendacion")
public class RecomendacionModel implements Serializable{
	private int     mId;
	private String  mDescripcion;
	private int     mAnno;
	private String  mCodigoTitulo;
	private String  mCodigoGenero;
	private String  mCodigoSolicitante;
	private String  mNombreSolicitante;
	private int 	mEstado;
	private String  mCodigoExperto;
	private String  mTimestamp;
	
	public int getId() {
		return mId;
	}
	public void setId(int pId) {
		this.mId = pId;
	}
	@XmlElement
	public String getDescripcion() {
		return mDescripcion;
	}
	@XmlElement
	public int getAnno() {
		return mAnno;
	}
	@XmlElement
	public String getCodigoTitulo() {
		return mCodigoTitulo;
	}
	@XmlElement
	public String getCodigoGenero() {
		return mCodigoGenero;
	}
	@XmlElement
	public String getCodigoSolicitante() {
		return mCodigoSolicitante;
	}
	@XmlElement
	public String getmNombreSolicitante() {
		return mNombreSolicitante;
	}
	@XmlElement
	public int getmEstado() {
		return mEstado;
	}
	@XmlElement
	public String getmCodigoExperto() {
		return mCodigoExperto;
	}
	@XmlElement
	public String getmTimestamp() {
		return mTimestamp;
	}
	public void setDescripcion(String mDescripcion) {
		this.mDescripcion = mDescripcion;
	}
	public void setmAnno(int mAnno) {
		this.mAnno = mAnno;
	}
	public void setCodigoTitulo(String mCodigoTitulo) {
		this.mCodigoTitulo = mCodigoTitulo;
	}
	public void setCodigoGenero(String mCodigoGenero) {
		this.mCodigoGenero = mCodigoGenero;
	}
	public void setCodigoSolicitante(String mCodigoSolicitante) {
		this.mCodigoSolicitante = mCodigoSolicitante;
	}
	public void setmNombreSolicitante(String mNombreSolicitante) {
		this.mNombreSolicitante = mNombreSolicitante;
	}
	public void setmEstado(int mEstado) {
		this.mEstado = mEstado;
	}
	public void setmCodigoExperto(String mCodigoExperto) {
		this.mCodigoExperto = mCodigoExperto;
	}
	public void setmTimestamp(String mTimestamp) {
		this.mTimestamp = mTimestamp;
	}
	

}
