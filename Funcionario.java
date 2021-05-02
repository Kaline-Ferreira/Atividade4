package atv4;

public class Funcionario extends Pessoa {
	
	private String nome;
	private String cpf;
	private double salario;
	
	
	public Funcionario(String nome, String cpf, String sexo, double salario) {
		super(nome, cpf, sexo);
		
	}


	public double getComisao() {
		return this.salario * 0.10;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	
	

}
