//gerente é um Funcionario, gerente herda da class Funcionario, assina o contrato Autenticavel, é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {// Agora Gerente herda de FuncionarioAutenticavel
	private AutenticacaoUtil autenticador;

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);// constructor herdando: nome, cpf, salario e senha da class Funcionario
		this.autenticador = new AutenticacaoUtil();
	}

	// Reescrita do método getBonificacao() lá da classe mãe
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		// para chamar o atributo lá da classe mãe chamamos como =
		// super.atributoSelecionado;
		return super.getSalario();// reaproveitamente do método da classe mãe
		// OBS: se utilizarmos o this.getBonificacao() o próprio método getBonificacao()
		// ficará se auto executando
	}

	@Override
	public void setSenha(int senha) {// para podermos setar a senha
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);// this.senha = senha do usuário == 2222
	}
}
