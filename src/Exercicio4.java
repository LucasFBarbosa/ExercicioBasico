import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double nota1,nota2,nota3,nota4;
		double somanotas;
		double media;
		

		System.out.println("Digite a primeira nota: ");
		nota1= in.nextDouble();
		
		System.out.println("Digite a primeira nota: ");
		nota2= in.nextDouble();
		
		System.out.println("Digite a primeira nota: ");
		nota3= in.nextDouble();

		System.out.println("Digite a primeira nota: ");
		nota4= in.nextDouble();
		
		somanotas= nota1+nota2+nota3+nota4;
		media= somanotas/4;
		
		System.out.println("Sua média é: "+media);
		

	}

}
