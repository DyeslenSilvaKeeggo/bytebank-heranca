package modelo;


public class Administrador extends Funcionario implements Autenticavel {

	private int senha;
	private AutenticacaoUtil autenticacaoUtil;
	
	public Administrador() {
		this.autenticacaoUtil = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticacaoUtil.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticacaoUtil.autentica(senha);

	}

}
