package tp1;

public class Unificator<T> {
	private MySimpleLinkedList<T> intercepcion ;
	private MySimpleLinkedList<T> lista1 ;
	private MySimpleLinkedList<T> lista2 ;
	
	public Unificator() {
		this.intercepcion  = new MySimpleLinkedList<T>();
	}
	
	public MySimpleLinkedList unificar(MySimpleLinkedList<T> lista1 , MySimpleLinkedList<T> lista2) {
		MySimpleLinkedList intercepcion = new MySimpleLinkedList();
		this.lista1=lista1;
		this.lista2=lista2;
		
		int idex = 0;
		for(int i = 0 ; i< lista1.size()-1;i++) {
			this.agregador(lista1.get(i));
			
			
		}
		
		return null;
	}
	
	private void agregador (T valor) {
		if(this.lista2.indexOf(valor) > -1) {
			//this.intercepcion;
		}
	}
	
}
