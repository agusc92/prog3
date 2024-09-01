package tp2.recursividad;

public class Convertir_a_binario {

	public static void main(String[] args) {
		
		int numeroDecimal = 44;
        String numeroBinario = decimalABinario(numeroDecimal);
        System.out.println(numeroDecimal + " en binario es: " + numeroBinario);
	}

	
		
	public static String decimalABinario(int n) {
        if (n == 0) {
            return ""; // Caso base: si n es 0, el resultado es una cadena vacía
        } else {
            return decimalABinario(n / 2) + (n % 2);
        }
    }
}
