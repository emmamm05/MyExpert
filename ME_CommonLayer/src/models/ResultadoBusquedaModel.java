package models;

import java.util.List;

/**
 * Encargada de manejar lo correspondiente al resultado de la busqueda de los
 * titulos dentro de la base de datos
 * @author Luis Alonso
 *
 */
public class ResultadoBusquedaModel{
	
	private List<TituloModel> mResultadoBusquedaTitulo;
	
	/**
	 * Construcctor
	 */
	public ResultadoBusquedaModel(){
		
	}

	/**
	 * @return the mResultadoBusquedaTitulo
	 */
	public List<TituloModel> getResultadoBusquedaTitulo() {
		return mResultadoBusquedaTitulo;
	}

	/**
	 * @param mResultadoBusquedaTitulo the mResultadoBusquedaTitulo to set
	 */
	public void setResultadoBusquedaTitulo(List<TituloModel> mResultadoBusquedaTitulo) {
		this.mResultadoBusquedaTitulo = mResultadoBusquedaTitulo;
	}
}
