package view;

import java.util.ArrayList;
import java.util.Scanner;

import controladora.ControladoraCliente;

public class MenuCliente {

	Scanner entrada = new Scanner(System.in);

	public void menuCliente() {

		System.out.println("\n-----Menu Cliente-----");
		System.out.println("\nOpçoes: ");
		System.out.println("1 - Cadastra Cliente");
		System.out.println("2 - Consultar Cliente");
		System.out.println("3 - Atualizar Cliente");
		System.out.println("4 - Excluir Cliente");
		System.out.println("5 - Voltar menu principal");
		System.out.println("\nDigite a Opção: ");

		int opcao = entrada.nextInt();

		while (opcao != 5) {
			switch (opcao) {
			case 1: {
				this.cadastraCliente();
				break;
			}
			case 2: {
				this.consultarCliente();
				break;
			}
			case 3: {
				this.atualizarCliente();
				break;
			}
			case 4: {
				this.excluirCliente();
				break;
			}

			default: {
				System.out.println("\nOpção invalida;");
			}
			}

			System.out.println("\n-----Menu Cliente-----");
			System.out.println("\nOpçoes: ");
			System.out.println("1 - Cadastra Cliente");
			System.out.println("2 - Consultar Cliente");
			System.out.println("3 - Atualizar Cliente");
			System.out.println("4 - Excluir Cliente");
			System.out.println("5- Voltar menu principal");
			System.out.println("\nDigite a Opção: ");

			opcao = entrada.nextInt();

		}

	}

	private void excluirCliente() {
		entrada.nextLine();
		ClienteDTO dto = new ClienteDTO();
		System.out.println("\nInfrome o CPF do cliente: ");
		dto.setCpf(entrada.nextLine());

		ControladoraCliente controladoraCliente = new ControladoraCliente();
		controladoraCliente.excluirClienteControladore(dto);
	}

	private void atualizarCliente() {
		entrada.nextLine();
		ClienteDTO dto = new ClienteDTO();
		System.out.println("\nInforme o CPF do cliente: ");
		dto.setCpf(entrada.nextLine());
		System.out.println("\nInforme o novo nome do Cliente: ");
		dto.setNome(entrada.nextLine());
		System.out.println("\nDigite o novo CPF:");
		dto.setNcpf(entrada.nextLine());

		ControladoraCliente controladoraCliente = new ControladoraCliente();
		controladoraCliente.atualizarCliente(dto);

	}

	private void consultarCliente() {

		entrada.nextLine();
		ClienteDTO dto = new ClienteDTO();

		System.out.println("\n-----Menu De consulta-----");
		System.out.println("\nOpçoes: ");
		System.out.println("1 - Todos os Clientes");
		System.out.println("2 - Consultar Cliente por Nome");
		System.out.println("3 - Consultar Cliente por CPF");
		System.out.println("4- Voltar menu principal");
		System.out.println("\nDigite a Opção: ");
		int opcao = entrada.nextInt();
		ControladoraCliente controladoraCliente = new ControladoraCliente();
		while (opcao != 4) {
			switch (opcao) {
			case 1: {
				ArrayList<ClienteDTO> clienteDTO = controladoraCliente.consultarTodosClientesController();
				
				System.out.println("\n-------- RESULTADO DA CONSULTA --------");
				System.out.printf("\n%3s  %-20s  %-30s  \n", "ID" , "NOME" , "CPF" );
				
				for(int i = 0;i < clienteDTO.size();i++){
					clienteDTO.get(i).imprimir();
					
				}
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			default: {
				System.out.println("\nOpção Inválida");
			}

			}
			System.out.println("\n-----Menu De consulta-----");
			System.out.println("\nOpçoes: ");
			System.out.println("1 - Todos os Clientes");
			System.out.println("2 - Consultar Cliente por Nome");
			System.out.println("3 - Consultar Cliente por CPF");
			System.out.println("4- Voltar menu principal");
			System.out.println("\nDigite a Opção: ");

			opcao = entrada.nextInt();
		}

	}

	public void cadastraCliente() {
		entrada.nextLine();
		ClienteDTO dto = new ClienteDTO();
		System.out.println("\nDigite o nome do Cliente");
		dto.setNome(entrada.nextLine());
		System.out.println("\nDigite o cpf do Cliente");
		dto.setCpf(entrada.nextLine());

		ControladoraCliente controladoraCliente = new ControladoraCliente();
		controladoraCliente.cadastrarClientecontroladora(dto);

	}

}
