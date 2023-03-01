package pacote;

public class cliente {

	private int id;
	private String nome;
	private int idade;
	private String email;
	private contaBancaria conta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public contaBancaria getConta() {
		return conta;
	}
	public void setConta(contaBancaria conta) {
		this.conta = conta;
	}
	
	cliente(){}
	
	cliente(int id, String nome, int idade, String email, contaBancaria conta){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public String exibirNomeIdade () {
		return (this.getNome() + " - " + this.getIdade());
	}
	
	public String exibirDadosConta () {
		return (this.conta.getAgencia() + " - " + this.conta.getNumero() + " - " + this.conta.getSaldo());
	}
	
	
	
}
