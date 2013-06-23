package repositories;

public class RepositoriosFactory {

	public IRepositorioUsuarios createRepositorioUsuarios() {
		
		return new RepositorioUsuarios();
	}
	
	public IRepositorioGeneros createRepositorioGeneros(){
		
		return new RepositorioGeneros();
	}
	
	public IRepositorioTitulos createRepositorioTitulos(){
		
		return new RepositorioTitulos();
	}
}
