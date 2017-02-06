package controladora;

import modelo.VO.ClienteVO;
import view.ClienteDTO;

import java.util.ArrayList;

import model.BO.ClienteBO; 

public class ControladoraCliente {


	public void cadastrarClientecontroladora(ClienteDTO dto){
		 ClienteVO clienteVO = new ClienteVO();
		 
		 clienteVO.setNome(dto.getNome());
		 clienteVO.setCpf(dto.getCpf());
		 
		 ClienteBO clienteBO = new ClienteBO();
		 clienteBO.cadastraClienteBO(clienteVO);
		
	}

	public void excluirClienteControladore(ClienteDTO dto) {
		ClienteVO  clienteVO = new ClienteVO();
		clienteVO.setCpf(dto.getCpf());
		
		ClienteBO clienteBO = new ClienteBO();
		clienteBO.excluirClienteBO(clienteVO);
		
	}

	public void atualizarCliente(ClienteDTO dto) {
		
		ClienteVO clienteVO = new ClienteVO();
		clienteVO.setCpf(dto.getCpf());
		clienteVO.setNome(dto.getNome());
		clienteVO.setNcpf(dto.getNcpf());
		
		ClienteBO clienteBO = new ClienteBO();
		clienteBO.atualizarCliente(clienteVO);
		
	}

	public ArrayList<ClienteDTO> consultarTodosClientesController() {
		ClienteBO clienteBO = new ClienteBO();
		ArrayList<ClienteVO> clientesVO = clienteBO.consultarTodosClientesBO();
		ArrayList<ClienteDTO> listaDTO = new ArrayList<ClienteDTO>();
		
		for(int  i = 0;i < clientesVO.size();i++){
			ClienteDTO clienteDTO = new ClienteDTO();
			clienteDTO.setIdCliente(clientesVO.get(i).getIdCliente());
			clienteDTO.setNome(clientesVO.get(i).getNome());
			clienteDTO.setCpf(clientesVO.get(i).getCpf());
			
			listaDTO.add(clienteDTO);
			
		}
		
		
		return listaDTO;
		
	}



}
