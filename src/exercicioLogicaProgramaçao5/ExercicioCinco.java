package exercicioLogicaProgramaçao5;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int soma = 0;

		System.out.println("Informe um número: ");
		num = sc.nextInt();
	
		while (num > 0) {
			soma += (num % 10);
			num /= 10;			
		}
		System.out.println();
		System.out.println("A soma dos algarismos é: " + soma);
		
		sc.close();
	
	}

}
