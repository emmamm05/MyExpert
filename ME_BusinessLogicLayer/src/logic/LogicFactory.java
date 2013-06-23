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
		return new CuentaLogic();
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
	public IBusquedasLogic getBusquedaLogica(){
		return new BusquedasLogic();
	}

	
	public ICatalogosLogic createCatalogosLogic() {
		return new CatalogosLogic();
	}

	public IBuzonLogic createBuzonLogic() {
		return new BuzonLogic();
	}
	
	public IResennaLogic createResennaLogic(){
		return new ResennaLogic();
	}
	
	public IAutorizacionLogic createAutorizacionLogic() {
		if (mUniqueAutorizationLogic == null) {
			mUniqueAutorizationLogic = new Login();
		}
		return mUniqueAutorizationLogic;
	}

	public ICuentaLogic createCuentaLogic() {
		// TODO Auto-generated method stub
		return new CuentaLogic();
	}
	
	public IBusquedasLogic createBusquedaLogic(){
		return new BusquedasLogic();
	}
}
