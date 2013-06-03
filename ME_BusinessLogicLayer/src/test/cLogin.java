package test;

import DataAccessObjects.LoginDAO;
import DataTrasportObjects.LoginDTO;

public class cLogin {
	
	private LoginDTO mLoginData;
	
	public cLogin(){
		
	}
	
	public boolean Validate(LoginDTO pLoginRequested){
		
		LoginDAO loginDao = new LoginDAO();
		LoginDTO loginUserMatched = loginDao.find(pLoginRequested);
		if (pLoginRequested.getUser().equals(loginUserMatched.getUser() )
			&& pLoginRequested.getPwd().equals(loginUserMatched.getPwd())){
			
			mLoginData = loginUserMatched;
			return true;
		}
		return false;
					
	}
	
	public LoginDTO getLoginDTO(){
		return mLoginData;
	}

}
