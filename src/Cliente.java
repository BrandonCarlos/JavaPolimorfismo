public class Cliente implements Autenticavel {
	private AutenticacaoUtil autenticador;//<- aqui já tem um objeto criado do tipo AutenticacaoUtill(), fizemos
	//assim aqui encima para poder "reutilizar" este atributo em outros métodos

	public Cliente() {//aqui dizemos o Cliente TEM uma AutenticacaoUtil
		//Chamamos isto de composição -> ao criar a referência Cliente, nasce junto a referência de AutenticacaoUtil
		this.autenticador = new AutenticacaoUtil();//Gera para nós um novo Objeto que faz referência ao AutenticacaoUtil
		//e ai podemos usar os métodos
	}
	
	@Override
	public void setSenha(int senha) {// para podermos setar a senha
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);// this.senha = senha do usuário == 2222
	}
}
