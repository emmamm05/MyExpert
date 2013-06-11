package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Models.UserModel;


public class ViewModelBuilder {
	
//	private static ViewModelFactory mInstance;
	
	public ViewModelBuilder(){
		
	}
	
	public HashMap<String, Object> buildLoginViewModel(boolean failed){
		HashMap<String, Object> model = new HashMap<String, Object>();
		if ( failed ){
			model.put("Message", "Datos Inválidos");
		}
		return model;
	}
	
	
	
	public HashMap<String, Object> buildPerfilViewModel(UserModel logindata){
//		Ejemplo de lista
//		List<String> list = new ArrayList<String>();
//		list.add("item1");
//		list.add("item2");
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("Username", logindata.getUser());
		model.put("Nombre", logindata.getmNombre());
		model.put("Email", logindata.getmEmail());
		model.put("Genero", logindata.getmGenero());
		model.put("Pais", logindata.getmPais());
		model.put("Experiencia", logindata.getmExperiencia());
		model.put("Géneros", logindata.getGéneros());
//		model.put("list", list );
		return model;
	}
	
	
	
//	
//	public static ViewModelFactory getInstance(){
//		if ( mInstance == null ){
//			mInstance = new ViewModelFactory();
//		}
//		return mInstance;
//	}
	
}
