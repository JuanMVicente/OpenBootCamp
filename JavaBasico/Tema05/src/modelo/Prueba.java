package modelo;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CocheCRUDImpl c = new CocheCRUDImpl();
		
		c.save();
		c.findAll();
		c.delete();
	}

}
