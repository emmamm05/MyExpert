package models;

import java.io.Serializable;


/**
 * @author emma
 * Modelo de Usuario, Serializable como requisito para los views
 * TODO: Revisar cuales modelos no son leidos en los views para 
 * quitar el serializable
 */
public class UserModel implements IModel,Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mUser;
	private String mPwd;
	private String mNombre;
	private String mEmail;
	private String mGenero;
	private String mPais;
	private String mExperiencia;
	private String mGeneros;
	
	public UserModel(){
		
	}

	/**
	 * @return the User
	 */
	public String getUser() {
		return mUser;
	}

	/**
	 * @return the Pwd
	 */
	public String getPwd() {
		return mPwd;
	}

	/**
	 * @return the Nombre
	 */
	public String getNombre() {
		return mNombre;
	}

	/**
	 * @return the Email
	 */
	public String getEmail() {
		return mEmail;
	}

	/**
	 * @return the Genero
	 */
	public String getGenero() {
		return mGenero;
	}

	/**
	 * @return the Pais
	 */
	public String getPais() {
		return mPais;
	}

	/**
	 * @return the Experiencia
	 */
	public String getExperiencia() {
		return mExperiencia;
	}

	/**
	 * @return the géneros
	 */
	public String getGeneros() {
		return mGeneros;
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
	
	
	

}
