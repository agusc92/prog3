package arboles;

public class main {

	public static void main(String[] args) {
		Tree arbol = new Tree();
		arbol.add(3);
		arbol.add(4);
		arbol.add(5);
		arbol.add(6);
		arbol.add(7);
		System.out.println(arbol.getHeight());
		
		arbol.printPosOrder();
	}

}
