package recursividad;

public class punto_1 {
//Implemente un algoritmo recursivo que determine si un arreglo de tamaño N está ordenado
	public static void main(String[] args) {
		int[] arreglo = {1,2,3,4,5,6,7,9};
		//System.out.println(arreglo.length);
		//System.out.println(estaOrdenadoIt(arreglo));
		
		System.out.println(estaOrdenadoRe(arreglo,0));
	}
	public static boolean estaOrdenadoIt(int[] arr) {
		boolean ordenado = true;
		
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				
			}else {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean estaOrdenadoRe(int[]arr,int inicio) {
		if(inicio<arr.length-1) {
			if(arr[inicio]>arr[inicio+1]) {
				return false;
			}else {
				return estaOrdenadoRe(arr,inicio+1);
			}
		}
		return true;
	}
}
