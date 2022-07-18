
public class Administrador extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;
	
	public Administrador(String nome, String cpf, double salario) {//Constructor com o SUPER sempre precisa estar com todos os
		//atributos da "classe base" que no caso aqui é o FuncionarioAutenticavel que possui a "senha" e aqui adicionamos a senha ao Constructor
		super(nome, cpf, salario); 
		this.autenticador = new AutenticacaoUtil();
	}

	@Override 
	public double getBonificacao() {
		return 50;
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
