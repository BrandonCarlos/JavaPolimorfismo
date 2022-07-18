public class TesteFuncionario {
	public static void main(String[] args) {
		
//		Funcionario cliente = new Cliente("Marcos", "235568413", 5000.0, 0);   
		
		//Funcionario é uma classe "Abstract", não podemos mais criar instância de Funcionario,
		//só podemos criar filhos concretos da classe Funcionario
		Gerente nico = new Gerente("Nico Steppat", "223355646-9", 2600.00);
		
		System.out.println(nico.getNome()); 
		System.out.println(nico.getBonificacao()); 
		System.out.println(nico.getSalario()); 
		
	}
}
