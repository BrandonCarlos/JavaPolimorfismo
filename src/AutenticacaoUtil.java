public class AutenticacaoUtil {
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(double senha) {
		if (this.senha == senha) {// this.senha = senha do usuário == 2222
			return true;
		} else {
			return false;
		}
	}
}
