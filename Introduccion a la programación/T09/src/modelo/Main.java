package modelo;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente(36, "Juan", "122345143", -650.5);
		
		System.out.println(c1.getNombre() +" de "+ c1.getEdad() + " años, tiene un credito de " + c1.getEdad());

	}

}
