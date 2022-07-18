
public class Administrador extends FuncionarioAutenticavel {
	
	public Administrador(String nome, String cpf, double salario, int senha) {//Constructor com o SUPER sempre precisa estar com todos os
		//atributos da "classe base" que no caso aqui é o FuncionarioAutenticavel que possui a "senha" e aqui adicionamos a senha ao Constructor
		super(nome, cpf, salario, senha); 
	}

	@Override 
	public double getBonificacao() {
		return 50;
	}

}
