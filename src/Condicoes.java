
public class Condicoes {

	public static void comparador(int a) {
		
		if (a < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Nao � Negativo");
		}
	}
	
	public static void numprop(int a) {
		if(a % 2 == 0) {
			System.out.println("O numero � par");	
		}
		else {
			System.out.println("O numero � impar");
		}	
	}
	public static void multiplos(int a, int b) {
		if(a % b == 0 || b % a == 0) {
			System.out.println("O numero � multiplo");	
		}
		else {
			System.out.println("O numero nao � multiplo");
		}
	}
}
