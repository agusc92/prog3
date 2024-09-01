package tp2.recursividad;

public class punto2 {

	public static void main(String[] args) {
		int[] arreglo= {3,4,6,7,8,9};
		System.out.println(encontrarElemento(arreglo,90,0));
		System.out.println(encontrarElementoLog(arreglo,5 ));
		
		
	}
	public static int encontrarElemento(int[] ar,int buscado,int inicio) {
		if(inicio<ar.length) {
		if(buscado == ar[inicio]) {
			return inicio;
		}else {
			return encontrarElemento(ar,buscado,inicio+1);
		}
		}
		return -1;
	}
	public static int encontrarElementoLog(int[]ar,int elemento) {
		
		return funcionamientoLog(ar,elemento,0,ar.length);
	}
	
	public static int funcionamientoLog(int[]ar,int elemento,int inicio,int fin) {
		int mitad = (inicio+fin)/2;
		if(fin>inicio) {
		if(elemento>ar[mitad]) {
			return funcionamientoLog(ar, elemento, mitad+1, fin);
		} else if(elemento<ar[mitad]) {
			return funcionamientoLog(ar, elemento, inicio, mitad-1);
		}else {
			return mitad;
		}
		
	}else {
		return  -1;
	}
	}
}
