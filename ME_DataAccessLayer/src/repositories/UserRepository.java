package repositories;

import java.util.List;

import Models.UserModel;

public class UserRepository {

	public UserModel getUserModel( String pUsername , String pPassword ){
		UserModel logindata = new UserModel();
		logindata.setUser("luisa05");
		logindata.setPwd("1234");
		logindata.setmNombre("Luisa Matamoros");
		logindata.setmEmail("luisa05@email.com");
		logindata.setmGenero("Femenino");
		logindata.setmPais("Colombia");
		return logindata;
	}
	
	public List<UserModel> getUsersByUsername(String name){
		return null;
	}
	
	public List<UserModel> getUsersByFullName(String name){
		return null;
	}
	
	public List<UserModel> getUsersByFollower(int id){
		return null;
	}
	
	public List<UserModel> getUsersByFollowing(int id){
		return null;
	}
}
