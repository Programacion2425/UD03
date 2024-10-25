/**
 * T4Ej5 - Define una función que se llame esPrimo que recibe 
 * como parámetro de
 * entrada un número entero y devolverá true en caso de que 
 * sea primo y falso en
 * caso contrario.
 */
public class T4Ej5 {
	
	public static boolean esPrimo(int numero) {
		
		
		boolean resultado = true;
		int i =2;
		while(resultado && i<numero) {
			
			if(numero%i == 0) {
				resultado = false;
			}
			
			i++;
			
		}
		
//		for (int i = 2; i < numero; i++) {
//			if(numero%i == 0) {
//				resultado = false;
//			}
//			
//		}
		
		return resultado;
		
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(esPrimo(17));
	}

}
