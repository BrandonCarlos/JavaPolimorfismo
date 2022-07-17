//gerente é um funcionario, gerente herda da class Funcionario
public class EditorVideo extends Funcionario {
	
	public EditorVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Editor de video");
		return (super.getBonificacao()) + 100;
	}
}
