import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double far;
		double cel;
		double resultado;
			
		System.out.println("Temperatura em Grau Fahrenheit: ");
		far= in.nextDouble();
		
		cel= far-32;
		resultado= cel*5/9;
				
		System.out.println("igual a "+resultado+" Grau Celsius");
		
		
	}

}
