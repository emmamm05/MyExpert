package models;

/**
 * Encargada de manejar los datos de genero de determinado titulo
 * @author Luis Alonso
 *
 */
public class GeneroModel implements IModel{
	
	private int mId;
	private String mNombre;
	private String mDescripcion;
	
	/**
	 * Constructor
	 */
	public GeneroModel(){
		
	}

	/**
	 * @return the mId
	 */
	public int getId() {
		return mId;
	}

	/**
	 * @param mId the mId to set
	 */
	public void setId(int mId) {
		this.mId = mId;
	}

	/**
	 * @return the mNombre
	 */
	public String getNombre() {
		return mNombre;
	}

	/**
	 * @param mNombre the mNombre to set
	 */
	public void setNombre(String mNombre) {
		this.mNombre = mNombre;
	}

	/**
	 * @return the mDescripcion
	 */
	public String getDescripcion() {
		return mDescripcion;
	}

	/**
	 * @param mDescripcion the mDescripcion to set
	 */
	public void setDescripcion(String mDescripcion) {
		this.mDescripcion = mDescripcion;
	}
}
