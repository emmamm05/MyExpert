package logic;

import java.util.List;

import models.BusquedaSimpleModel;
import models.PelicualModel;
import models.TituloModel;
import models.GeneroModel;

import repositories.TitleRepository;

/**
 * 
 * @author Luis Alonso
 *
 */
public class Busquedas {
	
	private String mCriterioDeBusqueda;
	private List<String> mResultadoTitulos;
	private List<Integer> mPuntuacionResultadoTitulos;
	private List<TituloModel> mResultadosDeBusqueda;
	
	/**
	 * Construcctor
	 */
	public Busquedas(){
		
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
	public void busquedaSimple(BusquedaSimpleModel pBusquedaModel){
		
		TitleRepository titleRepository = new TitleRepository();
		if (pBusquedaModel.getBusquedaPorDirector()){
			this.mResultadoTitulos =  titleRepository.buscarPorDirector(pBusquedaModel.getPalabraClave());
			this.mPuntuacionResultadoTitulos = titleRepository.buscarPorDirector_aux(pBusquedaModel.getPalabraClave());
		}else if (pBusquedaModel.getBusquedaPorNombre()){
			this.mResultadoTitulos = titleRepository.buscarPorNombre(pBusquedaModel.getPalabraClave());
			this.mPuntuacionResultadoTitulos = titleRepository.buscarPorNombre_aux(pBusquedaModel.getPalabraClave());
		}
		
		for (int contador = 0; contador < this.mResultadoTitulos.size(); contador++){
			PelicualModel titleModel = new PelicualModel();
			titleModel.setNombre(this.mResultadoTitulos.get(contador));
			titleModel.setCalificacionesComunidad(this.mPuntuacionResultadoTitulos.get(contador));
			
			this.mResultadosDeBusqueda.add(titleModel);
		}
		
	}
	
	/**
	 * Se encarga de solicitar y configurar la informacion 
	 * de un titulo dentro del modelo de dicho modelo
	 * @param pTitulo: modelo del titulo al que quieremos mostrar la informacion
	 * @return se retorna el modelo con la infomacion completa (en caso de tener exito)
	 */
	public TituloModel buscarDatosDeTitulo(TituloModel pTitulo){
		
		TitleRepository titleRepository = new TitleRepository();
		GeneroModel generoTitulo = new GeneroModel();
		
		List<String> informacionDeTitulo = titleRepository.buscarInformacionDeTitulo(pTitulo.getNombre());
		List<Integer> calificacionesDeTitulo = titleRepository.buscarCalificacionesDeTitulo(pTitulo.getNombre());
		List<String> genero = titleRepository.buscarGeneroDeTitulo(pTitulo.getNombre());
		
		pTitulo.setDescripcion(informacionDeTitulo.get(0));//*
		pTitulo.setDirector(informacionDeTitulo.get(1));//*
		pTitulo.setCalificacionesIMDB(calificacionesDeTitulo.get(0));
		pTitulo.setCalificacionesComunidad(calificacionesDeTitulo.get(1));
		pTitulo.setAnno(titleRepository.buscarPublicacionDeTitulo(pTitulo.getNombre()));
		pTitulo.setCalificacionExpertos(titleRepository.buscarCalificaionDeExpertos(pTitulo.getNombre()));
		
		generoTitulo.setNombre(genero.get(0));
		generoTitulo.setDescripcion(genero.get(1));
		
		pTitulo.setGenero(generoTitulo);
		
		return pTitulo;
	}

}
