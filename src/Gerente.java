//gerente é um funcionario, gerente herda da class Funcionario
public class Gerente extends Funcionario {
	private int senha;	
	
	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);//constructor herdando: nome, cpf, salario e senha da class Funcionario
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return this.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
}
