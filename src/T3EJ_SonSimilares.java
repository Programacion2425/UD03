
public class T3EJ_SonSimilares {
	
	public static void main(String[] args) {
		System.out.println(sonSimilares(32, 1234));
	}
	
	
	public static boolean contieneDigito(int n1, int digito) {
		
		while(n1!=0) {
			
			if(n1%10 == digito) {
				return true;
			}
			
			n1= n1/10;
		}
		
		return false;
	}
	
	

	public static boolean sonSimilares(int n1, int n2) {
		
		int aux;
		if(n2>n1) {
			aux= n1;
			n1= n2;
			n2=aux;
		}
		
		boolean loContiene = true;
		while(loContiene && n2!=0) {
			
			int digitoN2 = n2%10;
			
			loContiene = contieneDigito(n1, digitoN2);
			
			n2 = n2/10;
		}
				
		return loContiene;
	}

}
