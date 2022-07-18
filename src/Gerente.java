//gerente é um FuncionarioAutenticavel, gerente herda da class FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {//Agora Gerente herda de FuncionarioAutenticavel
	
	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario, senha);//constructor herdando: nome, cpf, salario e senha da class Funcionario
	}

	//Reescrita do método getBonificacao()  lá da classe mãe
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		//para chamar o atributo lá da classe mãe chamamos como = super.atributoSelecionado;
		return super.getSalario();//reaproveitamente do método da classe mãe
		//OBS: se utilizarmos o this.getBonificacao() o próprio método getBonificacao() ficará se auto executando
	}
}
