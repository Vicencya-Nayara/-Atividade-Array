package Q3;
/*3)	Criar dois arrays A e B cada um com 10 elementos inteiros. Construir um array C, 
onde cada elemento de C é a multiplicação dos respectivos 
elementos em A e B, ou seja: C[i] = A[i] * B[i]. */


public class MultiplicacaoArray {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = i + 1;   
            B[i] = 2 * (i + 1);  
        }

        int[] C = new int[10];

        for (int i = 0; i < 10; i++) {
            C[i] = A[i] * B[i];
        }

        System.out.println("Array A:");
        imprimirArray(A);

        System.out.println("Array B:");
        imprimirArray(B);

        System.out.println("Array C (produto de A e B):");
        imprimirArray(C);
    }

    private static void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
