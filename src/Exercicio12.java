import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double altura;
		double pesoideal;
		
		System.out.println("Digite sua altura: ");
		altura= in.nextDouble();
		
		pesoideal= (72.7*altura)-58;
		
		System.out.println("Seu peso ideal é: "+pesoideal);

	}

}
