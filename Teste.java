package atv4;

public class Teste {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Augusto Novais", "546737", "M", 6000.00, 500.00);
		
		Funcionario funcionario = new Funcionario("Luiz", "35689", "M", 5000.00);
		Funcionario funcionario1 = new Funcionario("Roberta", "35654", "F", 3000.00);
		Funcionario funcionario2 = new Funcionario("Claudia", "99786", "F", 8000.00);
		
		Vendedor vendedor = new Vendedor("Flavia", "55666", "F", 6000.99,500.00);
		Vendedor vendedor1 = new Vendedor("Carmen", "78994", "F", 1299.99,700.00);
		@SuppressWarnings("unused")
		Vendedor vendedor2 = new Vendedor("Luiza", "78393", "F", 2500.99,80.00);
		
		
		gerente.setNome("Augusto Novais");
		gerente.setSalario(4000.00);
		
		System.out.println("------------------GERENTE---------------\n");
		System.out.println("Nome do Gerente - " +gerente.getNome());
		System.out.println("Salario do mes - R$ " + gerente.getSalario());
		System.out.println("Salario com a comisao - R$ " + gerente.getSalarioTotal() + "\n");
		
		System.out.println("----------------FUNCIONARIOS------------------\n");
		
		funcionario.setNome("Luiza Ferreira");
		funcionario.setSalario(4000.88);
		funcionario1.setNome("Roberta Isabela");
		funcionario1.setSalario(3000.00);
		funcionario2.setNome("Luiza Ferreira");
		funcionario2.setSalario(2500.00);
		
		System.out.println("Nome do Funcionario - " + funcionario.getNome());
		System.out.println("Salario do mes - R$ " + funcionario.getSalario());
		System.out.println("Nome do Funcionario 1 - " + funcionario1.getNome());
		System.out.println("Salario do mes - R$ " + funcionario1.getSalario());
		System.out.println("Nome do Funcionario 2 - " + funcionario2.getNome());
		System.out.println("Salario do mes - R$ " + funcionario2.getSalario()+"\n");
		
		System.out.println("-------------VENDEDOR-------------------\n");
		vendedor.setNome("Flavia Souza");
		vendedor.setCpf("55666");
		vendedor.setSalario(6000.00);
		vendedor1.setNome("Luiza Fernanda");
		vendedor1.setSalario(1200.500);
		System.out.println("Nome do Vendedor - " + vendedor.getNome());
		System.out.println("Salario do mes - R$ " + vendedor.getSalario());
		System.out.println("Comisao das Vendas - R$ " + vendedor.getComisao());
		System.out.println("Nome do Vendedor 1 - " + vendedor1.getNome());
		System.out.println("Salario do mes - R$ " + vendedor1.getSalario());
		System.out.println("Comisao das Vendas - R$ " + vendedor1.getComisao());
		
		
		
	}

}
