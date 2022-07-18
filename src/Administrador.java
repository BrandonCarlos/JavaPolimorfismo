
public class Administrador extends Funcionario implements Autenticavel {
	
	public Administrador(String nome, String cpf, double salario) {//Constructor com o SUPER sempre precisa estar com todos os
		//atributos da "classe base" que no caso aqui é o FuncionarioAutenticavel que possui a "senha" e aqui adicionamos a senha ao Constructor
		super(nome, cpf, salario); 
	}

	@Override 
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		
	}

	@Override
	public boolean autentica(double senha) {
		return false;
	}

}
