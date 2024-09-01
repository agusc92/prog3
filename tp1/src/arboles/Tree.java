package arboles;

public class Tree {
	private Node<Integer> raiz;
	
	public Tree() {
		this.raiz = null;
	}
	
	public int getRaiz() {
		
		return this.raiz.getKey();
	}
	
	public boolean isEmpty() {
		return this.raiz == null;
			
	}
	
	public void add(int key) {
		if(this.raiz==null)
			this.raiz = new Node<Integer>(key);
		else {
			this.add(this.raiz,key);
		}		
	}
	
	private void add(Node<Integer> nodoActual,int key) {
		if(nodoActual.getKey() >key) {
			if(nodoActual.getIzquierdo() == null) 
				nodoActual.setIzquierdo(new Node<Integer>(key));
			else
				add(nodoActual.getIzquierdo(),key);
		}
		if(nodoActual.getKey()<key) {
			if(nodoActual.getDerecho()==null)
				nodoActual.setDerecho(new Node<Integer>(key));
			else 
				add(nodoActual.getDerecho(),key);
		}
		
	}
	
	public boolean hasElement(int key) {
		return hasElement(this.raiz,key);
	}
	
	private boolean hasElement(Node<Integer> nodoActual,int key) {
		if(nodoActual == null)
			return false;
		if(nodoActual.getKey()>key) {
			return hasElement(nodoActual.getIzquierdo(),key);
		}else if(nodoActual.getKey()<key) {
			return hasElement(nodoActual.getDerecho(),key);
		}else {
			return true;
		}
	}
	
	public int getHeight() {
		
		return getHeight(this.raiz)-1;
	}
	
	private int getHeight(Node<Integer> nodoActual) {
		if(nodoActual!= null) {
		int altIzq = getHeight(nodoActual.getIzquierdo());
		int altDer = getHeight(nodoActual.getDerecho());
		int mayor = Math.max(altIzq, altDer)+1;
		return mayor;
		}else {
			return 0;
		}	
	}
	
	public void printPosOrder(){
		printPosOrder(this.raiz);
	}
	private void printPosOrder(Node<Integer>nodoActual) {
		if(nodoActual == null) {
			
		}else {
		printPosOrder(nodoActual.getIzquierdo());
		printPosOrder(nodoActual.getDerecho());
		System.out.print(nodoActual.getKey());
		}
		
	}
}
