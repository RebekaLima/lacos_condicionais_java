package lacosCondicionais;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		int numA;
		int numB;
		int numC;
		int aB;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número 'A': ");
		numA = leia.nextInt();
		
		System.out.println("Digite o número 'B': ");
		numB = leia.nextInt();
		
		System.out.println("Digite o número 'C': ");
		numC = leia.nextInt();
		
		aB = numA + numB;
		
		if (aB > numC) {
			
			System.out.println("A soma de A + B é maior do que C.");
		}
		
		else if (aB == numC) {
			
			System.out.println("A soma de A + B é igual a C.");
		}
		
		else {
			System.out.println("A soma de A + B é menor do que C.");
		}

	}

}
