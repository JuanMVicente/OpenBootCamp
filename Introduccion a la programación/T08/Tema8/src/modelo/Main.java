package modelo;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setEdad(36);
		p1.setNombre("Juan");
		p1.setTelefono("123456789");
		
		System.out.println("La persona se llama " + p1.getNombre() + " tiene " + p1.getEdad() + " años y su telefono es " + p1.getTelefono());

	}

}
