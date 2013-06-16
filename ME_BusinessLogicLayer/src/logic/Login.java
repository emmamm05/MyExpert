package logic;

import models.UserModel;
import repositories.UserRepository;

public class Login {
	
	private static UserModel mLoginData;
	
	public Login(){
		
	}
	
	public boolean Validate(UserModel pLoginRequested){
		
		UserRepository userRepository = new UserRepository();
		UserModel loginUserMatched = 
				userRepository.getUserModel(pLoginRequested.getUser(), pLoginRequested.getPwd());
		if (pLoginRequested.getUser().equals(loginUserMatched.getUser() )
			&& pLoginRequested.getPwd().equals(loginUserMatched.getPwd())){
			
			mLoginData = loginUserMatched;
			return true;
		}
		return false;
					
	}
	
	public UserModel getLoggedUser(){
		return mLoginData;
	}

}
