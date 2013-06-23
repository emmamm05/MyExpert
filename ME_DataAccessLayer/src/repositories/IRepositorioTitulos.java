package repositories;

import java.sql.Timestamp;
import java.util.List;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

import models.PuntuacionesXmlModel;
import models.ResennaModel;
import models.TituloModel;


public interface IRepositorioTitulos {
	
	public List<TituloModel> getTitulos(Timestamp pTimestamp);
	public List<TituloModel> getAllTitulos();
	public void getInfoTitulo( TituloModel pCodigoTitulo );
	public void addTitulo( TituloModel pTitulo );
	public List<TituloModel> buscarPorNombre( String pTitulo );
	public List<TituloModel> buscarPorDirector( String pDirector );
	public List<ResennaModel> getResennas( String pCodigoTitulo );
	public void getResennaCompleta( ResennaModel pResenna );
	public void getPuntuaciones( PuntuacionesXmlModel pModel );
	
	
}
