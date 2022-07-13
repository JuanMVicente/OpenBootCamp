package modelo;

public class ClasePrueba {

	
	public static void main(String[] args) {

		System.out.println("EL precio es de " + precioMasIVA(100));

	}
	
	static double precioMasIVA(double precio) {
		return precio * 1.21; //IVA en Argentina
	}
	
}
