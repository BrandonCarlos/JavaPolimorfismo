
public class SistemaInterno {
	//Somente para funcion�rios este SistemaInterno
	private int senha = 2222;//para entrar no SistemaInterno � necess�rio informar a senha 2222 
	
	public void autentica(FuncionarioAutenticavel fa) {//pois � o FuncionarioAutenticavel que possui dentro o m�todo autentica();
		boolean autenticou = fa.autentica(this.senha);//g informou a senha, this.senha = 2222;
		if(autenticou) { 
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("N�o pode entrar no sistema!"); 
		}
	}
	
}
