import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double raio;
		double circulo;
		
		System.out.println("Digite o raio desejado: ");
		raio= in.nextDouble();
		
		circulo= raio*2;
				
		System.out.println("O diâmetro é: "+circulo);
				
	}

}
