
public class SistemaInterno {
	//Somente para funcionários este SistemaInterno
	private int senha = 2222;//para entrar no SistemaInterno é necessário informar a senha 2222 
	
	public void autentica(FuncionarioAutenticavel fa) {//pois é o FuncionarioAutenticavel que possui dentro o método autentica();
		boolean autenticou = fa.autentica(this.senha);//g informou a senha, this.senha = 2222;
		if(autenticou) { 
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!"); 
		}
	}
	
}
