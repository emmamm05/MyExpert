package logic;

import models.ResennaModel;


/**
 * 
 * @author Luis Alonso
 *
 */
public class ResennasDeTitulos {
	
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
	public boolean resennarTitulo(ResennaModel pResenna){
		if(pResenna.getContenido().equals("")){
		}else{
			return false;
		}
		return true;
	}

}
