package repositories;

import java.sql.ResultSet;

/**
 * 
 * @author Luis Alonso
 *
 */
public interface ITitulosDataAccess {
	
	public boolean almacenarResenna(String pTitulo, String pContenidoResenna, String pAutor, float pPuntuacion);
	public ResultSet getTitulosPorDirector(String pNombreDirector);
	public ResultSet getTitulosPorTitulo(String pNombreTitulo);
}
