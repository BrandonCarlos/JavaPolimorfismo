//gerente � um FuncionarioAutenticavel, gerente herda da class FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {//Agora Gerente herda de FuncionarioAutenticavel
	
	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario, senha);//constructor herdando: nome, cpf, salario e senha da class Funcionario
	}

	//Reescrita do m�todo getBonificacao()  l� da classe m�e
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do GERENTE");
		//para chamar o atributo l� da classe m�e chamamos como = super.atributoSelecionado;
		return super.getSalario();//reaproveitamente do m�todo da classe m�e
		//OBS: se utilizarmos o this.getBonificacao() o pr�prio m�todo getBonificacao() ficar� se auto executando
	}
}
