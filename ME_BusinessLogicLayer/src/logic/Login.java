package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import models.User;
import repositories.UserRepository;

public class Login {
	
	private static List<User> mAutentication = new ArrayList<User>();
	private static HashMap<String,User> mLogged = new HashMap<String,User>();
	
	public static boolean Validate(User pLoginRequested, String pUuid){
		
		UserRepository userRepository = new UserRepository();
		User loginUserMatched = 
				userRepository.getUserModel(pLoginRequested.getUser(), pLoginRequested.getPwd());
		if (pLoginRequested.getUser().equals(loginUserMatched.getUser() )
			&& pLoginRequested.getPwd().equals(loginUserMatched.getPwd())){
			
			mAutentication.add(loginUserMatched);
			mLogged.put( pUuid , loginUserMatched );
			HashMap<String,User> Logged = mLogged;
			return true;
		}
		return false;
					
	}
	
	public static User getLoggedUser(String pUuid){
//		System.out.println("#############################");
//		for ( int i=0; i< mAutentication.size() ; i++ ){
//			if ( mAutentication.get(i).getUser().equals(pUsername) ){
//				return mAutentication.get(i);
//			}
//		}
//		return null;
		HashMap<String,User> Logged = mLogged;
		if( mLogged.containsKey(pUuid) ){
			return mLogged.get(pUuid);
		}
		return null;
	}
	
}
