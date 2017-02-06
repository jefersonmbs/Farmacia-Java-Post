package view;

import java.util.Scanner;

public class Menu {

	Scanner entrada = new Scanner(System.in);

	public void mostrarMenu() {

		System.out.println("Sistema - Farmácia");
		System.out.println("\nOpçoes: ");
		System.out.println("1 - Menu do Cliente");
		System.out.println("2 - Sair");
		System.out.println("\nDigite a Opção: ");

		int opcao = entrada.nextInt();

		while (opcao != 2) { // Enquanto Opção diferente de 2
			switch (opcao) {
			case 1: {
				MenuCliente menucliente = new MenuCliente();
				menucliente.menuCliente();
				break;
			}
			default: {
				System.out.println("Opção inválida");
			}
			}
			System.out.println("Sistema - Farmácia");
			System.out.println("\nOpçoes: ");
			System.out.println("1 - Menu do Cliente");
			System.out.println("2 - Sair");
			System.out.println("\nDigite a Opção: ");
			
			opcao = entrada.nextInt();
		}

	}

}
