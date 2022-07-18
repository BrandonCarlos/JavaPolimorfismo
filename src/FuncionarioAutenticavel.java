
public abstract class FuncionarioAutenticavel extends Funcionario {//class abstrata, ou seja ninguem instância objeto desta classe
	private int senha;//lá nas classes filhas é necessário remover o atributo senha, senão a informação da senha vai ser setado na classe filha e
	//essa informação nem chegará aqui, e não será possivel fazer o método autentica, e o polimorfismo não funcionará

	public FuncionarioAutenticavel(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}

	public void setSenha(int senha) { 
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;//total acesso ao SistemaInterno 
		} else {
			return false;//acesso ao SistemaInterno negado
		}
	}
	
}
