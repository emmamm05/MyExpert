package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


import models.UsuarioModel;
import repositories.RepositorioUsuarios;

public class Login implements IAutorizacionLogic{
	
	private List<UsuarioModel> mAutentication = new ArrayList<UsuarioModel>();
	private HashMap<String,UsuarioModel> mLogged = new HashMap<String,UsuarioModel>();
	
	Login(){
		
	}
	
	public boolean ValidarUsuario(UsuarioModel pLoginRequested, String pUuid){
		RepositorioUsuarios userRepository = new RepositorioUsuarios();
		UsuarioModel loginUserMatched = 
				userRepository.getUserModel(pLoginRequested.getUser(), pLoginRequested.getPwd());
		if ( loginUserMatched != null ){			
			mAutentication.add(loginUserMatched);
			mLogged.put( pUuid , loginUserMatched );
			return true;
		}
		return false;
					
	}
	
	public UsuarioModel getLoggedUser(String pUuid){
		if( mLogged.containsKey(pUuid) ){
			return mLogged.get(pUuid);
		}
		return null;
	}
}
