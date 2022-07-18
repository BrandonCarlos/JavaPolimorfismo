//gerente é um funcionario, gerente herda da class Funcionario
public class Designer extends Funcionario {
	//E para não implementar o método getBonificacao() aqui, devemos tornar está classe "abstract" também 
	
	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer");
		return 200;
	}
}
