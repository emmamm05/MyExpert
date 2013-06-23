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

@XmlRootElement(name = "recomendacion")
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
	
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	@XmlElement
	public String getmDescripcion() {
		return mDescripcion;
	}
	public void setmDescripcion(String mDescripcion) {
		this.mDescripcion = mDescripcion;
	}
	@XmlElement
	public int getmAnno() {
		return mAnno;
	}
	public void setmAnno(int mAnno) {
		this.mAnno = mAnno;
	}
	@XmlElement
	public String getmCodigoTitulo() {
		return mCodigoTitulo;
	}
	public void setmCodigoTitulo(String mCodigoTitulo) {
		this.mCodigoTitulo = mCodigoTitulo;
	}
	@XmlElement
	public String getmCodigoGenero() {
		return mCodigoGenero;
	}
	public void setmCodigoGenero(String mCodigoGenero) {
		this.mCodigoGenero = mCodigoGenero;
	}
	@XmlElement
	public String getmCodigoSolicitante() {
		return mCodigoSolicitante;
	}
	public void setmCodigoSolicitante(String mCodigoSolicitante) {
		this.mCodigoSolicitante = mCodigoSolicitante;
	}
	@XmlElement
	public String getmNombreSolicitante() {
		return mNombreSolicitante;
	}
	public void setmNombreSolicitante(String mNombreSolicitante) {
		this.mNombreSolicitante = mNombreSolicitante;
	}
	@XmlElement
	public int getmEstado() {
		return mEstado;
	}
	public void setmEstado(int mEstado) {
		this.mEstado = mEstado;
	}
	@XmlElement
	public String getmCodigoExperto() {
		return mCodigoExperto;
	}
	public void setmCodigoExperto(String mCodigoExperto) {
		this.mCodigoExperto = mCodigoExperto;
	}
	@XmlElement
	public String getmTimestamp() {
		return mTimestamp;
	}
	public void setmTimestamp(String mTimestamp) {
		this.mTimestamp = mTimestamp;
	}
	

}
