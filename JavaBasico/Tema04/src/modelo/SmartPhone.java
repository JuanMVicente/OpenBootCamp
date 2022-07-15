package modelo;

public class SmartPhone extends SmartDevice {
	
	private String camara;
	private String antena;
	
	public SmartPhone(String marca, double memoria, String estado, String pantalla, String color, String camara, String antena) {
		super(marca,memoria, estado, pantalla, color);
		this.camara = camara;
		this.antena = antena;
	}

	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public String getAntena() {
		return antena;
	}

	public void setAntena(String antena) {
		this.antena = antena;
	}
	
	
	
}
