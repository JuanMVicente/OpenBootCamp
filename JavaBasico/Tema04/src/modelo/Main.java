package modelo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartWatch r1 = new SmartWatch("Manzana",8,"prendido","20 px","rojo","cuero");
		SmartWatch r2 = new SmartWatch("Motomel",16,"apagado","25 px","verde","plastico");
		
		SmartPhone t1 = new SmartPhone("Manzana",64,"apagado","150 px", "negro","modelo camara","modelo cantena");
		SmartPhone t2 = new SmartPhone("Androide",128,"prendido","160 px", "gris","modelo camara","modelo cantena");
	
		System.out.println("Reloj marca " + r1.getMarca() + " es de color " + r1.getColor() + " y tiene pulsera de " + r1.getPulsera());
		System.out.println("Reloj marca " + r2.getMarca() + " es de color " + r2.getColor() + " y tiene pulsera de " + r2.getPulsera());
	
		System.out.println("Telefono marca " + t1.getMarca() + " es de color " + t1.getColor() + " y tiene camara " + t1.getCamara());
		System.out.println("Telefono marca " + t2.getMarca() + " es de color " + t2.getColor() + " y tiene camara " + t2.getCamara());
	}

}
