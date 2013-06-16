package repositories;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Luis Alonso
 *Encargada de manejar todo lo relacionado con los datos de los titulos
 */
public class TitleRepository {
	
	/**
	 * Metodo encargado de buscar en la base de datos la lista de titulos que coincidan
	 * con la palabra clave propuesta por el cliente
	 * @param pTitulo: palabra clave de los titulos que el cliente desea buscar
	 * @return se retorna la lista de titulos que coincidieron con la palabra clave propuesta por el usuario.
	 */
	public List<String> buscarPorNombre(String pTitulo){
		List<String> resultadoDeBusqueda = new ArrayList<String>();
		//Colocar la logica para buscar en la base de datos
		return resultadoDeBusqueda;
	}
	
	/**
	 * Metodo encargado de buscar las puntuaciones de lo titulos resultantes
	 * @param pTitulo: palabra clave propuesta por el usuario
	 * @return se retorna una lista con las puntuaciones de los titulos resultantes en el metodo anterior
	 */
	public List<Integer> buscarPorNombre_aux(String pTitulo){
		List<Integer> resultadoDeBusqueda = new ArrayList<Integer>();
		//Colocar la logica para buscar en la base de datos
		return resultadoDeBusqueda;
	}
	
	/**
	 * Metodo encargado de buscar en la base de datos la lista de titulos que coincidan
	 * con la palabra clave propuesta por el cliente
	 * @param pDirector: palabra clave de los titulos que el cliente desea buscar
	 * @return se retorna la lista de titulos que coincidieron con la palabra clave propuesta por el usuario.
	 */
	public List<String> buscarPorDirector(String pDirector){
		List<String> resultadoDeBusqueda = new ArrayList<String>();
		//Colocar la logica para buscar en la base de datos
		return resultadoDeBusqueda;
	}
	
	/**
	 * Metodo encargado de buscar en la base de datos la lista de titulos que coincidan
	 * con la palabra clave propuesta por el cliente
	 * @param pDirector: palabra clave de los titulos que el cliente desea buscar
	 * @return se retorna la lista de titulos que coincidieron con la palabra clave propuesta por el usuario.
	 */
	public List<Integer> buscarPorDirector_aux(String pDirector){
		List<Integer> resultadoDeBusqueda = new ArrayList<Integer>();
		//Colocar la logica para buscar en la base de datos
		return resultadoDeBusqueda;
	}

}
