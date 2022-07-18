public class TesteFuncionario {
	public static void main(String[] args) {
		
		//Funcionario é uma classe "Abstract", não podemos mais criar instância de Funcionario, 
		//só podemos criar filhos concretos da classe Funcionario
		Funcionario nico = new Gerente("Nico Steppat", "223355646-9", 2600.00, 0);
		
		System.out.println(nico.getNome()); 
		System.out.println(nico.getBonificacao()); 
		System.out.println(nico.getSalario()); 
		
	}
}
