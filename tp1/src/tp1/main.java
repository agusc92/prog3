package tp1;

public class main {

	public static void main(String[] args) {
		//Node<String> nodo1 = new Node<>("3",null);
		MySimpleLinkedList<String> lista1 = new MySimpleLinkedList<>();
		System.out.println(lista1.getLast());
		lista1.insertLast("Jose");
		lista1.insertFront("Agustin");
		lista1.insertFront("pan");
		System.out.println(lista1.size());
		
		lista1.insertLast("Marcos");
		System.out.println(lista1.extractFront());
		lista1.insertLast("Zoro");
		System.out.println(lista1.size());
		
		System.out.println(lista1);
		System.out.println(lista1.getLast());
		
	}

}
