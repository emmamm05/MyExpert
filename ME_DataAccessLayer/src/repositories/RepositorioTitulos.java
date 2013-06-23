/**
 * 
 */
package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import models.GeneroModel;
import models.PuntuacionesXmlModel;
import models.ResennaModel;
import models.TituloModel;
import models.PeliculaModel;
import models.TemporadaModel;
import models.BusquedaSimpleModel;

/**
 * @author emma
 *
 */
public class RepositorioTitulos implements IRepositorioTitulos{
	
	/**
	 * Metodo que tiene como funcion la de obtener, por medio del data access,
	 * la informacion adicional necesarioa para mostar el perfil de un titulo
	 * determinado
	 */
	public void getInfoTitulo( TituloModel pCodigoTitulo ){
		TituloDataAccess dataAccess = new TituloDataAccess();
		ResultSet result = dataAccess.getInformacionAdicionalDeTitulo(pCodigoTitulo.getNombre());
		try{
			while (result.next()){
				pCodigoTitulo.setAnno(result.getInt(1));
				//pCodigoTitulo.setDuracion(result.getFloat(3));
				//pCodigoTitulo.setFechaDePublicacion(result.getDate(4));
				pCodigoTitulo.setLinkYouTube(result.getString(5));
				String nombreDirector = result.getString(6) + " " + result.getString(7);
				pCodigoTitulo.setDirector(nombreDirector);
			}
		}catch(Exception e){
			System.out.println("Error de query");
			e.printStackTrace();
		}
	}

