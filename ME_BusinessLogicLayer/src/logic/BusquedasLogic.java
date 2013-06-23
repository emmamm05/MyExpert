package logic;

import java.util.List;

import models.BusquedaSimpleModel;
import models.PeliculaModel;
import models.TemporadaModel;
import models.TituloModel;
import models.GeneroModel;
import repositories.IRepositorioTitulos;
import repositories.RepositoriesFactory;

/**
 * 
 * @author Luis Alonso
 *
 */
public class BusquedasLogic implements IBusquedasLogic{
	
	private String mCriterioDeBusqueda;
	private List<String> mResultadoTitulos;
	private List<Integer> mPuntuacionResultadoTitulos;
	private List<TituloModel> mResultadosDeBusqueda;
	
	/**
	 * Construcctor
	 */
	public BusquedasLogic(){
		
	}

	/**
	 * @return the mCriterioDeBusqueda
	 */
	public String getCriterioDeBusqueda() {
		return mCriterioDeBusqueda;
	}

	/**
	 * @param mCriterioDeBusqueda the mCriterioDeBusqueda to set
	 */
	public void setCriterioDeBusqueda(String mCriterioDeBusqueda) {
		this.mCriterioDeBusqueda = mCriterioDeBusqueda;
	}

	/**
	 * @return the mResultadoTitulos
	 */
	public List<String> getResultadoTitulos() {
		return mResultadoTitulos;
	}

	/**
	 * @param mResultadoTitulos the mResultadoTitulos to set
	 */
	public void setResultadoTitulos(List<String> mResultadoTitulos) {
		this.mResultadoTitulos = mResultadoTitulos;
	}

	/**
	 * @return the mPuntuacionResultadoTitulos
	 */
	public List<Integer> getPuntuacionResultadoTitulos() {
		return mPuntuacionResultadoTitulos;
	}

	/**
	 * @param mPuntuacionResultadoTitulos the mPuntuacionResultadoTitulos to set
	 */
	public void setPuntuacionResultadoTitulos(
			List<Integer> mPuntuacionResultadoTitulos) {
		this.mPuntuacionResultadoTitulos = mPuntuacionResultadoTitulos;
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
	 * 
	 * @param pPalabraClave: Palabra utilizada para encontrar el titulo o titulos que el usuario
	 * desea encontrar en la base de datos
	 */
	public BusquedaSimpleModel BusquedaSimple(BusquedaSimpleModel pBusqueda){
		
		RepositoriesFactory factory = new RepositoriesFactory();
		IRepositorioTitulos repoTitle = factory.getCatalogRepositorie();
		
		if (pBusqueda.getBusquedaPorDirector()){
			repoTitle.buscarPorDirector(pBusqueda);
		}else{
			repoTitle.buscarPorNombre(pBusqueda);
		}
		return pBusqueda;
	}
	
	/**
	 * Se encarga de solicitar y configurar la informacion 
	 * de un titulo dentro del modelo de dicho modelo
	 * @param pTitulo: modelo del titulo al que quieremos mostrar la informacion
	 * @return se retorna el modelo con la infomacion completa (en caso de tener exito)
	 */
	public void buscarDatosDeTitulo(TituloModel pTitulo){
		
		//PeliculaModel pelicula = null;
		//TemporadaModel temporada = null;
		
		RepositoriesFactory factory = new RepositoriesFactory();
		IRepositorioTitulos repoTitle = factory.getCatalogRepositorie();
		
		repoTitle.getInfoTitulo(pTitulo);
		/*if (pTitulo.getTipoDeTitulo() == 1){
			  pelicula = (PeliculaModel)pTitulo;
			  repoTitle.getInfoTitulo(pelicula);
		  }else{
			  temporada = (TemporadaModel)pTitulo;
			  repoTitle.getInfoTemporada(temporada);
		  }*/
	}



}
