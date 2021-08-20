import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double cel;
		double far;
		double resultado;
			
		System.out.println("Temperatura em Grau Celsius: ");
		cel= in.nextDouble();
		
		far= cel*9/5;
		resultado= far+32;
				
		System.out.println("igual a "+resultado+" Grau Fahrenheit");

	}

}
