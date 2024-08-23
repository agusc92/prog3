package tp1;

public class Node<T> {

	private T info;
	private Node<T> next;

	public Node() {
		this.info = null;
		this.next = null;
	}
	
	public Node(T info, Node<T> next) {
		this.setInfo(info);
		this.setNext(next);
	}
	
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	
	public int esMayor(T valor) {
		int info = (int)this.info;
		int valor2 = (int)valor;
		if(valor2<info)
			return 1;
		else if(valor2>info)
			return -1;
		
		return 0;
		
	}

}
