package Clase3;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		codificar("z f",29);
		decodificar("b",84);
	}

	public static void codificar(String palabra, int desplazamiento){
		String abc = "abcdefghijklmnñopqrstuvwxyz ";
		int nuevaPosicion;
		char letra1;
		char letra2;
		String nuevaPalabra="";
		for (int i = 0; i<palabra.length();i++) {
			letra1 = palabra.charAt(i);
			int j = abc.indexOf(letra1);
			if (j+desplazamiento >abc.length()-1 ) {
				// para evitar el error si desplazamiento >28
				nuevaPosicion = (j+desplazamiento)-abc.length()*((j+desplazamiento)/abc.length());
				
			}else {
				nuevaPosicion = j+desplazamiento;
			}
			
			letra2 = abc.charAt(nuevaPosicion);
			nuevaPalabra = nuevaPalabra + letra2;
			
		}
		System.out.println(nuevaPalabra);
	}
	
	public static void decodificar(String palabra, int desplazamiento) {
		
		String abc = "abcdefghijklmnñopqrstuvwxyz ";
		int nuevaPosicion;
		char letra1;
		char letra2;
		String nuevaPalabra="";
		for (int i = 0; i<palabra.length();i++) {
			letra1 = palabra.charAt(i);
			int j = abc.indexOf(letra1);
			if (j-desplazamiento <0 ) {
				nuevaPosicion = abc.length() -(desplazamiento-j)-1+abc.length()*((desplazamiento-j)/abc.length());
				
			}else {
				nuevaPosicion = j-desplazamiento;
			}
			
			letra2 = abc.charAt(nuevaPosicion);
			nuevaPalabra = nuevaPalabra + letra2;
			
		}
		System.out.println(nuevaPalabra);
		
	}
	
}
