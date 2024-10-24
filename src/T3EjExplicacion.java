import java.util.Scanner;

/**
 * El programa debe pedir al usuario que ingrese un numero entero positivo y
 * devolverá el resultado de restar la suma del cuadrado de sus números pares
 * menos la suma del cuadrado de sus números impares. Por ejemplo, si el usuario
 * introduce el 21 devolverá 3
 * 
 */
public class T3EjExplicacion {

	//modo es true suma de digitos pares, si modo es false suma de digitos impares
	public static int sumaDigitos(int num, boolean modo) {

		int s =0;
		
		while (num > 0) {

			int digito = num % 10;
			if (digito % 2 == 0 && modo) {
				s = s + digito * digito;
			}

			num = num / 10;
		}
		
		return s;
	}
	
	
	
	
	public static int sumaImpares(int num) {

		int s =0;
		
		while (num > 0) {

			int digito = num % 10;
			if (digito % 2 != 0) {
				s = s + digito * digito;
			}

			num = num / 10;
		}
		
		return s;
	}
	
	
	
	public static int sumaPares(int num) {

		int s =0;
		
		while (num > 0) {

			int digito = num % 10;
			if (digito % 2 == 0) {
				s = s + digito * digito;
			}

			num = num / 10;
		}
		
		return s;
	}

	public static void main(String[] args) {

		int sPares = 0;
		int sImpares = 0;

		System.out.print("Introducir numero: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		sPares = sumaPares(numero);
		sImpares = sumaImpares(numero);
		
		System.out.println(sPares - sImpares);

	}

}
