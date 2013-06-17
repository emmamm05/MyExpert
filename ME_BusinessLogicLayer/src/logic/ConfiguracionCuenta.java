package logic;

import repositories.UserRepository;
import models.RegistroModel;
import models.UserModel;

/**
 * 
 * @author Luis Alonso
 *
 */
public class ConfiguracionCuenta {

	public ConfiguracionCuenta(){
		
	}
	
	/**
	 * 
	 * @param pUserRegister: Modelo del registro de usuario
	 * @return el valor booleano correspondiente al resultado de guardar la informacion del nuevo usuario
	 */
	public boolean registrarNuevoUsuario(RegistroModel pUserRegister){
		
		if((!pUserRegister.getUsername().equals("") && !pUserRegister.getPassword().equals("") && !pUserRegister.getMail().equals("") && !pUserRegister.getRol().equals("")) && pUserRegister.getPassword().equals(pUserRegister.getRepeatPassword())){//Se verifica que el usuario haya ingresado toda la informacion solicitada
			UserRepository userRepository = new UserRepository();
			return userRepository.setNewUser(pUserRegister.getUsername(), pUserRegister.getPassword(), pUserRegister.getMail(), pUserRegister.getRol());//Se verifica que el proceso para guardar los datos se haya completado
		}
		else{
			return false;
		}
	}
	
	/**
	 * 
	 * @param pUser: modelo con los datos adicionales del nuevo usuario
	 * @return Se retorna el valor booleano indicando el resultado del proceso de guardar los datos en la base de datos
	 */
	public boolean configurarCuentaDeUsuario(UserModel pUser){
		if(!pUser.getNombre().equals("") && !pUser.getPais().equals("") && !pUser.getExperiencia().equals("") && !pUser.getGenero().equals("") && !pUser.getGeneros().equals("") && !pUser.getEmail().equals("") && !pUser.getUser().equals("")){
			UserRepository userRepository = new UserRepository();
			return userRepository.guardarInformacionAdicionalDeUsuario(pUser.getUser(), pUser.getNombre(), pUser.getPais(), pUser.getGenero(), pUser.getGeneros(), pUser.getExperiencia(), pUser.getEmail());
		}else{
			return false;
		}
	}
}
