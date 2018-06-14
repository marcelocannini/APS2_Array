import java.util.ArrayList;

public class MinhaLista {

	public ArrayList<Integer> lista;
	
	public void insereFinal(Integer valor) {
		this.lista.add(valor);
	}
	
	public void insereInicio(Integer valor) {
		this.lista.add(0,valor);
	}
	
	public void insere(Integer i, Integer valor) {
		if(i > this.getTamanho()) {
			System.out.println("Índice não existe");
		} else {
			this.lista.add(i,valor);
		}		
	}
	
	public void removeFinal() {
		this.lista.remove(this.getTamanho() - 1);
	}
	
	public void removeInicio() {
		this.lista.remove(0);
	}
	
	public void alterar(Integer i, Integer valor) {
		this.lista.set(i, valor);
	}
	
	public int getTamanho() {
		return this.lista.size();
	}
	
	public int getItem(Integer i) {
		return this.lista.get(i);
	}
	
	public MinhaLista() {
		this.lista = new ArrayList(); 
	}	
}
