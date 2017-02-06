package modelo.VO;

public class ClienteVO {
	
	private int idCliente;
	private String nome;
	private String cpf;
	private String Ncpf;
	public ClienteVO(int idCliente, String nome, String cpf, String ncpf) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		Ncpf = ncpf;
	}
	public ClienteVO() {
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
	
	
	
}
