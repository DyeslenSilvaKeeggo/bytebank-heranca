package br.com.bytebank.modelo;


public class Cliente implements Autenticavel{
	
	private int senha;
	private AutenticacaoUtil autenticacaoUtil;
	
	public Cliente() {
		autenticacaoUtil = new AutenticacaoUtil();
	}
	
	public void setSenha(int senha) {
		this.autenticacaoUtil.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticacaoUtil.autentica(senha);
	}
}
