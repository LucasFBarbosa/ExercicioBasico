import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double homemhora;
		double horames;
		double salariobruto;
		double ir,inss,sindicato;
		double salarioliquido;
		
		
		System.out.println("Digite o valor que voc? ganha por hora: ");
		homemhora= in.nextDouble();
		
		System.out.println("Quantas horas foram trabalhadas no m?s: ");
		horames= in.nextDouble();
		
		salariobruto= homemhora*horames;
		
		ir= 11*salariobruto/100;
		inss= 8*salariobruto/100;
		sindicato= 5*salariobruto/100;
		
		salarioliquido= salariobruto-ir-inss-sindicato;
		
		System.out.println("Seu salario bruto ?: R$ "+salariobruto);
		System.out.println("Voc? pagou ao IR: R$ "+ir);
		System.out.println("Voc? pagou ao INSS: R$ "+inss);
		System.out.println("Voc? pagou ao Sindicato: R$ "+sindicato);
		System.out.println("Seu salario liquido ? de: R$ "+salarioliquido);
		

	}

}


