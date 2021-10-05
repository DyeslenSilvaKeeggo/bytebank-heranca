
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Marco");
		gerente1.setCpf("38239343");
		gerente1.setSalario(23943.0);
	
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		
		
		boolean autenticou = gerente1.autentica(2389);
		System.out.println(autenticou);
	}
}
