//gerente � um funcionario, gerente herda da class Funcionario
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
	
	//Reescrita do m�todo getBonificacao()  l� da classe m�e
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do GERENTE");
		//para chamar o atributo l� da classe m�e chamamos como = super.atributoSelecionado;
		return super.getSalario();//reaproveitamente do m�todo da classe m�e
		//OBS: se utilizarmos o this.getBonificacao() o pr�prio m�todo getBonificacao() ficar� se auto executando
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
}
