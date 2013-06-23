/**
 * 
 */
package service.controllers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import repositories.RepositorioTitulos;

import logic.CatalogosLogic;
import logic.IResennaLogic;
import logic.LogicFactory;
import models.GeneroModel;
import models.PuntuacionesXmlModel;
import models.ResennaModel;
import models.TituloModel;

/**
 * @author emma
 *
 */
@Path("/Titulos")
public class TitulosController {

	@Path("/updates")
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<TituloModel> getUpdates(
			@QueryParam("Timestamp") String pStringTimestamp){
		CatalogosLogic wsLogic = new CatalogosLogic();
		Timestamp timestamp = Timestamp.valueOf(pStringTimestamp);
		List<TituloModel> titulos = wsLogic.getTitulos(timestamp);
		return titulos;
	}
	
	@Path("/all")
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<TituloModel> getAllTitulos(){
		CatalogosLogic wsLogic = new CatalogosLogic();
		List<TituloModel> titulos = wsLogic.getAllTitulos();
		return titulos;		
	}
	
	@Path("/resenna")
	@GET
	@Produces(MediaType.TEXT_XML)
	public ResennaModel getResenna(
			@QueryParam("CodigoAutor") String pCodigoAutor,
			@QueryParam("CodigoTitulo") String pCodigoTitulo
			){
		
		LogicFactory factory = new LogicFactory();
		IResennaLogic logic = factory.createResennaLogic();
		ResennaModel resenna = new ResennaModel();
		resenna.setCodigoAutor(pCodigoAutor);
		resenna.setCodigoTitulo(pCodigoTitulo);
		logic.getResennaCompleta( resenna );
		return resenna;		
	}
	
	@Path("/resennas")
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<ResennaModel> getResennas(
			@QueryParam("Codigo") String pCodigoTitulo){
		
		LogicFactory factory = new LogicFactory();
		IResennaLogic logic = factory.createResennaLogic();
		return logic.getResennas(pCodigoTitulo);	
	}
	
	@Path("/puntuaciones")
	@GET
	@Produces( MediaType.TEXT_XML )
	public PuntuacionesXmlModel getPuntuaciones(
			@QueryParam("Codigo") String pCodigoTitulo ){
		
		LogicFactory factory = new LogicFactory();
		PuntuacionesXmlModel model = new PuntuacionesXmlModel();
		model.setCodigoTitulo(pCodigoTitulo);
		factory.createCatalogosLogic().getAllPuntaciones(model);
		return model;
		
	}
}
