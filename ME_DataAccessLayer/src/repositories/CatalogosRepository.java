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
		pResenna.setId(123);
		pResenna.setIdExperto(456);
		pResenna.setNombreAutor("Max Soto");
		pResenna.setContenido("Some content here...");
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

		TituloModel titulo1 = new TituloModel();
		titulo1.setId(1234);
		titulo1.setNombre("Man of Steel");
		titulo1.setDateTime(null);
		titulo1.setDescripcion("Some description here...");
		titulo1.setDirectores("Zack Snyder, Cristopher Nolan");
		titulo1.setCalificacionesExpertos(null);
		titulo1.setCalificacionComunidad(10);
		pTitulos.add(titulo1);
	}
}
