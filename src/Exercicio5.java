import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double metragem;
		double centimetro;
		
		System.out.println("Digite a metragem para convers�o em cent�metros: ");
		metragem= in.nextDouble();
		
		centimetro= metragem*100;
		
		System.out.println(metragem+" metros representam "+centimetro+" cent�metros.");			

	}

}
