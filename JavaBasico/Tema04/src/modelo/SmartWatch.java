package modelo;

public class SmartWatch extends SmartDevice {
	
	private String pulsera;

	public SmartWatch(String marca, double memoria, String estado, String pantalla, String color, String pulsera) {
		super(marca, memoria, estado, pantalla, color);
		this.pulsera = pulsera;
	}

	public SmartWatch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPulsera() {
		return pulsera;
	}

	public void setPulsera(String pulsera) {
		this.pulsera = pulsera;
	}
	
	
	
	
}
