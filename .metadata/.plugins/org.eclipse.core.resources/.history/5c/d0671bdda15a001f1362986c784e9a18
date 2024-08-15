package tp1;

public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	private int size;
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	//O(1) porque solo se requiere 1 acceso
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size ++;
	}
	//O(1) porque requiere solo 1 acceso
	public T extractFront() {		
		Node<T> tmp = this.first;
		this.first = this.first.getNext();
		this.size --;
		return tmp.getInfo();
	}
	//O(1)
	public boolean isEmpty() {
		if(this.first == null)
			return true;
		return false;
	}
	//O(capacidad) porque debo recorrer la lista para llegar al indice
	public T get(int index) {
		/*if(index > this.size -1 || index<0)
			return null;
		*/
		Node<T> tmp = this.first;
		for(int i = 0 ;i < index ; i++) {
			tmp = tmp.getNext();
		}
		return tmp.getInfo();
	}
	
	public int size() {
		
		return this.size;
	}
	
	public int indexOf(T inf) {
		if(this.first != null) {
			Node<T> tmp = this.first;
			for(int i =0 ; i <= this.size -1;i++) {
				if(tmp.getInfo().equals(inf)) {
					return i;
				}
				tmp = tmp.getNext();
			}
		}
		return -1;
	}
	
	public void insertLast(T info) {
		Node<T> nuevoNodo = new Node<T>();
		
		Node<T> tmp = this.first;
		
		nuevoNodo.setInfo(info);
		
		if(this.first == null) {
			this.first = nuevoNodo;
		}else {
			while(tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(nuevoNodo);
			
		}
		this.size ++;
	}
	
	//O(n) porque debo acceder a cada nodo para consultar su info
	@Override
	public String toString() {
		String todo="";
		Node<T> tmp = this.first;
		while(tmp != null) {
			todo = todo + tmp.getInfo() + " ";
			tmp = tmp.getNext();
			
		}
		return todo;
	}
	
	
}
