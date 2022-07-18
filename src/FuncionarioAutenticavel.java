
public abstract class FuncionarioAutenticavel extends Funcionario {//class abstrata, ou seja ninguem inst�ncia objeto desta classe
	private int senha;//l� nas classes filhas � necess�rio remover o atributo senha, sen�o a informa��o da senha vai ser setado na classe filha e
	//essa informa��o nem chegar� aqui, e n�o ser� possivel fazer o m�todo autentica, e o polimorfismo n�o funcionar�

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
