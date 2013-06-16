/**
 * 
 */
package repositories;

import java.util.List;

import models.Genero;
import models.Resenna;
import models.Titulo;

/**
 * @author emma
 *
 */
public class CatalogosRepository{
	
	public void getInfoCompleto( Titulo pTitulo ){
	}
	
	public void addTitulo( Titulo pTitulo ){
	}
	
	public void buscarPorNombre( Titulo pTitulo, String pNombre ){
	}
	
	public void buscarPorDirector( Titulo pTitulo, String pNombre ){
	}
	
	public void getResennas(  Resenna pResenna  ){
	}
	
	public void getRessennaCompleta( Resenna pResenna ){
		pResenna.setId(123);
		pResenna.setIdExperto(456);
		pResenna.setNombreAutor("Max Soto");
		pResenna.setContenido("Some content here...");
	}
	
	public void getGenerosFrom( List<Genero> pGeneros , String pTimestamp ){
		Genero genero1 = new Genero();
		genero1.setId(1233);
		genero1.setNombre("Drama");
		genero1.setDescripcion("Some description here...");
		pGeneros.add(genero1);
	}
	
	public int getCantidadGeneros(){
		return 183;
	}
	
	public void getGeneros( List<Genero> pGeneros , int page ){
		for (int i=1;i<=20;i++){
			Genero gen = new Genero();
			gen.setId(i);
			gen.setNombre("Genero" + Integer.toString(i+20*page));
			gen.setDescripcion("Some description here...");
		}
	}
	
	public void getTitulosFrom( List<Titulo> pTitulos , String pTimestamp ){

		Titulo titulo1 = new Titulo();
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
