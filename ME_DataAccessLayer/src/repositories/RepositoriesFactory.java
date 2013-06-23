package repositories;

/**
 * 
 * @author Luis Alonso
 *
 */
public class RepositoriesFactory {
	
	/**
	 * Construccion
	 */
	public RepositoriesFactory(){
		
	}
	
	/**
	 * Metodo encargado de instanciar el repositorio que maneja
	 * la informacion de los usuarios
	 * @return se retorna el respositorio de usuarios
	 */
	public IRepositorioUsuarios getUserRespositorie(){
		
		return new RepositorioUsuarios();
	}
	
	/**
	 * Metodo encargado de instanciar el repositorio que maneja
	 * la informacion de los catalogos
	 * @return
	 */
	public IRepositorioTitulos getCatalogRepositorie(){
		
		return new RepositorioTitulos();
	}
	
	/**
	 * Metodo encargado de instanciar el repositorio que maneja
	 * la informacion correspondiente a las recomendaciones
	 * @return
	 */
	public RepositorioRecomendaciones getRecomendacionesDeUsuario(){
		
		return new RepositorioRecomendaciones();
	}

}
