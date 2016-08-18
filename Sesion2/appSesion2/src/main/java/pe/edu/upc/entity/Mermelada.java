package pe.edu.upc.entity;

public class Mermelada extends Fruta  {
	
	protected int tiempopreparacion;
	protected String tiempoenvase;
	
	

	public Mermelada(String color, String sabor, int tiempopreparacion, String tiempoenvase) {
		super(color, sabor);
		// TODO Auto-generated constructor stub
		this.tiempopreparacion=tiempopreparacion;
		this.tiempoenvase=tiempoenvase;
	}



	public int getTiempopreparacion() {
		return tiempopreparacion;
	}



	public void setTiempopreparacion(int tiempopreparacion) {
		this.tiempopreparacion = tiempopreparacion;
	}



	public String getTiempoenvase() {
		return tiempoenvase;
	}



	public void setTiempoenvase(String tiempoenvase) {
		this.tiempoenvase = tiempoenvase;
	}
	

}
