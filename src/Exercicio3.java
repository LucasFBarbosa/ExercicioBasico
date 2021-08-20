import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.println("Digite o primeiro número para efetuar a soma: ");
		numero1= in.nextInt();
		
		System.out.println("Digite o segundo número para efetuar a soma: ");
		numero2= in.nextInt();
		
		soma= numero1+numero2;
						
		System.out.println("A soma dos números é: "+soma);				
		
	}

}
