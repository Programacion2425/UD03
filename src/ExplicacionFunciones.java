
public class ExplicacionFunciones {
	
	
	//definición de una función
	public static void numeros(int n) {
				
		for (int i = 0; i < n; i++) {
			System.out.println("n: "+i);
		}
	}
	
	
	
	public static int funcion1(int a) {
		a = a+1;
		return a;
	}
	
	public static void main(String[] args) {
		
		int b = 0;
		
		System.out.println(funcion1(funcion1(b)));
		
//		System.out.println(b);
//		
//		
//		System.out.println("hola mundo");
//		
//		//llamada a una función
//		numeros(5);
//		
//		System.out.println("otro mensaje");
//		
//		numeros(9);
//		
//		System.out.println("mensaje final");
//		
//		int m = 1;
//		numeros(m);
	}
	
	
	

}
