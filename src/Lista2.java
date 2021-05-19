import java.util.Scanner;

public class Lista2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int	Leitura = scan.nextInt();
		
		
		Condicoes.comparador(Leitura);
		Condicoes.numprop(Leitura);
		
		System.out.println("Digite um segundo numero: ");
		int	Leitura2 = scan.nextInt();
		Condicoes.multiplos(Leitura, Leitura2);
		scan.close();
	}
}
