/**
 * 
 */
package models;

import java.io.Serializable;

/**
 * @author emma
 *
 */
public class ViewLoginModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioModel mUserModel;
	private String    mMessage;
	
	
	
	/**
	 * @param mUserModel
	 * @param mMessage
	 */
	public ViewLoginModel() {
	}
	/**
	 * @return the mUserModel
	 */
	public UsuarioModel getUserModel() {
		return mUserModel;
	}
	/**
	 * @return the mMessage
	 */
	public String getMessage() {
		return mMessage;
	}
	/**
	 * @param mUserModel the mUserModel to set
	 */
	public void setUserModel(UsuarioModel mUserModel) {
		this.mUserModel = mUserModel;
	}
	/**
	 * @param mMessage the mMessage to set
	 */
	public void setMessage(String mMessage) {
		this.mMessage = mMessage;
	}
	
	

}
