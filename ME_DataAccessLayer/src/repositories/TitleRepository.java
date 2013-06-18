package repositories;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import models.ResennaModel;

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
	
	public List<String> buscarInformacionDeTitulo(String pTitulo){
		List<String> resultadoDeBusqueda = new ArrayList<String>();
		//Colocar aqui la logica de buscar la informacion en la base de datos
		return resultadoDeBusqueda;
	}
	
	/**
	 * Metodo encargado de buscar la fecha de publicacion de
	 * determinado titulo
	 * @param pTitulo: nombre del titulo
	 * @return se retorna el la fecha de publicacion de los titulos
	 */
	public Timestamp buscarPublicacionDeTitulo(String pTitulo){
		Timestamp publicacion = new Timestamp(0);//Cambiar esto
		//Colocar aqui la logica para buscar en la base de datos
		return publicacion;
	}
	
	/**
	 * Metoso que se encarga de buscar la calificacion de IMDB
	 * y la calificacion de la comunidad
	 * @param pTitulo: nombre del titulo
	 * @return se retorna las calificaiones correspondiente
	 */
	public List<Integer> buscarCalificacionesDeTitulo(String pTitulo){
		List<Integer> calificaciones = new ArrayList<Integer>();
		//Colocar la logica para conectarse con la base de datos
		
		return calificaciones;
	}
	
	/**
	 * Metodo que se encarga de buscar en la base de datos
	 * las calificaiones de los expertos de determinada titulo
	 * @param pTitulo: nombre del titulo
	 * @return se retorna un HashMap con las calificaciones de los titulos
	 * y el Id de los expertos que lo hicieron
	 */
	public HashMap<Integer, Integer> buscarCalificaionDeExpertos(String pTitulo){
		HashMap<Integer, Integer> calificaciones = new HashMap<Integer, Integer>();
		//Colocar la logica para conectarse con la base de datos
		return calificaciones;
	}
	
	/**
	 * Metodo encargado de buscar ne la base de datos
	 * el genero de determinado titulo
	 * @param pTitulo: nombre del titulo
	 * @return se retorna el genero y la descripcion de dicho genero
	 * para el titulo
	 */
	public List<String> buscarGeneroDeTitulo(String pTitulo){
		List<String> generoTitulo = new ArrayList<String>();
		//Colocar la logica de buscar en la base de datos
		return generoTitulo;
	}
	
	/**
	 * Metodo encargado de almacenar en la base de datos
	 * la resenna de determinado titulo
	 * @param pResenna: modelo de la resena que se desea almacenar
	 * @return se retorna el valor booleano del proceso de
	 * guardar una resenna
	 */
	public boolean guardarResenna(ResennaModel pResenna){
		//Colocar la logica para conectarse con la base de datos
		return true;
	}
}
