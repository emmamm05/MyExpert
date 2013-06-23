package logic;

import models.BusquedaSimpleModel;
import models.TituloModel;

/**
 * 
 * @author Luis Alonso
 *
 */
public interface IBusquedaLogica {
	
	public BusquedaSimpleModel BusquedaSimple(BusquedaSimpleModel pBusqueda);
	public void buscarDatosDeTitulo(TituloModel pTitulo);
}
