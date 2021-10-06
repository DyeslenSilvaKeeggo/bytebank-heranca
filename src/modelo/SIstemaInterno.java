package modelo;

public class SIstemaInterno {
	
	private int senha=3232;
	
	public void autentica(Gerente g) {
	boolean autenticou =	g.autentica(this.senha);
		if(autenticou) {
			System.out.println("Seja bem vindo");
		}else {
			System.out.println("Erro de autenticacao");
		}
	}
}
