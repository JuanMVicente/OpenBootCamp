package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class E01 {
	public static void main(String[] args) {
	
		System.out.println("1- UNIDIMENSIONAL");
		String[] arrayUnidimensional = {"uno","dos","tres"};
		for(int i=0; i<arrayUnidimensional.length;i++) {
			System.out.println("Posición: " + i + ": "+  arrayUnidimensional[i]);
		}
		
		System.out.println("2- BIDIMENSIONAL");
		int[][] arrayBidimensional = {{2,5},{6,8},{3,0}};
		for(int i=0; i<arrayBidimensional.length;i++) {
			for(int j=0; j<2;j++) {
				System.out.println("Posición: " + i + " "+ j + ": "+ arrayBidimensional[i][j]);
			}
		}
		
		System.out.println("3- VECTOR");
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		System.out.println(v);
		v.remove(1);
		v.remove(2);
		System.out.println(v);
		
		/*
		 * 4-
		 * Cuando se amplian se genera la duplicación de datos, por lo que el consumo de memoria
		 * se hace excesivo siendo poco eficiente el programa realizado.
		 */
		
		System.out.println("5- ArrayList + LinkedList");
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Juan");
		arrayList.add("Pablo");
		arrayList.add("Pedro");
		arrayList.add("Delamar");
		List<String> linkedList = new LinkedList<String>();
		linkedList =arrayList;
		System.out.println(arrayList);
		System.out.println(linkedList);
		
		System.out.println("6- ArrayList");
		List<Integer> arrayList2 = new ArrayList<Integer>();
		for(int i=0; i<10; i++)
			arrayList2.add(i+1);
		int i=0;
		while (i<arrayList2.size()) {
			if(arrayList2.get(i) % 2 == 0) {
				arrayList2.remove(i);
			}
			else {
				System.out.println(arrayList2.get(i));
				i++;
			}
		}
		
		System.out.println("7- Excepciones");
		
		try{
			int a = DividePorCero(6,2);
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println("Esto no puede hacerse");
		}finally {
			System.out.println("Demo de Código");
		}
		
		try{
			int a = DividePorCero(5,0);
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println("Esto no puede hacerse");
		}finally {
			System.out.println("Demo de Código");
		}
	
		System.out.println("8- Ficheros");
	
		FileInputStream fichero1 = null;
		try {
			fichero1 = new FileInputStream("Prueba.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileOutputStream fichero2 = null;
		try {
			fichero2 = new FileOutputStream("Prueba2.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		copiaFichero(fichero1,fichero2);
		
	}
	
	static int DividePorCero(int a, int b) throws ArithmeticException{
		int resultado;
		try {
			resultado = a / b;
		}catch(ArithmeticException e) {
			throw new ArithmeticException();
		}
		return resultado;
	}
	
	static void copiaFichero(FileInputStream fileIn, FileOutputStream fileOut) {
		try {
			byte[] datos = fileIn.readAllBytes();
			fileOut.write(datos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
