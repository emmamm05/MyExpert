package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import models.UserModel;
import repositories.UserRepository;

public class Login {
	
	private static List<UserModel> mAutentication = new ArrayList<UserModel>();
	private static HashMap<String,UserModel> mLogged = new HashMap<String,UserModel>();
	
	public static boolean Validate(UserModel pLoginRequested, String pUuid){
		
		UserRepository userRepository = new UserRepository();
		UserModel loginUserMatched = 
				userRepository.getUserModel(pLoginRequested.getUser(), pLoginRequested.getPwd());
		if (pLoginRequested.getUser().equals(loginUserMatched.getUser() )
			&& pLoginRequested.getPwd().equals(loginUserMatched.getPwd())){
			
			mAutentication.add(loginUserMatched);
			mLogged.put( pUuid , loginUserMatched );
			HashMap<String,UserModel> Logged = mLogged;
			return true;
		}
		return false;
					
	}
	
	public static UserModel getLoggedUser(String pUuid){
//		System.out.println("#############################");
//		for ( int i=0; i< mAutentication.size() ; i++ ){
//			if ( mAutentication.get(i).getUser().equals(pUsername) ){
//				return mAutentication.get(i);
//			}
//		}
//		return null;
		HashMap<String,UserModel> Logged = mLogged;
		if( mLogged.containsKey(pUuid) ){
			return mLogged.get(pUuid);
		}
		return null;
	}
	
}
