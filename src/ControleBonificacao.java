public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {//método para registrar o gerente
		double boni = f.getBonificacao(); 
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		return soma;
	}
}
