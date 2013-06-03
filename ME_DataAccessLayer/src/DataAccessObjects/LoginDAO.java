package DataAccessObjects;

import DataTrasportObjects.IDTO;
import DataTrasportObjects.LoginDTO;

public class LoginDAO implements IDAO{

	@Override
	public boolean insert(IDTO data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(IDTO data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LoginDTO find(IDTO filter) {
		// TODO Auto-generated method stub
		LoginDTO logindata = new LoginDTO();
		logindata.setUser("emma");
		logindata.setPwd("1234");
		return logindata;
	}

	@Override
	public LoginDTO findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
