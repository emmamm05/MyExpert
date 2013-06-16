package logic;

/**
 * 
 * @author Luis Alonso
 *
 */
public class Busquedas {
	
	private String mCriterioDeBusqueda;
	private String mResultadoTitulos;
	private int mPuntuacionResultadoTitulos;
	
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
	public String getResultadoTitulos() {
		return mResultadoTitulos;
	}

	/**
	 * @param mResultadoTitulos the mResultadoTitulos to set
	 */
	public void setResultadoTitulos(String mResultadoTitulos) {
		this.mResultadoTitulos = mResultadoTitulos;
	}

	/**
	 * @return the mPuntuacionResultadoTitulos
	 */
	public int getPuntuacionResultadoTitulos() {
		return mPuntuacionResultadoTitulos;
	}

	/**
	 * @param mPuntuacionResultadoTitulos the mPuntuacionResultadoTitulos to set
	 */
	public void setPuntuacionResultadoTitulos(int mPuntuacionResultadoTitulos) {
		this.mPuntuacionResultadoTitulos = mPuntuacionResultadoTitulos;
	}
	
	/**
	 * 
	 * @param pPalabraClave: Palabra utilizada para encontrar el titulo o titulos que el usuario
	 * desea encontrar en la base de datos
	 */
	public void busquedaSimple(String pPalabraClave){
		
	}

}
