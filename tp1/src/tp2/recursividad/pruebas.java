package tp2.recursividad;

public class pruebas {

	public static void main(String[] args) {

		tablaDel(5,13);

	}
	public static void imprimir(int x) {
		System.out.println(x);
		if(x>0) {
			imprimir(x-1);
			
		}
		
	}
	public static void tablaDel(int x,int y) {
		System.out.println(x*y);
		if(y>0) {
			tablaDel(x,y-1);
		}
	}
}
