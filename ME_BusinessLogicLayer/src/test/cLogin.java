package test;

import repositories.UserRepository;
import Models.UserModel;

public class cLogin {
	
	private UserModel mLoginData;
	
	public cLogin(){
		
	}
	
	public boolean Validate(UserModel pLoginRequested){
		
		UserRepository userRepository = new UserRepository();
		UserModel loginUserMatched = 
				userRepository.getUserModel(pLoginRequested.getmUser(), pLoginRequested.getmPwd());
		if (pLoginRequested.getUser().equals(loginUserMatched.getUser() )
			&& pLoginRequested.getPwd().equals(loginUserMatched.getPwd())){
			
			mLoginData = loginUserMatched;
			return true;
		}
		return false;
					
	}
	
	public UserModel getLoginDTO(){
		return mLoginData;
	}

}
