/**
 * 
 */
package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import models.GeneroModel;
import models.PuntuacionesXmlModel;
import models.ResennaModel;
import models.TituloModel;

/**
 * @author emma
 *
 */
public class RepositorioTitulos implements IRepositorioTitulos{

	@Override
	public void getInfoTitulo(TituloModel pCodigoTitulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTitulo(TituloModel pTitulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TituloModel> buscarPorNombre(String pTitulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TituloModel> buscarPorDirector(String pDirector) {
		return null;
	}

	@Override
	public List<ResennaModel> getResennas(String pCodigoTitulo) {

		TitulosDataAccess dataAccess = new TitulosDataAccess();
		List<ResennaModel> listaResennas = new ArrayList<ResennaModel>();
		
		try{
			ResultSet rs = dataAccess.getResenna(pCodigoTitulo);
			while ( rs.next() ){
				
				ResennaModel resenna = new ResennaModel();
				//resenna.setCalificacionDeExperto( rs.getInt("Puntuacion") );
				//resenna.setFechaDePublicacion( rs.getTimestamp("FechaCreacion") );
				resenna.setCodigoTitulo( pCodigoTitulo );
				resenna.setAutor( rs.getString("Nombre") + " " + rs.getString("Apellido1"));
				resenna.setCodigoAutor( rs.getString("Username") );
				
				listaResennas.add(resenna);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaResennas;
	}

	@Override
	public void getResennaCompleta(ResennaModel pResenna) {
		TitulosDataAccess dataAccess = new TitulosDataAccess();
		try {
			ResultSet rs 
				= dataAccess.getResennaCompleta( pResenna.getCodigoTitulo(), pResenna.getCodigoAutor() );
			while ( rs.next() ){
				pResenna.setContenido( rs.getString("Resena") );
				pResenna.setCalificacionDeExperto( rs.getInt("Puntuacion") );
				pResenna.setFechaDePublicacion( rs.getTimestamp("FechaCreacion") );
				pResenna.setCodigoTitulo( rs.getString("Codigo") );
				pResenna.setAutor( rs.getString("Nombre") + " " + rs.getString("Apellido1"));
				pResenna.setCodigoAutor( rs.getString("Username") );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<TituloModel> getTitulos(Timestamp pTimestamp) {
		TitulosDataAccess dataAccess = new TitulosDataAccess();
		List<TituloModel> listaTitulos = new ArrayList<TituloModel>();
		try {
			ResultSet rs = dataAccess.getTitulos(pTimestamp);
			while ( rs.next() ){
				System.out.println( rs.getString("Nombre") );
				
				TituloModel titulo = new TituloModel();
				titulo.setId(rs.getInt("idTitulo"));
				titulo.setNombre(rs.getString("Nombre"));
				titulo.setDescripcion(rs.getString("Descripcion"));
				titulo.setAnno(rs.getInt("Año"));

				listaTitulos.add(titulo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaTitulos;
	}

	@Override
	public List<TituloModel> getAllTitulos() {
		// TODO Auto-generated method stub
		return this.getTitulos(Timestamp.valueOf("1980-01-01 00:00:00"));
	}

	@Override
	public void getPuntuaciones(PuntuacionesXmlModel pModel) {
		TitulosDataAccess dataAccess = new TitulosDataAccess();
		try {
			System.out.println(pModel.getCodigoTitulo());
			ResultSet rs
				= dataAccess.getTitulo(pModel.getCodigoTitulo());
			rs.next();
			pModel.setCalificacionIMDB( rs.getInt("Calificacion") );
			
			ResultSet rs2 
				= dataAccess.getPuntuacionesExpertos(pModel.getCodigoTitulo());
			while ( rs2.next() ){
				pModel.addPuntuacion( rs2.getString("Username"), rs2.getInt("Puntuacion") );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	}

}
