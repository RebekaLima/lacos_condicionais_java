package lacosCondicionais;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		int cod;
		double preco = 0;
		float quantidade;
		double total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		cod = leia.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch (cod) {
		
		case 1:
			System.out.println("Cachorro Quente");
			preco = 10.00;
			break;
		case 2: System.out.println("X-Salada");
			preco = 15.00;
			break;
		case 3: System.out.println("X-Bacon");
			preco = 18.00;
			break;
		case 4: System.out.println("Bauru");
			preco = 12.00;
			break;
		case 5: System.out.println("Refrigerante");
			preco = 8.00;
			break;
		case 6: System.out.println("Suco de laranja");
			preco = 13.00;
			break;
		}
		
		total = preco * quantidade;
		
		System.out.printf("O vaor total do pedido é: %.2f.", total);
		
		
		
		
		

	}

}
