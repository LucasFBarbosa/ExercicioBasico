package ExerciciosBasicos2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int num1,num2;
		
		
		System.out.println("Digite um número: ");
		num1= in.nextInt();
		
		System.out.println("Digite um número: ");
		num2= in.nextInt();
		
		if (num1 > num2) {
			
			System.out.println("O maior número é: "+num1);
		} else { 
			System.out.println("O maior número é: "+num2);
		}
	

	}

}
