public class Gerente extends Funcionario implements Autenticavel{
	
		private int senha;

		public Gerente() {
			
		}
		
		public double getBonificacao() {
				return super.getBonificacao()+super.salario;
		}
		
		public int getSenha() {
			return senha;
		}
		
		public void setSenha(int senha) {
			this.senha = senha;
		}
		
		
		public boolean autentica(int senha) {
			if(this.senha ==senha) {
				return true;
			}else {
				return false;
			}
		}
		
	
}
