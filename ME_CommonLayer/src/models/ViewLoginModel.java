/**
 * 
 */
package models;

import java.io.Serializable;

/**
 * @author emma
 *
 */
public class ViewLoginModel implements IModel, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserModel mUserModel;
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
	public UserModel getUserModel() {
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
	public void setUserModel(UserModel mUserModel) {
		this.mUserModel = mUserModel;
	}
	/**
	 * @param mMessage the mMessage to set
	 */
	public void setMessage(String mMessage) {
		this.mMessage = mMessage;
	}
	
	

}
