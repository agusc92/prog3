package tp1;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		//Node<String> nodo1 = new Node<>("3",null);
		MySimpleLinkedList<Integer> lista1 = new MySimpleLinkedList<>();
		System.out.println(lista1.getLast());
		lista1.insertLast(5);
		lista1.insertFront(2);
		lista1.insertFront(7);
		System.out.println(lista1.size());
		
		lista1.insertLast(8);
		System.out.println(lista1.extractFront());
		lista1.insertLast(6);
		System.out.println(lista1.size());
		System.out.println(lista1);
		lista1.insertOrder(3);
		System.out.println(lista1);
		System.out.println(lista1.getLast());
		
	}

}
