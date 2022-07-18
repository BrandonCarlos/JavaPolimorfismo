
public class Cliente extends FuncionarioAutenticavel {

	public Cliente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario, senha);
	}

	@Override
	public double getBonificacao() {
		return 0;
	}

}
