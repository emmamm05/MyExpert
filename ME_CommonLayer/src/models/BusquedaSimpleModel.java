package models;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * Se encarga de manejar los modelos correpondiente a la busqueda de titulos dentro del sistema MyExpert
 * @author Luis Alonso
 *
 */
@XmlRootElement(name = "busquedasimple")
public class BusquedaSimpleModel{
	
	private boolean mBusquedaPorNombre;
	private boolean mBusquedaPorDirector;
	private String mPalabraClave;
	private List<TituloModel> mResultadoBusqueda;
	
	/**
	 * Constructor
	 */
	public BusquedaSimpleModel(){
		
	}

	/**
	 * @return the mBusquedaPorNombre
	 */
	public boolean getBusquedaPorNombre() {
		return mBusquedaPorNombre;
	}

	/**
	 * @param mBusquedaPorNombre the mBusquedaPorNombre to set
	 */
	public void setBusquedaPorNombre(boolean mBusquedaPorNombre) {
		this.mBusquedaPorNombre = mBusquedaPorNombre;
	}

	/**
	 * @return the mBusquedaPorDirector
	 */
	public boolean getBusquedaPorDirector() {
		return mBusquedaPorDirector;
	}

	/**
	 * @param mBusquedaPorDirector the mBusquedaPorDirector to set
	 */
	public void setBusquedaPorDirector(boolean mBusquedaPorDirector) {
		this.mBusquedaPorDirector = mBusquedaPorDirector;
	}

	/**
	 * @return the mPalabraClave
	 */
	public String getPalabraClave() {
		return mPalabraClave;
	}

	/**
	 * @param mPalabraClave the mPalabraClave to set
	 */
	public void setPalabraClave(String mPalabraClave) {
		this.mPalabraClave = mPalabraClave;
	}

	/**
	 * @return the mResultadoBusqueda
	 */
	@XmlElement
	public List<TituloModel> getResultadoBusqueda() {
		return mResultadoBusqueda;
	}

	/**
	 * @param mResultadoBusqueda the mResultadoBusqueda to set
	 */
	public void setResultadoBusqueda(List<TituloModel> mResultadoBusqueda) {
		this.mResultadoBusqueda = mResultadoBusqueda;
	}
	
	
}
