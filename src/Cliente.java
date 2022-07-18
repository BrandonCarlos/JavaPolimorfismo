public class Cliente implements Autenticavel {
	private int senha;

	@Override
	public void setSenha(int senha) {// para podermos setar a senha
		this.senha = senha;
	}

	@Override
	public boolean autentica(double senha) {
		if (this.senha == senha) {// this.senha = senha do usuário == 2222
			return true;
		} else {
			return false;
		}
	}
}
