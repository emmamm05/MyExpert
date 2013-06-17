package logic;

import models.ResennaModel;

import repositories.TitleRepository;

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
		TitleRepository titleRepository = new TitleRepository();
		if(pResenna.getContenido().equals("")){
			return titleRepository.guardarResenna(pResenna);
		}else{
			return false;
		}
	}

}
