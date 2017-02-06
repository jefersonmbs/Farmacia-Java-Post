package model.BO;

import java.util.ArrayList;

import model.DAO.ClienteDAO;
import modelo.VO.ClienteVO;

public class ClienteBO {

	
	

	public void cadastraClienteBO(ClienteVO clienteVO) {
		ClienteDAO clienteDAO = new ClienteDAO();
		if(clienteDAO.existeregistroPorCpf(clienteVO.getCpf())){
			System.out.println("\nCliente já cadastrado.");
		}else{
			int resultado = clienteDAO.cadastrasClienteDAO(clienteVO);
			if (resultado == 1){
				System.out.println("\nCliente cadastrado com sucesso!");
			}else{
				System.out.println("\nNão foi possivel cadastrado Cliente");
			}
				
			
		}
		
		
	}

	public void excluirClienteBO(ClienteVO clienteVO) {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		if(clienteDAO.existeregistroPorCpf(clienteVO.getCpf())){
			int resultado = clienteDAO.excluirClienteDAO(clienteVO);
			if(resultado == 1){
				System.out.println("\nCliente exluido com sucesso.");
				
			}else{
				System.out.println("\nNão foi possivel excluir Cliente");
			}
			
			
		}else{
			System.out.println("\ncliente não existe.");
		}
		
	}

	public void atualizarCliente(ClienteVO clienteVO) {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		if(clienteDAO.existeregistroPorCpf(clienteVO.getCpf())){
			int resultado = clienteDAO.atalizarClienteDAO(clienteVO);
			if (resultado == 1){
				System.out.println("\nCliente Atualizado  com sucesso.");
			}else{
				System.out.println("\nNão foi possivel atualizar Cliente");
			}
			
		}else {
			System.out.println("\ncliente não existe.");
		}
	}

	public ArrayList<ClienteVO> consultarTodosClientesBO() {
		ClienteDAO clienteDAO = new ClienteDAO();
		ArrayList<ClienteVO> clientesVO = clienteDAO.consultarTodosClientesDAO();
		if(clientesVO.isEmpty()){
			System.out.println("\nLista de Clientes não Localizada!");
		}
		return clientesVO;
	}
	}

