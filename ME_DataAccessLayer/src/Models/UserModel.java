package Models;

import java.io.Serializable;

public class UserModel implements IModel, Serializable{
	
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
	private String Géneros;
	
	public UserModel(){
		
	}

	public String getUser() {
		return mUser;
	}

	public void setUser(String mUser) {
		this.mUser = mUser;
	}

	public String getPwd() {
		return mPwd;
	}

	public void setPwd(String mPwd) {
		this.mPwd = mPwd;
	}

	public String getmUser() {
		return mUser;
	}

	public void setmUser(String mUser) {
		this.mUser = mUser;
	}

	public String getmPwd() {
		return mPwd;
	}

	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}

	public String getmNombre() {
		return mNombre;
	}

	public void setmNombre(String mNombre) {
		this.mNombre = mNombre;
	}

	public String getmEmail() {
		return mEmail;
	}

	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	public String getmGenero() {
		return mGenero;
	}

	public void setmGenero(String mGenero) {
		this.mGenero = mGenero;
	}

	public String getmPais() {
		return mPais;
	}

	public void setmPais(String mPais) {
		this.mPais = mPais;
	}

	public String getmExperiencia() {
		return mExperiencia;
	}

	public void setmExperiencia(String mExperiencia) {
		this.mExperiencia = mExperiencia;
	}

	public String getGéneros() {
		return Géneros;
	}

	public void setGéneros(String géneros) {
		Géneros = géneros;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
