
public class Condicoes {

	public static void comparador(int a) {
		
		if (a < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Nao é Negativo");
		}
	}
	
	public static void numprop(int a) {
		if(a % 2 == 0) {
			System.out.println("O numero é par");	
		}
		else {
			System.out.println("O numero é impar");
		}	
	}
	public static void multiplos(int a, int b) {
		if(a % b == 0 || b % a == 0) {
			System.out.println("O numero é multiplo");	
		}
		else {
			System.out.println("O numero nao é multiplo");
		}
	}
}
