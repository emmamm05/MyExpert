package repositories;

import java.sql.Timestamp;
import java.util.List;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

import models.PuntuacionesXmlModel;
import models.PeliculaModel;
import models.ResennaModel;
import models.TemporadaModel;
import models.TituloModel;
import models.BusquedaSimpleModel;


public interface IRepositorioTitulos {
	
	public List<TituloModel> getTitulos(Timestamp pTimestamp);
	public List<TituloModel> getAllTitulos();
	public void getInfoTitulo( TituloModel pCodigoTitulo );
	public void getInfoTemporada(TemporadaModel pCodigoTitulo);
	public void addTitulo( TituloModel pTitulo );
	public void buscarPorNombre( BusquedaSimpleModel pBusqueda );
	public void buscarPorDirector( BusquedaSimpleModel pBusqueda );
	public List<ResennaModel> getResennas( String pCodigoTitulo );
	public void getResennaCompleta( ResennaModel pResenna );
	public boolean guardarResennaDeTitulo(ResennaModel pResenna);
	public void getPuntuaciones( PuntuacionesXmlModel pModel );
	void addTitulo(TituloModel pTitulo, String pCodigoUsuario);
	
	
}
