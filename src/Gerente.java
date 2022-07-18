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
	
	//Reescrita do método getBonificacao()  lá da classe mãe
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		//para chamar o atributo lá da classe mãe chamamos como = super.atributoSelecionado;
		return super.getSalario();//reaproveitamente do método da classe mãe
		//OBS: se utilizarmos o this.getBonificacao() o próprio método getBonificacao() ficará se auto executando
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
}
