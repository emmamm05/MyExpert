package DataAccessObjects;

import DataTrasportObjects.IDTO;

public interface IDAO {
	public boolean insert(IDTO data);
	public boolean update(IDTO data);
	public IDTO    find(IDTO filter);
	public IDTO    findAll();
}
