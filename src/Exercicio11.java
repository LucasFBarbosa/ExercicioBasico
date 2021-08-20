import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int num1,num2;
		double numreal;
		double resultadoa,resultadob,resultadoc;
		
		System.out.println("Número 1: ");
		num1= in.nextInt();
		
		System.out.println("Número 2: ");
		num2= in.nextInt();
		
		System.out.println("Número 3: ");
		numreal= in.nextDouble();
		
		resultadoa= num1*2+(num2/2);
		resultadob= num1*3+numreal;
		resultadoc= (numreal)*3;
		
		System.out.println("Resutado A: "+resultadoa+" Resultado B: "+resultadob+" Resultado C: "+resultadoc);
						
				
		
	}

}
