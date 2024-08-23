package tp1;

public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	private Node <T> last;
	private int size;
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
		this.last = null;
	}
	//O(1) porque solo se requiere 1 acceso
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		
		if(this.first == null) {
			this.last = tmp;
		}
		
		tmp.setNext(this.first);
		this.first = tmp;
		this.size ++;
	}
	//O(1) porque requiere solo 1 acceso
	public T extractFront() {		
		Node<T> tmp = this.first;
		this.first = this.first.getNext();
		this.size --;
		if(this.first == null)
			this.last = null;
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
		if(index > this.size -1 || index<0)
			return null;
		
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
	
	/*
	 * agregando el atributo last, tranformamos de O(n) a O(1)
	 * */
	public void insertLast(T info) {
		
		if(this.first == null) {
			insertFront(info);
		}else {
			
			Node<T> nuevoNodo = new Node<T>();
			nuevoNodo.setInfo(info);
			this.last.setNext(nuevoNodo);
			this.last = nuevoNodo;
			this.size ++;
		}
	}
	
	public T getLast() {
		if(this.last == null)
			return null;
		return this.last.getInfo();
	}
	
	public void insertOrder(T info) {
		
		if(this.first == null) {
			//si no hay un primer elemento, inserto info como primer elemento
			insertFront(info);
		}else  {
			Node<T> nuevoNodo = new Node<T>(info,null);
			Node<T> tmp = this.first;
			if(tmp.esMayor(info)>0) {
				//si info es menor al primer elemento, inserto info como primer elemento
				insertFront(info);
			}else {
				//se llego hasta aca, significa que la lista no esta vacia y que el primer elemento
				//no es mayor que info
				while(tmp.getNext()!= null && tmp.getNext().esMayor(info)<0) {
					//si el siguiente del elemento actual no es null y es menor a info
					tmp = tmp.getNext();
				}
				if(tmp.getNext()==null) {
					//si se llego al final de la lista y no se econtro otro numero mas grande
					insertLast(info);
				}else {
					nuevoNodo.setNext(tmp.getNext());
					tmp.setNext(nuevoNodo);
					this.size ++;
				}
				
				
			}
				
			
			
			
				
		}
		
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
