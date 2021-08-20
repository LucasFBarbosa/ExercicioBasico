import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int quadrado;
		int area;
		int resultado;
		
		System.out.println("Digite o lado do quadrado: ");
		quadrado= in.nextInt();
		
		area= quadrado*quadrado;
		
		resultado= area;
		
		System.out.println("A área é de: "+resultado+" metros quadrados ");				
		
	}

}
