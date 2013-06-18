package models;

import java.io.Serializable;

/**
 * 
 * @author Luis Alonso
 *
 */
public class RegistroModel implements IModel,Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String mUsername;
	private String mPassword;
	private String mRepeatPassword;
	private String mMail;
	private String mRol;
	
	public RegistroModel(){
		
	}
	
	/**
	 * @return the mUsername
	 */
	public String getUsername() {
		return mUsername;
	}
	/**
	 * @param mUsername the mUsername to set
	 */
	public void setUsername(String mUsername) {
		this.mUsername = mUsername;
	}
	/**
	 * @return the mPassword
	 */
	public String getPassword() {
		return mPassword;
	}
	/**
	 * @param mPassword the mPassword to set
	 */
	public void setPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	/**
	 * @return the mRepeatPassword
	 */
	public String getRepeatPassword() {
		return mRepeatPassword;
	}
	/**
	 * @param mRepeatPassword the mRepeatPassword to set
	 */
	public void setRepeatPassword(String mRepeatPassword) {
		this.mRepeatPassword = mRepeatPassword;
	}
	/**
	 * @return the mMail
	 */
	public String getMail() {
		return mMail;
	}
	/**
	 * @param mMail the mMail to set
	 */
	public void setMail(String mMail) {
		this.mMail = mMail;
	}
	/**
	 * @return the mRol
	 */
	public String getRol() {
		return mRol;
	}
	/**
	 * @param mRol the mRol to set
	 */
	public void setRol(String mRol) {
		this.mRol = mRol;
	}

}
