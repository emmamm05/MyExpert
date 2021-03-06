package logic;

import java.util.List;

import repositories.IRepositorioUsuarios;
import repositories.RepositoriesFactory;
import repositories.RepositoriosFactory;

import models.RegistroModel;
import models.UsuarioModel;

public class CuentaLogic implements ICuentaLogic {

	@Override
	public void RegistrarNuevoUsuario(UsuarioModel pUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ConfigurarCuenta(UsuarioModel pUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void DarDeBaja(UsuarioModel pUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ReincorporarUsuario(UsuarioModel pUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UsuarioModel> getAllExpertos() {
		RepositoriosFactory factory = new RepositoriosFactory();
		IRepositorioUsuarios repositorio = factory.createRepositorioUsuarios();
		return repositorio.getAllExpertos();
	}
	
	/**
	 * 
	 * @param pUserRegister: Modelo del registro de usuario
	 * @return el valor booleano correspondiente al resultado de guardar la informacion del nuevo usuario
	 */
	public boolean registrarNuevoUsuario(RegistroModel pUserRegister){
		
		if((!pUserRegister.getUsername().equals("") && !pUserRegister.getPassword().equals("") && !pUserRegister.getMail().equals("") && !pUserRegister.getRol().equals("")) && pUserRegister.getPassword().equals(pUserRegister.getRepeatPassword())){//Se verifica que el usuario haya ingresado toda la informacion solicitada
			RepositoriesFactory factory = new RepositoriesFactory();
			IRepositorioUsuarios userRepository = factory.getUserRespositorie();
			userRepository.registraNuevoUsuario(pUserRegister);
			return true;
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
	public boolean configurarCuentaDeUsuario(UsuarioModel pUser){
		if(!pUser.getNombre().equals("") 
				&& !pUser.getPais().equals("") 
				&& !pUser.getExperiencia().equals("") 
				&& !pUser.getGenero().equals("") 
				&& !pUser.getGeneros().equals("") 
				&& !pUser.getEmail().equals("") 
				&& !pUser.getUser().equals("")){
			RepositoriesFactory factory = new RepositoriesFactory();
			IRepositorioUsuarios userRepository = factory.getUserRespositorie();
			return userRepository.guardarInformacionAdicional(pUser);
			//return userRepository.guardarInformacionAdicionalDeUsuario(pUser.getUser(), pUser.getNombre(), pUser.getPais(), pUser.getGenero(), pUser.getGeneros(), pUser.getExperiencia(), pUser.getEmail());
		}else{
			return false;
		}
	}
	

}
