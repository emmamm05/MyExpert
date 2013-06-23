package logic;

public class LogicFactory {

	static IAutorizacionLogic mUniqueAutorizationLogic;

	public ICuentaLogic createCuentaLogic() {
		return new CuentaLogic();
	}

	public ICatalogosLogic createCatalogosLogic() {
		return new CatalogosLogic();
	}

	public IBuzonLogic createBuzonLogic() {
		return new BuzonLogic();
	}

	public IResennaLogic createResennaLogic() {
		return new ResennaLogic();
	}

	public IAutorizacionLogic createAutorizacionLogic() {
		if (mUniqueAutorizationLogic == null) {
			mUniqueAutorizationLogic = new Login();
		}
		return mUniqueAutorizationLogic;
	}

}
