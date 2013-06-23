package logic;

import java.util.List;

import models.BusquedaSimpleModel;
import models.TituloModel;

public interface IBusquedasLogic {

	public BusquedaSimpleModel BusquedaSimple(BusquedaSimpleModel pBusqueda);
	public void buscarDatosDeTitulo(TituloModel pTitulo);

	
}
