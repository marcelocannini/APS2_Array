import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		MinhaLista lista = new MinhaLista();
		System.out.println("Tamanho da lista: "+lista.getTamanho());
		
		lista.insereFinal(5);
		lista.insereFinal(3);
		lista.insereInicio(2);
		lista.insereInicio(22);
		lista.insere(5,22);
		lista.insere(3,22);
		lista.insere(2,22);
		
		System.out.println("Tamanho da lista agora: "+lista.getTamanho());
		
		lista.removeFinal();
		
		System.out.println("Tamanho da lista: "+lista.getTamanho());
		
		lista.removeFinal();
		
		System.out.println("Posição 3: "+lista.getItem(3));
		
		lista.alterar(3, 7);
		
		System.out.println("Posição 3 agora: "+lista.getItem(3));
	}
	
	

}
