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
@XmlRootElement(name = "ResennaModel")
public class ResennaModel{
	
	private String mTitulo;
	private String mContenido;
	private String mAutor;
	private String mCodigoAutor;
	private String mCodigoTitulo;
	private Timestamp mFechaDePublicacion;
	private float mCalificacionDeExperto;
	private String mTitulo;
	
	/**
	 * Constructor
	 */
	
	public ResennaModel(){
		
	}

	/**
	 * @return the mId
	 */
	@XmlElement(name="CodigoExperto")
	public String getCodigoAutor() {
		return mCodigoAutor;
	}

	/**
	 * @param pCodigoAutor the mId to set
	 */
	public void setCodigoAutor(String pCodigoAutor) {
		this.mCodigoAutor = pCodigoAutor;
	}

	/**
	 * @return the mContenido
	 */
	@XmlElement(name="ContenidoResenna")
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
	@XmlElement(name="NombreExperto")
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
	@XmlElement(name="CodigoTitulo")
	public String getCodigoTitulo() {
		return mCodigoTitulo;
	}

	/**
	 * @param mIdAutor the mIdAutor to set
	 */
	public void setCodigoTitulo(String pCodigoTitulo) {
		this.mCodigoTitulo = pCodigoTitulo;
	}

	/**
	 * @return the mFechaDePublicacion
	 */
	@XmlElement(name="FechaCalificacion")
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
	@XmlElement(name="Calificacion")
	public float getCalificacionDeExperto() {
		return mCalificacionDeExperto;
	}

	/**
	 * @param mCalificacionDeExperto the mCalificacionDeExperto to set
	 */
	public void setCalificacionDeExperto(float mCalificacionDeExperto) {
		this.mCalificacionDeExperto = mCalificacionDeExperto;
	}
	
	public void setTitulo( String pTitulo ){
		mTitulo = pTitulo;
	}
	
	@XmlElement
	public String getTitulo(){
		return mTitulo;
	}
}
