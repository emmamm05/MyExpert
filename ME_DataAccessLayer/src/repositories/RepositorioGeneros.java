package repositories;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import models.GeneroModel;

public class RepositorioGeneros implements IRepositorioGeneros {

	@Override
	public List<GeneroModel> getGeneros(Timestamp pTimestamp) {
		GenerosDataAccess dataAccess = new GenerosDataAccess();
		List<GeneroModel> listaGeneros = new ArrayList<GeneroModel>();
		try {
			ResultSet rs = dataAccess.getGeneros(pTimestamp);
			while ( rs.next() ){
				System.out.println( rs.getString("Nombre") );
				
				GeneroModel genero = new GeneroModel();
				genero.setCodigo(rs.getString("Codigo"));
				genero.setNombre(rs.getString("Nombre"));
				genero.setDescripcion(rs.getString("Descripcion"));
				genero.setEnabled(rs.getBoolean("Enabled"));
				listaGeneros.add(genero);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaGeneros;
	}

	@Override
	public List<GeneroModel> getAllGeneros() {
		// TODO Auto-generated method stub
		return this.getGeneros(Timestamp.valueOf("1980-01-01 00:00:00"));
	}

	@Override
	public boolean addGenero(GeneroModel pGenero, String pUsuario) {
		// TODO Auto-generated method stub
		GenerosDataAccess dataAccess = new GenerosDataAccess();
		try {
			dataAccess.addGenero(
					pGenero.getNombre(),
					pGenero.getDescripcion(),
					pGenero.getCodigo(),
					pUsuario
					);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deshabilitarGenero(String pCodigo) {
		// TODO Auto-generated method stub
		GenerosDataAccess dataAccess = new GenerosDataAccess();
		try {
			dataAccess.deshabilitarGenero(pCodigo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public boolean habilitarGenero(String pCodigo) {
		// TODO Auto-generated method stub
		GenerosDataAccess dataAccess = new GenerosDataAccess();
		try {
			dataAccess.habilitarGenero(pCodigo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean getGenero(GeneroModel pGenero) {
		GenerosDataAccess dataAccess = new GenerosDataAccess();
		try {
			ResultSet rs = dataAccess.getGenero(pGenero.getCodigo());
			while ( rs.next() ){
				System.out.println( rs.getString("Nombre") );
				
				pGenero.setCodigo(rs.getString("Codigo"));
				pGenero.setNombre(rs.getString("Nombre"));
				pGenero.setDescripcion(rs.getString("Descripcion"));
				pGenero.setEnabled(rs.getBoolean("Enabled"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean editGenero(GeneroModel pGenero, String pUsuario) {
		GenerosDataAccess dataAccess = new GenerosDataAccess();
		try {
			dataAccess.editGenero(
					pGenero.getNombre(),
					pGenero.getDescripcion(),
					pGenero.getCodigo(),
					pUsuario
					);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	

}
