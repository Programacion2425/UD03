import java.util.Scanner;

public class ExplicacionUtilizacionClases {

	public static void main(String[] args) {

		/**declarar una variable*/
		String s;

		/**instanciar o construir un objeto*/
		s = new String("Carlos");

		/**
		 * Comparar dos cadenas
		 */
//		Scanner sc = new Scanner(System.in);
//		String s1 = sc.nextLine();
//		String s2 = sc.nextLine();
//
//		System.out.println("cadena1: " +s1);
//		System.out.println("cadena2: " +s2);
//
//		if(s1.equals(s2)) {
//			System.out.println("Son iguales");
//		}else {
//			System.out.println("Son DIFERENTES");
//		}

		/**
		 * Castear entero a cadena -- utilización valueOf
		 */
//		int n = 1991;
//		String nString = String.valueOf(n);
//		for (int i = 0; i < nString.length(); i++) {
//			System.out.println(nString.charAt(i));
//		}

		/**
		 * Utilización métodos estáticos
		 */
		System.out.println(Character.isDigit('6'));

	}

}
