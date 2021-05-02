package atv4;

public class Gerente extends Vendedor {
	
	@SuppressWarnings("unused")
	private String nome;
	@SuppressWarnings("unused")
	private String cpf;
	private double salario;
	private double comisao;

		
	public Gerente(String nome, String cpf, String sexo, double salario, double comisao) {
		super(nome,cpf,sexo,salario,comisao);
		this.nome = nome;
		this.cpf = cpf;
		this.salario = 6000.00;
		this.comisao = 500;
		
	}

	public double getSalario() {
		return this.salario + comisao;
	
	}
	
	public double getSalarioTotal() {
		return this.salario + this.comisao(comisao);
	}
	
	

	
	
	
	
	
	
	
	

}
