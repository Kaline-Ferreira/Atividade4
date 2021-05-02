package atv4;

public class Vendedor extends Funcionario {
	
	@SuppressWarnings("unused")
	private String nome;
	@SuppressWarnings("unused")
	private double comisao;
	private double salario;
	
	public Vendedor(String nome, String cpf, String sexo, double salario, double comisao) {
		super(nome, cpf, sexo, salario);
		this.nome = nome;
		this.comisao = comisao;
		this.salario = salario;
	}
	
	public double comisao(double comisao) {
		return this.salario + comisao;
	}

	
	}



