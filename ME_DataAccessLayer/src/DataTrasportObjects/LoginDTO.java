package DataTrasportObjects;

import java.io.Serializable;

public class LoginDTO implements IDTO, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mUser;
	private String mPwd;
	
	public LoginDTO(){
		
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

}
