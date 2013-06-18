/**
 * 
 */
package repositories;

import java.util.List;

import models.GeneroModel;
import models.ResennaModel;
import models.TituloModel;

/**
 * @author emma
 *
 */
public class CatalogosRepository{
	
	public void getInfoCompleto( TituloModel pTitulo ){
	}
	
	public void addTitulo( TituloModel pTitulo ){
	}
	
	public void buscarPorNombre( TituloModel pTitulo, String pNombre ){
	}
	
	public void buscarPorDirector( TituloModel pTitulo, String pNombre ){
	}
	
	public void getResennas(  ResennaModel pResenna  ){
	}
	
	public void getRessennaCompleta( ResennaModel pResenna ){
	}
	
	public void getGenerosFrom( List<GeneroModel> pGeneros , String pTimestamp ){
		GeneroModel genero1 = new GeneroModel();
		genero1.setId(1233);
		genero1.setNombre("Drama");
		genero1.setDescripcion("Some description here...");
		pGeneros.add(genero1);
	}
	
	public int getCantidadGeneros(){
		return 183;
	}
	
	public void getGeneros( List<GeneroModel> pGeneros , int page ){
		for (int i=1;i<=20;i++){
			GeneroModel gen = new GeneroModel();
			gen.setId(i);
			gen.setNombre("Genero" + Integer.toString(i+20*page));
			gen.setDescripcion("Some description here...");
		}
	}
	
	public void getTitulosFrom( List<TituloModel> pTitulos , String pTimestamp ){

	}
}
