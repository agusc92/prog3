package tp1;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		//Node<String> nodo1 = new Node<>("3",null);
		MySimpleLinkedList<Integer> lista1 = new MySimpleLinkedList<>();
		lista1.insertFront(2);
		System.out.println(lista1.getLast());
		lista1.insertLast(5);
		lista1.insertLast(6);
		
		lista1.insertLast(8);
		lista1.insertOrder(1);
		
		
		
		System.out.println(lista1);
		
		
		
	}

}
