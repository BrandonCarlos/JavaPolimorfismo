public class TesteReferencias {
	public static void main(String[] args) {
		//Gerente Herda do Funcionario, lado esquerdo é sempre a parte mais Genêrica, e lado direto mais Especifico
		Funcionario g1 = new Gerente("Marcos", "235568413", 5000.0, 0);
		Funcionario f = new Funcionario("Nico Steppat", "223355646-9", 2000.00);
		Funcionario ev = new EditorVideo("Nico Steppat", "223355646-9", 2500.00);
		Funcionario d = new Designer("Nico Steppat", "223355646-9", 2000.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);//E agora utilizamos somente um método chamado "registra" para todos os funcionarios
		controle.registra(f); 
		controle.registra(ev);
		controle.registra(d);
		System.out.println(controle.getSoma());
		
		System.out.println(g1);
		System.out.println(f);
		System.out.println(ev);
		System.out.println(d);
	}
}
