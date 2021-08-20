package ExerciciosBasicos2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double numero;
		
		System.out.println("Digite um valor: ");
		numero= in.nextDouble();
		
		if (numero<0) {
			System.out.println("O número é negativo");
		} else {
			System.out.println("O número é positivo");
			
		}
		

	}

}
