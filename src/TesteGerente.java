
public class TesteGerente {
	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente(null, null, 0);
		
		Gerente g1 = new Gerente("Marco", "235568413", 5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		System.out.println(g1.getBonificacao());  
		
		g1.setSenha(2222);
		Boolean validacao = g1.autentica(2222);
		System.out.println(validacao);
	}
}
