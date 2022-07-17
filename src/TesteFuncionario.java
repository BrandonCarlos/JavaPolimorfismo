public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario("Nico Steppat", "223355646-9", 2600.00);
		
		System.out.println(nico.getNome()); 
		System.out.println(nico.getBonificacao()); 
		System.out.println(nico.getSalario()); 
		
		nico.salario = 300.0;
		
	}
}
