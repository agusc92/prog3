package arboles;

public class Node<Integer> {
	private Node<Integer> izquierdo;
	private Node<Integer> derecho;
	
	private int key;
	
	public Node(int key){
		this.key = key;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public int getInfo() {
		return key;
	}
	
	public Node<Integer> getIzquierdo() {
		return this.izquierdo;
	}
	public Node<Integer> getDerecho() {
		return this.derecho;
	}
	public void setIzquierdo(Node<Integer> nodo) {
		this.izquierdo = nodo;
	}
	public void setDerecho(Node<Integer> nodo) {
		this.derecho = nodo;
	}
}
