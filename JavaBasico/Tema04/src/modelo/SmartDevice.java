package modelo;

public abstract class SmartDevice {
	private String marca;
	private double memoria;
	private String estado = "apagado";
	private String pantalla;
	private String color;
	
	
	
	public SmartDevice(String marca, double memoria, String estado, String pantalla, String color) {
		super();
		this.marca = marca;
		this.memoria = memoria;
		this.estado = estado;
		this.pantalla = pantalla;
		this.color = color;
	}
	
	
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public SmartDevice() {
		super();
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}
	
	
	
}
