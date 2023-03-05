package Clase3;

import java.util.Arrays;

public class Ejercicio1a {

	public static void main(String[] args) {
		
		cuentaLetras("caleidoscopio", 'o');
		ordenar(12,1,4,'d');
		int[] numeros = new int [] {12,24,33,1,2,8,3};
		suma1(numeros, 6);
		
	}

	public static void cuentaLetras(String palabra, char letra) {
	
		int cantidad = 0;
		for (int i = 0; i <= palabra.length() - 1; i++) {
			if (palabra.charAt(i) == letra) {
				cantidad++;
			}
		}
		if (cantidad == 1) {
			System.out.println("La palabra " + palabra + " tiene " + cantidad + " letra " + letra);
		} else {
			System.out.println("La palabra " + palabra + " tiene " + cantidad + " letras " + letra);
		}
	}
	
	public static void ordenar (int numero1 , int numero2, int numero3, char orden) {
	
		int[] vectorOrdenado = new int[3];
		
		if (numero1<numero2){
			if (numero3<numero1) {
				vectorOrdenado = new int[] {numero3, numero1, numero2};
						
			}else if (numero3<numero2){
				vectorOrdenado = new int[] {numero1,numero3,numero2};
			}else {
				vectorOrdenado = new int[]{numero1,numero2,numero3};
			}
		}else {
			if (numero3<numero2) {
				 vectorOrdenado = new int[] {numero3,numero2,numero1};
			}else if(numero3<numero1)	{
				vectorOrdenado = new int[]{numero2,numero3,numero1};
			}else {
			vectorOrdenado = new int[]{numero2,numero1,numero3};
			}
			
		}
		
		
		switch (orden){
		 case 'a':
		 System.out.println("Los números en orden ascendente son : " + Arrays.toString(vectorOrdenado));
		 break;
		 case 'd':
			 System.out.println("Los números en orden descendente son : [" + vectorOrdenado[2] + ", " + vectorOrdenado[1]
					 + ", " + vectorOrdenado[0] + "]"); 
		 break;
		 
		 }
			
	}
	
	public static void suma1 (int vector[],int x) {
		int suma=0;
		for(int item:vector) {
			if(item>x) {
				suma = suma + item;
			}
		}
		
		System.out.println("En el vector " + Arrays.toString(vector) + " la suma de los elementos"
				+ " mayores que " + x + " es " + suma);
		
	}
	
}
