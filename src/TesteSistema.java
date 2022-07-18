
public class TesteSistema {

	public static void main(String[] args) {

		// Gerente e Administrador s�o objetos que herdam de FuncionarioAutenticavel
		// logo eles tamb�m tem refer�ncia de FuncionarioAutentical,
		// m�s s�o do objeto Gerente e Administrador
		Gerente g = new Gerente("Marcos", "235568413", 5000.0, 2222);
		SistemaInterno si = new SistemaInterno();
		si.autentica(g); 

		Administrador adm = new Administrador("Marcos", "235568413", 3000.0, 123);
		SistemaInterno si2 = new SistemaInterno();
		si2.autentica(adm);

	}

}
