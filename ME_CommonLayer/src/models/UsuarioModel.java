package models;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;


/**
 * @author emma
 * Modelo de Usuario, Serializable como requisito para los views
 * TODO: Revisar cuales modelos no son leidos en los views para 
 * quitar el serializable
 */
public class UsuarioModel implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String  mUser;
	private String  mPwd;
	private String  mNombre;
	private String  mApellidos;
	private String  mFechaNacimiento;
	private String  mFechaDeRegistro;
	private String  mImagenPerfil;
	private boolean mEstado;
	private int		mPuntuacion;
	private String  mEmail;
	private String  mGenero;
	private String  mPais;
	private String  mExperiencia;
	private String  mGeneros;
	private int     mRol;
	private HashMap<Integer,RecomendacionModel>  mBuzon;
	

	public static final int ADMIN_ROLE = 0;

	public static final int BASIC_ROLE = 1;
	
	public UsuarioModel(){
		mBuzon = new HashMap<Integer,RecomendacionModel>();
	}
	
	

	/**
	 * @return the mBuzon
	 */
	@XmlElement
	public HashMap<Integer,RecomendacionModel> getBuzon() {
		return mBuzon;
	}



	/**
	 * @param mBuzon the mBuzon to set
	 */
	public void setBuzon(HashMap<Integer,RecomendacionModel> mBuzon) {
		this.mBuzon = mBuzon;
	}



	/**
	 * @return the mApellidos
	 */
	@XmlElement
	public String getApellidos() {
		return mApellidos;
	}



	/**
	 * @return the mFechaNacimiento
	 */
	@XmlElement
	public String getFechaNacimiento() {
		return mFechaNacimiento;
	}



	/**
	 * @return the mFechaDeRegistro
	 */
	@XmlElement
	public String getFechaDeRegistro() {
		return mFechaDeRegistro;
	}



	/**
	 * @return the mImagenPerfil
	 */
	@XmlElement
	public String getImagenPerfil() {
		return mImagenPerfil;
	}



	/**
	 * @return the mEstado
	 */
	@XmlElement
	public boolean isEstado() {
		return mEstado;
	}



	/**
	 * @return the mPuntuacion
	 */
	@XmlElement
	public int getPuntuacion() {
		return mPuntuacion;
	}



	/**
	 * @param mApellidos the mApellidos to set
	 */
	public void setApellidos(String mApellidos) {
		this.mApellidos = mApellidos;
	}



	/**
	 * @param mFechaNacimiento the mFechaNacimiento to set
	 */
	public void setFechaNacimiento(String mFechaNacimiento) {
		this.mFechaNacimiento = mFechaNacimiento;
	}



	/**
	 * @param mFechaDeRegistro the mFechaDeRegistro to set
	 */
	public void setFechaDeRegistro(String mFechaDeRegistro) {
		this.mFechaDeRegistro = mFechaDeRegistro;
	}



	/**
	 * @param mImagenPerfil the mImagenPerfil to set
	 */
	public void setImagenPerfil(String mImagenPerfil) {
		this.mImagenPerfil = mImagenPerfil;
	}



	/**
	 * @param mEstado the mEstado to set
	 */
	public void setEstado(boolean mEstado) {
		this.mEstado = mEstado;
	}



	/**
	 * @param mPuntuacion the mPuntuacion to set
	 */
	public void setPuntuacion(int mPuntuacion) {
		this.mPuntuacion = mPuntuacion;
	}



	/**
	 * @return the User
	 */
	@XmlElement
	public String getUser() {
		return mUser;
	}

	/**
	 * @return the Pwd
	 */
	@XmlElement
	public String getPwd() {
		return mPwd;
	}

	/**
	 * @return the Nombre
	 */
	@XmlElement
	public String getNombre() {
		return mNombre;
	}

	/**
	 * @return the Email
	 */
	@XmlElement
	public String getEmail() {
		return mEmail;
	}

	/**
	 * @return the Genero
	 */
	@XmlElement
	public String getGenero() {
		return mGenero;
	}

	/**
	 * @return the Pais
	 */
	@XmlElement
	public String getPais() {
		return mPais;
	}

	/**
	 * @return the Experiencia
	 */
	@XmlElement
	public String getExperiencia() {
		return mExperiencia;
	}

	/**
	 * @return the géneros
	 */
	@XmlElement
	public String getGeneros() {
		return mGeneros;
	}
	
	@XmlElement
	public int getRole(){
		return mRol;
	}
	
	public void setRole(int pRol){
		mRol = pRol;
	}

	/**
	 * @param User the User to set
	 */
	public void setUser(String mUser) {
		this.mUser = mUser;
	}

	/**
	 * @param Pwd the Pwd to set
	 */
	public void setPwd(String mPwd) {
		this.mPwd = mPwd;
	}

	/**
	 * @param Nombre the Nombre to set
	 */
	public void setNombre(String mNombre) {
		this.mNombre = mNombre;
	}

	/**
	 * @param Email the Email to set
	 */
	public void setEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	/**
	 * @param Genero the Genero to set
	 */
	public void setGenero(String mGenero) {
		this.mGenero = mGenero;
	}

	/**
	 * @param Pais the Pais to set
	 */
	public void setPais(String mPais) {
		this.mPais = mPais;
	}

	/**
	 * @param Experiencia the Experiencia to set
	 */
	public void setExperiencia(String mExperiencia) {
		this.mExperiencia = mExperiencia;
	}

	/**
	 * @param géneros the géneros to set
	 */
	public void setGeneros(String generos) {
		mGeneros = generos;
	}
	
	@Override
	public String toString(){
		return "Username: " + this.mUser + " Rol: " + this.mRol;		
	}
	
	
	
	

}
