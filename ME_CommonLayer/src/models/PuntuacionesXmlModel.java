package models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "puntuacion")
//class PuntuacionXmlModel{
//	private String mCodigoAutor;
//	private Integer mPuntuacion;
//	
//	PuntuacionXmlModel(){
//		
//	}
//	
//	@XmlElement
//	public String getCodigoAutor(){
//		return mCodigoAutor;
//	}
//	
//	@XmlElement
//	public Integer getPuntuacion(){
//		return mPuntuacion;
//	}
//	
//	public void setCodigoAutor( String pCodigoAutor ){
//		mCodigoAutor = pCodigoAutor;
//	}
//	
//	public void setPuntuacion( Integer pPuntuacion ){
//		mPuntuacion = pPuntuacion;
//	}
//}

@XmlRootElement(name = "puntuaciones")
public class PuntuacionesXmlModel {
	
	private String mCodigoTitulo;
	private int mCalificacionIMDB;
	private float mCalificacionExpertos;
//	private List<PuntuacionXmlModel> mPuntuacionesExpertos
//		= new ArrayList<PuntuacionXmlModel>();
	
	public PuntuacionesXmlModel(){
		
	}	
	

	public void setCalificacionIMDB(int mCalificacionIMDB) {
		this.mCalificacionIMDB = mCalificacionIMDB;
	}

//	public void setPuntuacionesExpertos(
//			List<PuntuacionXmlModel> mPuntuacionesExpertos) {
//		this.mPuntuacionesExpertos = mPuntuacionesExpertos;
//	}


	@XmlElement
	public int getCalificacionIMDB(){
		return mCalificacionIMDB;
	}
	
	
//	@XmlElement
//	public List<PuntuacionXmlModel> getPuntuacionesExpertos(){
//		return mPuntuacionesExpertos;
//	}
	
//	public void addPuntuacion( String pCodigoAutor, int pPuntuacion ){
//		PuntuacionXmlModel puntuacionModel = new PuntuacionXmlModel();
//		puntuacionModel.setCodigoAutor(pCodigoAutor);
//		puntuacionModel.setPuntuacion(pPuntuacion);
//		mPuntuacionesExpertos.add(puntuacionModel);
//	}
		

	public String getCodigoTitulo() {
		return mCodigoTitulo;
	}

	public void setCodigoTitulo(String pCodigoTitulo) {
		this.mCodigoTitulo = pCodigoTitulo;
	}


	@XmlElement
	public float getCalificacionExpertos() {
		return mCalificacionExpertos;
	}


	public void setCalificacionExpertos(float pCalificacionExpertos) {
		this.mCalificacionExpertos = pCalificacionExpertos;
	}
	
	
}
