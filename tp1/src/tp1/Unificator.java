package tp1;

public class Unificator<T> {
	private MySimpleLinkedList<T> intercepcion ;
	private MySimpleLinkedList<T> lista1 ;
	private MySimpleLinkedList<T> lista2 ;
	
	public Unificator() {
		this.intercepcion  = new MySimpleLinkedList<T>();
	}
	
	public MySimpleLinkedList<T> unificar(MySimpleLinkedList<T> lista1 , MySimpleLinkedList<T> lista2) {
		MySimpleLinkedList<T> intercepcion = new MySimpleLinkedList<T>();
		this.lista1=lista1;
		this.lista2=lista2;
		T comparar = null;
		
		for(int i = 0 ; i< lista1.size();i++) {
			comparar = lista1.get(i);
			for(int j = 0 ;j<lista2.size();j++) {
				if(comparar == lista2.get(j)) {
					intercepcion.insertOrder(comparar);
				}
			}
			
			
		}
		
		return intercepcion;
	}
	

	public void insertarOrdenado() {
		
	}

	

}
