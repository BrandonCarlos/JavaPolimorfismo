//gerente � um funcionario, gerente herda da class Funcionario
public class Designer extends Funcionario {
	//E para n�o implementar o m�todo getBonificacao() aqui, devemos tornar est� classe "abstract" tamb�m 
	
	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Designer");
		return 200;
	}
}
