//N�o pode instanciar desse classe, porque � abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;//deixando o atributo como "protected" assim ser� visivel para as classes filhas
	
	public Funcionario(String nome, String cpf, double salario) { 
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	//vamos tornar este m�todo "abstract" assim somente meus filhos podemos implementar e usar este m�todo
	//m�todo sem corpo, n�o h� implementa��o, os filhos implementam este m�todo
	public abstract double getBonificacao();//N�o existe mais a regra de bonifica��o, cada funcion�rio recebe bonifica��o diferente

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
