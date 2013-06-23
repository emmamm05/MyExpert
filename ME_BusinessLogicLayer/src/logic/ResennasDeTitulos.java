package logic;

import models.ResennaModel;
import repositories.IRepositorioTitulos;
import repositories.RepositoriesFactory;


/**
 * 
 * @author Luis Alonso
 *
 */
public class ResennasDeTitulos implements IResennaTitulo{
	
	/**
	 * Constructor
	 */
	public ResennasDeTitulos(){
		
	}
	
	/**
	 * Metodo encargado de manejar las resenna
	 * @param pResenna: modelo de la resena a guardar
	 * @return se retorna el valor booleano de almacenar
	 * la resena
	 */
	public boolean crearResenna(ResennaModel pResenna){
		if(pResenna.getContenido().equals("")){
			return false;
		}else{
			
			RepositoriesFactory repositorios = new RepositoriesFactory();
			IRepositorioTitulos repoTitulos = repositorios.getCatalogRepositorie();
			return repoTitulos.guardarResennaDeTitulo(pResenna);
		}
	}

}