//gerente � um funcionario, gerente herda da class Funcionario
public class Designer extends Funcionario {
	
	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Designer");
		return 200;
	}
}
