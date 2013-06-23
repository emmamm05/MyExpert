package models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.imageio.ImageIO;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.HashMap;
import java.util.List;

/**
 * Encargada de manejar toda la informacion conrrespondiente de determinado titulo
 * @author Luis Alonso
 *
 */
@XmlRootElement(name = "titulo")
public class TituloModel{
	
	private String mNombre;
	private String mDescripcion;
	private String mCodigo;
	private int mAnno;
	private String mDirector;
	private List<ResennaModel> mResennas;
	private GeneroModel mGenero;
	private Date mFechaCreacion;
	private String mImagen;
	private String mLinkYoutube;
	
	/*
	 */
	
	public TituloModel(){
		
	}
	
	/*
	 */
	@XmlElement
	public String getNombre() {
		return mNombre;
	}

	/**
	 * @param mNombre the mNombre to set
	 */
	public void setNombre(String mNombre) {
		this.mNombre = mNombre;
	}

	/**
	 * @return the mAnno
	 */
	@XmlElement
	public int getAnno() {
		return mAnno;
	}

	/**
	 * @param mAnno the mAnno to set
	 */
	public void setAnno(int mAnno) {
		this.mAnno = mAnno;
	}

	/**
	 * @return the mDescripcion
	 */
	@XmlElement
	public String getDescripcion() {
		return mDescripcion;
	}

	/**
	 * @param mDescripcion the mDescripcion to set
	 */
	public void setDescripcion(String mDescripcion) {
		this.mDescripcion = mDescripcion;
	}

	/**
	 * @return the mDirector
	 */
	@XmlElement
	public String getDirector() {
		return mDirector;
	}

	/**
	 * @param mDirector the mDirector to set
	 */
	public void setDirector(String mDirector) {
		this.mDirector = mDirector;
	}

	/**
	 * @return the mGenero
	 */
	@XmlElement
	public GeneroModel getGenero() {
		return mGenero;
	}

	/**
	 * @param mGenero the mGenero to set
	 */
	public void setGenero(GeneroModel mGenero) {
		this.mGenero = mGenero;
	}

	@XmlElement
	public String getCodigo() {
		return mCodigo;
	}

	public void setCodigo(String mCodigo) {
		this.mCodigo = mCodigo;
	}

	@XmlElement
	public List<ResennaModel> getResennas() {
		return mResennas;
	}

	public void setmResennas(List<ResennaModel> Resennas) {
		this.mResennas = mResennas;
	}

	@XmlElement
	public Date getFechaCreacion() {
		return mFechaCreacion;
	}

	public void setFechaCreacion(Date mFechaCreacion) {
		this.mFechaCreacion = mFechaCreacion;
	}

	@XmlElement
	public String getImagen() {
		return mImagen;
	}

	public void setImagen(String mImagen) {
		this.mImagen = mImagen;
	}

	@XmlElement
	public String getLinkYoutube() {
		return mLinkYoutube;
	}

	public void setmLinkYoutube(String mLinkYoutube) {
		this.mLinkYoutube = mLinkYoutube;
	}
}