	@Override
	public void addTitulo(TituloModel pTitulo, String pCodigoUsuario) {
		TitulosDataAccess dataAccess = new TitulosDataAccess();

	    Object[] params = {
			pTitulo.getNombre(),
			pTitulo.getDescripcion(),
			pTitulo.getCodigo(),
			pTitulo.getAnno(),
			1,
			pTitulo.getDirector(),
			120f,
			null,
			pCodigoUsuario,
			null,
			1,
			pTitulo.getLinkYoutube() };
		try {
			dataAccess.addTitulo( params );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	/**
	 * Metodo que tiene como funcion la de obtener, por medio del data access,
	 * la informacion adicional necesarioa para mostar el perfil de un titulo
	 * determinado
	 */
	public void getInfoTemporada(TemporadaModel pCodigoTitulo){
		TituloDataAccess dataAccess = new TituloDataAccess();
		ResultSet result = dataAccess.getInformacionAdicionalDeTitulo(pCodigoTitulo.getNombre());
		try{
			while (result.next()){
				pCodigoTitulo.setAnno(result.getInt(1));
				//pCodigoTitulo.setDuracion(result.getFloat(3));
				//pCodigoTitulo.setFechaDePublicacion(result.getDate(4));
				pCodigoTitulo.setLinkYouTube(result.getString(5));
			}
		}catch(Exception e){
			System.out.println("Error de query");
			e.printStackTrace();
		}
		
	}

	public void buscarPorDirector( BusquedaSimpleModel pBusqueda ){
		
		pBusqueda.setResultadoBusqueda(new ArrayList<TituloModel>());
		TituloDataAccess dataAccess = new TituloDataAccess();
		ResultSet result = dataAccess.getTitulosPorDirector(pBusqueda.getPalabraClave());
		
		try {
			while(result.next()){
				String nombre = result.getString(1);
				String descripcion = result.getString(2);
				String director = result.getString(3);
				int tipoTitulo = result.getInt(4);
				
				if (tipoTitulo == 1){
					PeliculaModel resultTitle = new PeliculaModel();
					resultTitle.setNombre(nombre);
					resultTitle.setDescripcion(descripcion);
					resultTitle.setTipoDeTitulo(tipoTitulo);
					resultTitle.setDirector(director);
					pBusqueda.getResultadoBusqueda().add(resultTitle);
				}else{
					TemporadaModel resultTitle = new TemporadaModel();
					resultTitle.setNombre(nombre);
					resultTitle.setDescripcion(descripcion);
					resultTitle.setTipoDeTitulo(tipoTitulo);
					resultTitle.setDirector(director);
					pBusqueda.getResultadoBusqueda().add(resultTitle);
				}
				
			}
		} catch (SQLException e) {
			System.out.println("Error de query");
			e.printStackTrace();
		}
	}

	public void buscarPorNombre( BusquedaSimpleModel pBusqueda ){
		
		pBusqueda.setResultadoBusqueda(new ArrayList<TituloModel>());
		TituloDataAccess dataAccess = new TituloDataAccess();
		ResultSet result = dataAccess.getTitulosPorTitulo(pBusqueda.getPalabraClave());
		
		try {
			
			while(result.next()){
			
				String nombre = result.getString(1);
				String descripcion = result.getString(2);
				int tipoTitulo = result.getInt(3);
				String director = result.getString(4) + " " + result.getString(5);
				
				if (tipoTitulo == 1){
					PeliculaModel resultTitle = new PeliculaModel();
					resultTitle.setNombre(nombre);
					resultTitle.setDescripcion(descripcion);
					resultTitle.setTipoDeTitulo(tipoTitulo);
					resultTitle.setDirector(director);
					pBusqueda.getResultadoBusqueda().add(resultTitle);
				}else{
					TemporadaModel resultTitle = new TemporadaModel();
					resultTitle.setNombre(nombre);
					resultTitle.setDescripcion(descripcion);
					resultTitle.setTipoDeTitulo(tipoTitulo);
					resultTitle.setDirector(director);
					pBusqueda.getResultadoBusqueda().add(resultTitle);
				}
				
			}
		} catch (SQLException e) {
			System.out.println("Error de query");
			e.printStackTrace();
		}
	}



	@Override
	public List<ResennaModel> getResennas(String pCodigoTitulo) {

		TitulosDataAccess dataAccess = new TitulosDataAccess();
		List<ResennaModel> listaResennas = new ArrayList<ResennaModel>();
		
		try{
			ResultSet rs = dataAccess.getResenna(pCodigoTitulo);
			while ( rs.next() ){
				
				ResennaModel resenna = new ResennaModel();
				//resenna.setCalificacionDeExperto( rs.getInt("Puntuacion") );
				//resenna.setFechaDePublicacion( rs.getTimestamp("FechaCreacion") );
				resenna.setCodigoTitulo( pCodigoTitulo );
				resenna.setAutor( rs.getString("Nombre") + " " + rs.getString("Apellido1"));
				resenna.setCodigoAutor( rs.getString("Username") );
				
				listaResennas.add(resenna);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaResennas;
	}

	@Override
	public void getResennaCompleta(ResennaModel pResenna) {
		TitulosDataAccess dataAccess = new TitulosDataAccess();
		try {
			ResultSet rs 
				= dataAccess.getResennaCompleta( pResenna.getCodigoTitulo(), pResenna.getCodigoAutor() );
			while ( rs.next() ){
				pResenna.setContenido( rs.getString("Resena") );
				pResenna.setCalificacionDeExperto( rs.getInt("Puntuacion") );
				pResenna.setFechaDePublicacion( rs.getTimestamp("FechaCreacion") );
				pResenna.setCodigoTitulo( rs.getString("Codigo") );
				pResenna.setAutor( rs.getString("Nombre") + " " + rs.getString("Apellido1"));
				pResenna.setCodigoAutor( rs.getString("Username") );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<TituloModel> getTitulos(Timestamp pTimestamp) {
		TitulosDataAccess dataAccess = new TitulosDataAccess();
		List<TituloModel> listaTitulos = new ArrayList<TituloModel>();
		try {
			ResultSet rs = dataAccess.getTitulos(pTimestamp);
			while ( rs.next() ){
				System.out.println( rs.getString("Nombre") );
				
				TituloModel titulo = new TituloModel();
				titulo.setCodigo("Codigo");
				titulo.setNombre(rs.getString("Nombre"));
				titulo.setDescripcion(rs.getString("Descripcion"));
				titulo.setAnno(rs.getInt("Año"));

				listaTitulos.add(titulo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaTitulos;
	}

	public boolean guardarResennaDeTitulo(ResennaModel pResenna){
		
		TituloDataAccess dataAccess = new TituloDataAccess();
		return dataAccess.almacenarResenna(pResenna.getTitulo(), pResenna.getContenido(), pResenna.getAutor(), pResenna.getCalificacionDeExperto());
		
	}
	
	public void getGenerosFrom( List<GeneroModel> pGeneros , String pTimestamp ){
	}
	
	public int getCantidadGeneros(){
		return 183;
	}
	
	public void getGeneros( List<GeneroModel> pGeneros , int page ){
	}

	
	@Override
	public List<TituloModel> getAllTitulos() {
		// TODO Auto-generated method stub
		return this.getTitulos(Timestamp.valueOf("1980-01-01 00:00:00"));
	}

	@Override
	public void getPuntuaciones(PuntuacionesXmlModel pModel) {
		TitulosDataAccess dataAccess = new TitulosDataAccess();
		try {
			System.out.println(pModel.getCodigoTitulo());
			ResultSet rs
				= dataAccess.getTitulo(pModel.getCodigoTitulo());
			rs.next();
			pModel.setCalificacionIMDB( rs.getInt("Calificacion") );
			
			ResultSet rs2 
				= dataAccess.getPuntuacionesExpertos(pModel.getCodigoTitulo());
			rs2.next();
			pModel.setCalificacionExpertos(rs2.getFloat("Puntuacion"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	}

	@Override
	public void addTitulo(TituloModel pTitulo) {
		// TODO Auto-generated method stub
		
	}

		
	public void getTitulosFrom( List<TituloModel> pTitulos , String pTimestamp ){

	}

}
