public class Main {
    public static void main(String[] args) {
        ComparacaoDeValores cv = new ComparacaoDeValores();

        int [] v1 = new int [10];
        int [] v2 = new int [10];

        for(int i = 0; i < v1.length; i ++){
            v1[i] = (i*i)/2;
            v2[i] = (i*i);
        }

        int qtdPares = cv.totalPares(v1);
        int maiorValor = cv.maiorValor(v1);
        int resultado = cv.qtdeIguais(v1, v2);

        System.out.println("Quantidade de pares: " + qtdPares);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Quantidade de iguais: " + resultado);

    }
}