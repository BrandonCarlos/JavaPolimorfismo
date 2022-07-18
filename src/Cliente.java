public class Cliente implements Autenticavel {
	private AutenticacaoUtil autenticador;//<- aqui j� tem um objeto criado do tipo AutenticacaoUtill(), fizemos
	//assim aqui encima para poder "reutilizar" este atributo em outros m�todos

	public Cliente() {//aqui dizemos o Cliente TEM uma AutenticacaoUtil
		//Chamamos isto de composi��o -> ao criar a refer�ncia Cliente, nasce junto a refer�ncia de AutenticacaoUtil
		this.autenticador = new AutenticacaoUtil();//Gera para n�s um novo Objeto que faz refer�ncia ao AutenticacaoUtil
		//e ai podemos usar os m�todos
	}
	
	@Override
	public void setSenha(int senha) {// para podermos setar a senha
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);// this.senha = senha do usu�rio == 2222
	}
}
