import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double homemhora;
		double horames;
		double salariobruto;
				
		System.out.println("Digite o valor que voc� ganha por hora: ");
		homemhora= in.nextDouble();
		
		System.out.println("Quantas horas foram trabalhadas no m�s: ");
		horames= in.nextDouble();
		
		salariobruto= homemhora*horames;
			
		System.out.println("Seu salario bruto �: R$ "+salariobruto);
		

	}

}
