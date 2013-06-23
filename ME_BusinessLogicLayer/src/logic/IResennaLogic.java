package logic;

import java.util.List;

import models.ResennaModel;

public interface IResennaLogic {
	
	public void crearResenna( ResennaModel pResenna );
	public List<ResennaModel> getResennas( String pCodigoTitulo );
	public void getResennaCompleta( ResennaModel pResenna );
	
}
