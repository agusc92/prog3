package tp1;

public class main {

	public static void main(String[] args) {
		//Node<String> nodo1 = new Node<>("3",null);
		MySimpleLinkedList<String> lista1 = new MySimpleLinkedList<>();
		
		lista1.insertLast("Jose");
		lista1.insertFront("Agustin");
		lista1.insertFront("pan");
		System.out.println(lista1.size());
		
		lista1.insertLast("Marcos");
		
		
		
		System.out.print(lista1);
	}

}
