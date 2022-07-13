package modelo;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] textos = {"Este", "es", "un", "texto"};
		
		String textoConcatenado = "";
		
		for(String palabra: textos) {
			textoConcatenado += palabra + " ";
		}
		textoConcatenado = textoConcatenado.strip();
		System.out.println(textoConcatenado);
	}

}
