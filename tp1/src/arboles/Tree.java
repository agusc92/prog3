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
	
	public void printPreOrder() {
		printPreOrder(this.raiz);
	}
	
	private void printPreOrder(Node<Integer> nodoActual) {
		if(nodoActual == null) {
			
		}else {
			System.out.println(nodoActual.getKey());
			printPreOrder(nodoActual.getIzquierdo());
			printPreOrder(nodoActual.getDerecho());
		}
	}
	
	public void printInOrder() {
		printInOrder(this.raiz);
	}
	private void printInOrder(Node<Integer> nodoActual) {
		if(nodoActual == null) {
			
		}else {
			printInOrder(nodoActual.getIzquierdo());
			System.out.println(nodoActual.getKey());
			printInOrder(nodoActual.getDerecho());
		}
	}
	
	public void getLongestBranch() {
		System.out.println(getLongestBranch(this.raiz));
		
	}
	
	private String getLongestBranch(Node<Integer> nodoActual) {
		if(nodoActual != null){
			String izq= getLongestBranch(nodoActual.getIzquierdo());
			String der= getLongestBranch(nodoActual.getDerecho());
			if(izq.length()>der.length()) {
				return "->"+nodoActual.getKey()+izq;
			}else {
				return "->"+nodoActual.getKey() +  der;
			}
		}else {
			return "";
		}
	}
	
	public void getFrontera() {
		;
		System.out.println(getFrontera(this.raiz));

	}
	/*private String getFrontera(Node<Integer> nodoActual) {
		String izq = "";
		String dere = "";
		if(nodoActual.getIzquierdo()!=null || nodoActual.getDerecho()!=null) {		
		
		if(nodoActual.getIzquierdo()!=null) {
			izq = getFrontera(nodoActual.getIzquierdo());
		}
		if(nodoActual.getDerecho()!=null) {
			dere = getFrontera(nodoActual.getDerecho());
		}
		}else {
			return ""+nodoActual.getKey();
		}
		
		return izq + dere;
	}*/
	/*private int[] getFrontera(Node<Integer> nodoActual) {
		int[] izq =null;
		int[] dere ;
		if(nodoActual.getIzquierdo()!=null || nodoActual.getDerecho()!=null) {		
		
		if(nodoActual.getIzquierdo()!=null) {
			izq = getFrontera(nodoActual.getIzquierdo());
		}
		if(nodoActual.getDerecho()!=null) {
			dere = getFrontera(nodoActual.getDerecho());
		}
		}else {
			return new int[nodoActual.getKey()];
		}
		int[] result = new int[izq.length + dere.length];
		System.arraycopy(izq, 0, result, 0, izq.length);
		System.arraycopy(dere, 0, result, izq.length, dere.length);
		return  result;
	}
	
	private int[]  concatenarArray (int[] arr1,int[]arr2) {
		int[] concat = new int[arr1.length + arr2.length];
		if()
	}*/
}
