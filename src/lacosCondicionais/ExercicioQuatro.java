package lacosCondicionais;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		String nome;
		int cod;
		float salario;
		float reajuste = 0;
		float total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do colaborador: ");
		nome = leia.next();
		
		System.out.println("Digite o código do cargo do colaborador: ");
		cod = leia.nextInt();
		
		System.out.println("Digite o salário do colaborador: ");
		salario = leia.nextFloat();
		
		System.out.println(nome);
		
		switch (cod) {
		
		case 1:
			System.out.println("Gerente");
			reajuste = (float) 0.10;
			break;
		case 2:
			System.out.println("Vendedor");
			reajuste = (float) 0.07;
			break;
		case 3:
			System.out.println("Supervisor");
			reajuste = (float) 0.09;
			break;
		case 4:
			System.out.println("Motorista");
			reajuste = (float) 0.06;
			break;
		case 5:
			System.out.println("Estoquista");
			reajuste = (float) 0.05;
			break;
		case 6:
			System.out.println("Técnico de TI");
			reajuste = (float) 0.08;
			break;
		}
			total = (salario * reajuste) + salario;
			
		System.out.println("O valor do salário ajustado é de: " + total);
			
		}

	}
