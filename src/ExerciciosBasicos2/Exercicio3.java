package ExerciciosBasicos2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		String sexo;
		
		System.out.println("Digite M (Masculino) ou F (Feminino)");
		sexo= in.next();
		
		if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo Invalido");
			
		}
		

	}

}
