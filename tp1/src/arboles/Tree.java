package arboles;

import java.util.ArrayList;

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
	private ArrayList<Integer> getLongestBranch(Node<Integer> nodoActual) {
		
		if(nodoActual != null){
			ArrayList<Integer> izquierda= getLongestBranch(nodoActual.getIzquierdo());
			ArrayList<Integer> derecha = getLongestBranch(nodoActual.getDerecho());
			if(izquierda.size()>derecha.size()) {
				izquierda.add(0, nodoActual.getKey());
				return izquierda;
			}else {
				derecha.add(0,nodoActual.getKey());
				return derecha;
			}
		}else {
			return new ArrayList<Integer>();
		}
	}
	
	public void getFrontera() {
		
		System.out.println(getFrontera(this.raiz));

	}
	private ArrayList<Integer> getFrontera(Node<Integer> nodoActual) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(nodoActual.getIzquierdo()!=null || nodoActual.getDerecho()!=null) {		
		
		if(nodoActual.getIzquierdo()!=null) {
			result.addAll(getFrontera(nodoActual.getIzquierdo()) );
		}
		if(nodoActual.getDerecho()!=null) {
			result.addAll(getFrontera(nodoActual.getDerecho() ));
		}
		}else {
			 result.add(nodoActual.getKey());
		}
		
		return result;
	}
	
	public int getMaxElement() {
		return getMaxElement(this.raiz);
	}
	
	private int getMaxElement(Node<Integer> nodoActual) {
		if(nodoActual.getDerecho()==null)
			return nodoActual.getKey();
		else return getMaxElement(nodoActual.getDerecho());
	}
	
	public ArrayList<Integer> getElementAtLevel(){
		return getElementAtLevel(this.raiz);
				}
	private ArrayList<Integer> getElementAtLevel(Node<Integer> nodoActual){
		ArrayList<Integer >result = new ArrayList<Integer>();
		return result;
		
	}
}
