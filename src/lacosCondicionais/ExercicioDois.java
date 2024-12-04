package lacosCondicionais;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		float num;
		float calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextFloat();
		
		calculo = num %2;
		
		if (calculo == 0 && num >0) {
			
			System.out.println("O número é par e positivo.");
			
		}else if (calculo !=0 && num <0){ 
			
			System.out.println("O número é ímpar e negativo.");
			
		}else if(calculo == 0 && num <0) {
			
			System.out.println("O número é par negativo.");
			
		}else{
			
		System.out.println("O número é ímpar e positivo.");
	}
}
}