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

import logic.Busquedas;
import logic.IBusquedaLogica;
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
	private List<TituloModel> mResultadosDeBusqueda;
	private TituloModel mTituloSelecionado;
	private boolean mBuscando;
	
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
		  
		  BusquedaSimpleModel search = new BusquedaSimpleModel();
		  search.setPalabraClave(pPalabraClave);
		  
		  if("Película o serie".equals(pCriterio)){
			  search.setBusquedaPorNombre(true);
		  }else if("Director".equals(pCriterio)){
			  search.setBusquedaPorDirector(true);
		  }
		  
		  LogicFactory factory = new LogicFactory();
		  IBusquedaLogica searchLogic = factory.getBusquedaLogica();
		  this.mResultadosDeBusqueda = search.getResultadoBusqueda();
		  search = searchLogic.BusquedaSimple(search);
		  
		return Response.ok(new Viewable( "/BusquedaDeTitulo", search  )).build();
	  }
	  
	  @Path("/Mostrar")
	  @POST
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response requestShowTitle(
			  @FormParam("verTitulo") String pTitulo,
			  @FormParam("verTipo") String pTipo){
		  
		  System.out.println("pasa a mostrar el perfil de titulo");
		  System.out.println(pTitulo);
		  System.out.println("el tipo de titulo es");
		  System.out.println(pTipo);
		  
		  TituloModel selectedTitle = new TituloModel();
		  selectedTitle.setNombre(pTitulo);
		  selectedTitle.setTipoDeTitulo(Integer.parseInt(pTipo));
		  
		  /*for (int contador = 0; contador < this.mResultadosDeBusqueda.size(); contador++){
			  if (this.mResultadosDeBusqueda.get(contador).getNombre().equals(pTitulo)){
				  selectedTitle = new TituloModel();
				  selectedTitle.setNombre(pTitulo);
				  break;
			  }
		  }*/
		  
		  Busquedas search = new Busquedas();
		  search.buscarDatosDeTitulo(selectedTitle);
		  return Response.ok(new Viewable("/PerfilTitulo",selectedTitle )).build();
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
		  
		  reviewModel.setTitulo(pNombreTitulo);
		  reviewModel.setContenido(pReview);
		  reviewModel.setAutor("emma");//Cambiar esto
		  
		  try{
			  reviewModel.setCalificacionDeExperto(Float.parseFloat(pScore));
		  }catch(Exception e){}
		  
		  boolean isValid = review.crearResenna(reviewModel);
		  
		  if (isValid){
			  System.out.println("Se guardo buen la resenna");
			  return Response.ok(new Viewable("/PerfilTitulo",this.mTituloSelecionado )).build();
		  }
		  
		  return Response.ok(new Viewable("/BusquedaDeTitulo",this.mTituloSelecionado )).build();
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
	  

	/**
	 * @return the mResultadosDeBusqueda
	 */
	public List<TituloModel> getResultadosDeBusqueda() {
		return mResultadosDeBusqueda;
	}

	/**
	 * @param mResultadosDeBusqueda the mResultadosDeBusqueda to set
	 */
	public void setResultadosDeBusqueda(List<TituloModel> mResultadosDeBusqueda) {
		this.mResultadosDeBusqueda = mResultadosDeBusqueda;
	}

	/**
	 * @return the mTituloSelecionado
	 */
	public TituloModel getTituloSelecionado() {
		return mTituloSelecionado;
	}

	/**
	 * @param mTituloSelecionado the mTituloSelecionado to set
	 */
	public void setTituloSelecionado(TituloModel mTituloSelecionado) {
		this.mTituloSelecionado = mTituloSelecionado;
	}

}
