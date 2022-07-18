//Não pode instanciar desse classe, porque é abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;//deixando o atributo como "protected" assim será visivel para as classes filhas
	
	public Funcionario(String nome, String cpf, double salario) { 
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	//vamos tornar este método "abstract" assim somente meus filhos podemos implementar e usar este método
	//método sem corpo, não há implementação, os filhos implementam este método
	public abstract double getBonificacao();//Não existe mais a regra de bonificação, cada funcionário recebe bonificação diferente

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
