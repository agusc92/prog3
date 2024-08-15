package tp1;

public class Unificator {
	private MySimpleLinkedList intercepcion ;
	public Unificator() {
		this.intercepcion  = new MySimpleLinkedList();
	}
	
	public MySimpleLinkedList unificar(MySimpleLinkedList lista1 , MySimpleLinkedList lista2) {
		MySimpleLinkedList intercepcion = new MySimpleLinkedList();
		int idex = 0;
		for(int i = 0 ; i< lista1.size()-1;i++) {
			if(lista2.indexOf(lista1.get(i)) > -1) {
				
			}
			
		}
		
		return null;
	}
	
}
