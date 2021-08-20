package ExerciciosBasicos2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		String letra;
		
		System.out.println("Digite uma letra: ");
		letra= in.next();
		
		if (letra.length()>1) {
			
			System.out.println("Não é uma letra valida");
					
		} else {
			
			switch (letra) {
			
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("Letra digitada é uma vogal"); 
			break;
			
			default: System.out.println("A letra digitada é uma consoante");
						
										
			}
			
		}
		

	}

}
