import java.util.Scanner;

public class T4Ej7 {

	/**
	 * Desarrolla una aplicación con la siguiente funcionalidad de una calculadora:
	 * sumar, restar, multiplicar y dividir. Desarróllalo de tal forma que esté lo
	 * más modularizado posible a través de la utilización de funciones
	 */
	public static int seleccionarOpcion() {
		System.out.println("Introduce una opcion:");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Salir");
		System.out.print("Opcion: ");

		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		return opcion;
	}
	
	public static void suma() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero1: ");
		int n = sc.nextInt();
		System.out.print("Numero2: ");
		int m = sc.nextInt();
		System.out.println("Resultado: "+(n+m));
	}
	
	public static void resta() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero1: ");
		int n = sc.nextInt();
		System.out.print("Numero2: ");
		int m = sc.nextInt();
		System.out.println("Resultado: "+(n-m));
	}
	
	public static void multiplicar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero1: ");
		int n = sc.nextInt();
		System.out.print("Numero2: ");
		int m = sc.nextInt();
		System.out.println("Resultado: "+(n*m));
	}
	
	public static void dividir() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero1: ");
		int n = sc.nextInt();
		System.out.print("Numero2: ");
		int m = sc.nextInt();
		System.out.println("Resultado: "+(n/m));
	}
	
	public static void main(String[] args) {
		
		int opcion = seleccionarOpcion();
		
		while(opcion!=5) {

			if(opcion==1) {
				suma();
			}else if(opcion==2) {
				resta();
			}else if(opcion==3) {
				multiplicar();
			}else if(opcion == 4) {
				dividir();
			}else {
				System.out.println("La opcion no es valida");
			}
			
			opcion = seleccionarOpcion();
		}
		
	}

}
