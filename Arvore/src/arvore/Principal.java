package arvore;

public class Principal {
	
	public static void main(String[] args) {
		
		No n = new No();
		Estrutura e = new Estrutura();
		e.inserir(7);
		e.inserir(5);
		e.inserir(3);
		e.inserir(6);
		e.inserir(4);
		e.inserir(2);
		e.inserir(1);
		e.inserir(9);
		e.inserir(8);
		
		e.preOrdem();
		System.out.println("\n________________________________\n");
		
		e.posOrdem();
		System.out.println("\n________________________________\n");
		
		e.inOrdem();
		System.out.println("\n________________________________\n");

		n = e.valorMinimo();
		System.out.println("\nValor minimo = " + n.getValor());
		
		n = e.valorMaximo();
		System.out.println("\nValor máximo = " + n.getValor());
		
		System.out.println("\n________________________________\n");
				
		e.removerMenor();

		System.out.println("\nRemovido o menor: ");
		e.inOrdem();

	}

}
