package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import DataTrasportObjects.LoginDTO;


public class ViewModelFactory {
	
	private static ViewModelFactory mInstance;
	
	ViewModelFactory(){
		
	}
	
	public HashMap<String, Object> buildLoginViewModel(LoginDTO logindata, boolean success){
//		Ejemplo de lista
//		List<String> list = new ArrayList<String>();
//		list.add("item1");
//		list.add("item2");
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("user", logindata.getUser());
		model.put("pwd", logindata.getPwd());
		if (success){
			model.put("message", "Login exitoso");
			model.put("user", logindata.getUser());
			model.put("pwd", logindata.getPwd());
		}else{
			model.put("message", "error, user o pass invalidos");
		}
//		model.put("list", list );
		return model;
	}
	
	
	
	
	public static ViewModelFactory getInstance(){
		if ( mInstance == null ){
			mInstance = new ViewModelFactory();
		}
		return mInstance;
	}
	
}
