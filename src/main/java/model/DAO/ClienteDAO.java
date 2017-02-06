package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.VO.ClienteVO;

public class ClienteDAO {

	public boolean existeregistroPorCpf(String cpf) {

		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;

		String querry = "SELECT * FROM cliente WHERE cpf = '" + cpf + "'";
		try {
			resultado = stmt.executeQuery(querry);
			if (resultado.next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a verificação por CPF.");
			return true;
		} finally {
			Banco.closeReultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}

		return false;

	}

	public int cadastrasClienteDAO(ClienteVO clienteVO) {
			
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		
		String query = "INSERT INTO cliente (nome , cpf) VALUES ('" + clienteVO.getNome() +"','"
		+ clienteVO.getCpf()+"')";
		
		try {
			resultado = stmt.executeUpdate(query);
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Incerção do Cliente.");
		}finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return resultado;
		
	}

	public int excluirClienteDAO(ClienteVO clienteVO) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		
		String query = "DELETE FROM cliente WHERE cpf = '" + clienteVO.getCpf() + "'";
		
		try{
			resultado = stmt.executeUpdate(query);
		}catch (SQLException e){
			System.out.println("Erro ao executar a exclusão do Cliente.");
		}finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		
		
		return resultado;
	}

	public int atalizarClienteDAO(ClienteVO clienteVO) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		
		String query = "update cliente set nome = '" + clienteVO.getNome() + "', "				
				+ "cpf = '" + clienteVO.getNcpf() + "' "
				+ "where cpf = '" + clienteVO.getCpf() + "'";
				
		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar a atualização do Cliente.");
		}finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
				
		
		return resultado;
	}

	public ArrayList<ClienteVO> consultarTodosClientesDAO() {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;
		ArrayList<ClienteVO> clientesVO =  new ArrayList<ClienteVO>();
		
		String query = "SELECT * FROM cliente";
		
		try {
			resultado = stmt.executeQuery(query);
			while(resultado.next()){ //percorer ate o fim da tabela sem saber o tamaho
				ClienteVO clienteVO = new ClienteVO();
				clienteVO.setNome(resultado.getString(1));
				clienteVO.setCpf(resultado.getString(2));
				clientesVO.add(clienteVO);						
			}
			
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Consulta do clientes.");
		}finally {
			Banco.closeReultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}				
		return clientesVO;
	}

	

}
