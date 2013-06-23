package logic;

/**
 * Clase encargada de intancias los respectivos objetos
 * de logica necesaira, segun el contexto
 * 
 * @author Luis Alonso
 *
 */
public class LogicFactory {

	static IAutorizacionLogic mUniqueAutorizationLogic;
	/**
	 * Constructor
	 */
	public LogicFactory(){
		
	}
	
	/**
	 * Metodo encargado de de instanciar a clase Cuneta logica
	 * @return objeto CuentaLofica
	 */
	public ICuentaLogic getLogicaCuenta(){
		return new CuentaLogica();
	}
	
	/**
	 * Metodo encargado de instanciar a la clase ResennaDeTitulo
	 * @return objeto Resenna de Titulo
	 */
	public IResennaTitulo getResennaLogica(){
		return new ResennasDeTitulos();
	}
	
	/**
	 * Metodo encargado de instancia a la clase BusquedaLogica
	 * @return objeto BusquedaLogica
	 */
	public IBusquedaLogica getBusquedaLogica(){
		return new Busquedas();
	}

	
	public ICatalogosLogic createCatalogosLogic() {
		return new CatalogosLogic();
	}

	public IBuzonLogic createBuzonLogic() {
		return new BuzonLogic();
	}
	public IAutorizacionLogic createAutorizacionLogic() {
		if (mUniqueAutorizationLogic == null) {
			mUniqueAutorizationLogic = new Login();
		}
		return mUniqueAutorizationLogic;
	}

}
