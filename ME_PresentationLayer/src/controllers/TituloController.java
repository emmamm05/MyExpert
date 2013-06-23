package controllers;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.FormParam;

import logic.BusquedasLogic;
import logic.IBusquedasLogic;
import logic.IResennaTitulo;
import logic.Login;
import logic.ResennasDeTitulos;
import logic.LogicFactory;
import logic.Login;

import models.BusquedaSimpleModel;
import models.GeneroModel;
import models.TituloModel;
import models.PeliculaModel;
import models.TemporadaModel;
import models.ResennaModel;
import models.UsuarioModel;

import autentificacion.BasicAuth;

import com.sun.jersey.api.view.Viewable;

/**
 * Servlet implementation class TituloServlet
 * @autor Luis Alonso
 */
@Path("/Titulo")
public class TituloController{
	
	@Context
	private UriInfo mUriInfo;
	
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response showLoginPage(
			  @QueryParam("UUID") String pUUID){
		  
		  UsuarioModel user = BasicAuth.getUser(pUUID);
		  String perfilPageLocation;
		  if ( user.getRole() == UsuarioModel.ADMIN_ROLE ){
		     perfilPageLocation = "/BusquedaDeTituloAdmin";		    	
		  }else{
		     perfilPageLocation = "/BusquedaDeTitulo";
		   }
		  return Response.ok(new Viewable( perfilPageLocation ) ).build();
	  }
	  
	  @Path("/MostrarBusquedas")
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response showBusquedaTitulo(){
		  return Response.ok(new Viewable( "/BusquedaDeTitulo" ) ).build();
		  
	  }
	  
	  @Path("/MostrarResenna")
	  @POST
	  @Produces(MediaType.TEXT_HTML)
	  public Response showResenna(
			  @FormParam ("nombreTitulo") String pNombreTitulo
	  ){
		  System.out.println("Esta entrando a mostrar el view de las resennas");
		  ResennaModel resenna = new ResennaModel();
		  resenna.setTitulo(pNombreTitulo);
		  
		  return Response.ok(new Viewable( "/Resenna" , resenna) ).build();
		  
	  }
	  
	  // This method is called if HTML is request
 	  @Path("/Busqueda")
	  @POST
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response requestSearch( 
			  @FormParam("Criterio") String pCriterio, 
			  @FormParam("PalabraClave") String pPalabraClave ){
		  
		  BusquedaSimpleModel busquedaSimpleModel = new BusquedaSimpleModel();
		  busquedaSimpleModel.setPalabraClave(pPalabraClave);
		  
		  if("Titulo".equals(pCriterio)){
			  busquedaSimpleModel.setBusquedaPorNombre(true);
		  }else if("Director".equals(pCriterio)){
			  busquedaSimpleModel.setBusquedaPorDirector(true);
		  }
		  
		  LogicFactory factory = new LogicFactory();
		  IBusquedasLogic busquedaLogic = factory.getBusquedaLogica();
		  
		  busquedaLogic.BusquedaSimple(busquedaSimpleModel);
		  
		  
		  
		return Response.ok(new Viewable( "/BusquedaDeTitulo", busquedaSimpleModel  )).build();
	  }
	  
	  @Path("/Mostrar")
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public Response requestShowTitle(
			  @QueryParam("UUID") String pUUID,
			  @QueryParam("Codigo") String pNombre){
		  
		  LogicFactory factory = new LogicFactory();
		  TituloModel model = new TituloModel();
		  model.setNombre(pNombre);
		  factory.createBusquedaLogic().buscarDatosDeTitulo(model);
		  
		  return Response.ok(new Viewable("/PerfilTitulo", model )).build();
	  }			
	  
 @Path("/Resenna")
	  @POST
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response requestReview(
			  @FormParam("resenna") String pReview,
			  @FormParam("calificacion") String pScore,
			  @FormParam("nombreTitulo") String pNombreTitulo){
		  
		  LogicFactory factory = new LogicFactory();
		  IResennaTitulo review = factory.getResennaLogica();
		  ResennaModel reviewModel = new ResennaModel();
		  TituloModel tituloSelecionado = new TituloModel();
		  
		  reviewModel.setTitulo(pNombreTitulo);
		  reviewModel.setContenido(pReview);
		  reviewModel.setAutor("emma");//Cambiar esto
		  
		  try{
			  reviewModel.setCalificacionDeExperto(Float.parseFloat(pScore));
		  }catch(Exception e){}
		  
		  boolean isValid = review.crearResenna(reviewModel);
		  
		  if (isValid){
			  System.out.println("Se guardo buen la resenna");
			  return Response.ok(new Viewable("/PerfilTitulo",tituloSelecionado )).build();
		  }
		  
		  return Response.ok(new Viewable("/BusquedaDeTitulo",tituloSelecionado )).build();
	  }
	  
	  @Path("/Add")
	  @GET
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response getAddTituloPage(
				@QueryParam("UUID") String pUUID){
		  
		  LogicFactory logic = new LogicFactory();
		  List<GeneroModel> generos = 
				  logic.createCatalogosLogic().getAllGeneros();
		  
		  return Response.ok(new Viewable("/AddTitulo",generos) ).build();
		  
	  }
	  
	  @Path("/Add")
	  @POST
	  public Response postAddTitulo(
			  @QueryParam("UUID") String pUUID,
			  @FormParam("Titulo") String pTitulo,
			  @FormParam("Director") String pDirector,
			  @FormParam("Descripcion") String pDescripcion,
			  @FormParam("Anno") int pAnno,
			  @FormParam("Fotografia") String pFotografia,
			  @FormParam("Genero") String pGenero,
			  @FormParam("Link") String pLink,
			  @FormParam("Tipo") String pTipo
			  ){
		  
		  UsuarioModel usuario = BasicAuth.getUser(pUUID);
		  
		  LogicFactory logic = new LogicFactory();
		  TituloModel titulo = new TituloModel();
		  GeneroModel genero = new GeneroModel();
		  genero.setNombre(pGenero);
		  titulo.setNombre(pTitulo);
		  titulo.setDirector(pDirector);
		  titulo.setAnno(pAnno);
		  titulo.setGenero(genero);	
		  titulo.setCodigo( UUID.randomUUID().toString() );
		  titulo.setDescripcion(pDescripcion);
		  titulo.setImagen(pFotografia);
		  titulo.setmLinkYoutube(pLink);		  
		  
		  logic.createCatalogosLogic().addTitulo(titulo, usuario.getUser() );

		  URI location = mUriInfo.getBaseUriBuilder()
					.path("/Perfil")
					.queryParam("UUID", pUUID)
					.build();
		  
		  return Response.seeOther(location).build();
	  }
}
