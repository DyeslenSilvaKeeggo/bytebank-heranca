package br.com.bytebank.teste;
		
import br.com.bytebank.modelo.Funcionario;
import br.com.bytebank.modelo.Gerente;

public class TesteReferencias {

		public static void main(String[] args) {
			Funcionario g1 = new Gerente();
			
			g1.setNome("Dyeslen");
			String nome = g1.getNome();
			System.out.println(nome);
		}
}