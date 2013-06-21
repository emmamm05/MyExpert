package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


import models.UsuarioModel;
import repositories.RepositorioUsuarios;

public class Login {
	
	private static List<UsuarioModel> mAutentication = new ArrayList<UsuarioModel>();
	private static HashMap<String,UsuarioModel> mLogged = new HashMap<String,UsuarioModel>();
	
	public static boolean Validate(UsuarioModel pLoginRequested, String pUuid){
		
		RepositorioUsuarios userRepository = new RepositorioUsuarios();
		UsuarioModel loginUserMatched = 
				userRepository.getUserModel(pLoginRequested.getUser(), pLoginRequested.getPwd());
		if (pLoginRequested.getUser().equals(loginUserMatched.getUser() )
			&& pLoginRequested.getPwd().equals(loginUserMatched.getPwd())){
			
			mAutentication.add(loginUserMatched);
			mLogged.put( pUuid , loginUserMatched );
			HashMap<String,UsuarioModel> Logged = mLogged;
			return true;
		}
		return false;
					
	}
	
	public static UsuarioModel getLoggedUser(String pUuid){
//		System.out.println("#############################");
//		for ( int i=0; i< mAutentication.size() ; i++ ){
//			if ( mAutentication.get(i).getUser().equals(pUsername) ){
//				return mAutentication.get(i);
//			}
//		}
//		return null;
		HashMap<String,UsuarioModel> Logged = mLogged;
		if( mLogged.containsKey(pUuid) ){
			return mLogged.get(pUuid);
		}
		return null;
	}
	
}
