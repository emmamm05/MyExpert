package models;

import java.util.HashMap;
import java.util.List;
import java.sql.Date;
import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Encargada de manejar toda la informacion conrrespondiente de determinado titulo
 * @author Luis Alonso
 *
 */
 @XmlRootElement(name = "titulomodel")
public class TituloModel{
	
	private String mNombre;
	private String mDescripcion;
	private String mCodigo;
	private int mAnno;
	private String mDirector;
	private int mAnno;
	private HashMap<Integer, Integer> mCalificacionExpertos;
	private int mCalificacionesIMDB;
	private int mCalificacionesComunidad;
	private List<ResennaModel> mResennas;
	private ResennaModel mResenna;
	private GeneroModel mGenero;
	private String mLinkYoutube;
	private int mTipoDeTitulo;
	private Date mFechaCreacion;
	private String mImagen;
	
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
	public HashMap<Integer, Integer> getCalificacionExpertos() {
		return mCalificacionExpertos;
	}

	/**
	 * @param mGenero the mGenero to set
	 */
	public void setCalificacionExpertos(HashMap<Integer, Integer> mCalificacionExpertos) {
		this.mCalificacionExpertos = mCalificacionExpertos;
	}

	/**
	 * @return the mCalificacionesIMDB
	 */
	 @XmlElement
	public int getCalificacionesIMDB() {
		return mCalificacionesIMDB;
	}

	public void setCodigo(String mCodigo) {
		this.mCodigo = mCodigo;
	}

	/**
	 * @return the mCalificacionesComunidad
	 */
	 @XmlElement
	public int getCalificacionesComunidad() {
		return mCalificacionesComunidad;
	}

	public void setCalificacionesComunidad(int mCalificacionesComunidad) {
		this.mCalificacionesComunidad = mCalificacionesComunidad;
	}
	
	@XmlElement
	public List<ResennaModel> getResennas() {
		return mResennas;
	}

	public void setmResennas(List<ResennaModel> Resennas) {
		this.mResennas = mResennas;
	}

	/**
	 * @return the mResenna
	 */
	@XmlElement
	public Date getFechaCreacion() {
		return mFechaCreacion;
	}

	public void setFechaCreacion(Date mFechaCreacion) {
		this.mFechaCreacion = mFechaCreacion;
	}

	/**
	 * @return the mGenero
	 */
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

	/**
	 * @return the mLinkYouTube
	 */
	 @XmlElement
	public String getLinkYouTube() {
		return mLinkYouTube;
	}

	/**
	 * @param mLinkYouTube the mLinkYouTube to set
	 */
	public void setLinkYouTube(String mLinkYouTube) {
		this.mLinkYouTube = mLinkYouTube;
	}
	
	/**
	 * @return the mTipoDeTitulo
	 */
	 @XmlElement
	public int getTipoDeTitulo() {
		return mTipoDeTitulo;
	}



	/**
	 * @param mTipoDeTitulo the mTipoDeTitulo to set
	 */
	public void setTipoDeTitulo(int mTipoDeTitulo) {
		this.mTipoDeTitulo = mTipoDeTitulo;
	}
}
