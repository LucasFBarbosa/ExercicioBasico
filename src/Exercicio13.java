import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double homemhora;
		double horames;
		double salariobruto;
		double ir,inss,sindicato;
		double salarioliquido;
		
		
		System.out.println("Digite o valor que você ganha por hora: ");
		homemhora= in.nextDouble();
		
		System.out.println("Quantas horas foram trabalhadas no mês: ");
		horames= in.nextDouble();
		
		salariobruto= homemhora*horames;
		
		ir= 11*salariobruto/100;
		inss= 8*salariobruto/100;
		sindicato= 5*salariobruto/100;
		
		salarioliquido= salariobruto-ir-inss-sindicato;
		
		System.out.println("Seu salario bruto é: R$ "+salariobruto);
		System.out.println("Você pagou ao IR: R$ "+ir);
		System.out.println("Você pagou ao INSS: R$ "+inss);
		System.out.println("Você pagou ao Sindicato: R$ "+sindicato);
		System.out.println("Seu salario liquido é de: R$ "+salarioliquido);
		

	}

}

/* Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo: */ 
