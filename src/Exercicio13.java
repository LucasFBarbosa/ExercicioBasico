import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double homemhora;
		double horames;
		double salariobruto;
		double ir,inss,sindicato;
		double salarioliquido;
		
		
		System.out.println("Digite o valor que voc� ganha por hora: ");
		homemhora= in.nextDouble();
		
		System.out.println("Quantas horas foram trabalhadas no m�s: ");
		horames= in.nextDouble();
		
		salariobruto= homemhora*horames;
		
		ir= 11*salariobruto/100;
		inss= 8*salariobruto/100;
		sindicato= 5*salariobruto/100;
		
		salarioliquido= salariobruto-ir-inss-sindicato;
		
		System.out.println("Seu salario bruto �: R$ "+salariobruto);
		System.out.println("Voc� pagou ao IR: R$ "+ir);
		System.out.println("Voc� pagou ao INSS: R$ "+inss);
		System.out.println("Voc� pagou ao Sindicato: R$ "+sindicato);
		System.out.println("Seu salario liquido � de: R$ "+salarioliquido);
		

	}

}

/* Fa�a um Programa que pergunte quanto voc� ganha por hora e o
n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um
programa que nos d�:
. sal�rio bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o sal�rio l�quido.
d. calcule os descontos e o sal�rio l�quido, conforme a tabela
abaixo: */ 
