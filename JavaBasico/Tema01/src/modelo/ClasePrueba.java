package modelo;

public class ClasePrueba {
	public static void main(String[] args) {

		int a = 10;
		boolean estudio = true;
		String nombre = "Juan";
		double b = 2.5;
		
		if(estudio) {
			System.out.println("Estudiando me ira bien y llegar� al " + a);
		}else {
			System.out.println("Si no estudio con suerte llegar� al " + b);
		}
		
		estudio = false;
		if(estudio) {
			System.out.println("Estudiando me ira bien y llegar� al " + a);
		}else {
			System.out.println("Si no estudio con suerte llegar� al " + b);
		}
				
	}
}
