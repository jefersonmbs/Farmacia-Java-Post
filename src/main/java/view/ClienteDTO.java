package view;

public class ClienteDTO {

	
	private int idCliente;
	private String nome;
	private String cpf;
	private String Ncpf;
	public ClienteDTO(int idCliente, String nome, String cpf, String ncpf) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		Ncpf = ncpf;
	}
		
	
	public ClienteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNcpf() {
		return Ncpf;
	}
	public void setNcpf(String ncpf) {
		Ncpf = ncpf;
	}


	public void imprimir() {
		System.out.printf("\n%-20s  %-30s  \n",
				this.getNome(),this.getCpf());
		
	}
	
	
	
}
