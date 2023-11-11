/*2)	Crie uma Classe comparacaoDeValores e crie os seguintes métodos:

a)totalPares: o método recebe como parâmetro um array de inteiros e retorna um  
número inteiro indicando o total de números pares existentes no array.  
b) maiorValor: o método recebe como parâmetro um array de inteiros e retorna o  
maior número existente no array.  
c) totalIguais: o método recebe como parâmetro dois arrays de inteiros e retorna o  
total de números iguais existentes em ambos os arrays.  
Em seguida, crie a classe principal do programa para testar as funções criadas em arrays  
definidos estaticamente ou informados pelo usuário. 
 */

public class ComparacaoDeValores {
    public int totalPares(int [] valores){
        int cont=0;
        for(int i = 0; i < valores.length; i++){
            if(valores[i]%2==0){
                cont++;
                System.out.println("Número: "+valores[i]);
            }
        }

        return cont;
        
    }
    public int maiorValor(int [] valores){
        int maior = 0;
        for(int i =0; i < valores.length; i++){
            if(valores[i]> maior){
                maior = valores[i];
                System.out.println(valores[i]);
            }
        }
        return maior;
    }
    
    public int qtdeIguais(int [] v1, int [] v2){
        int cont = 0;
        for(int i = 0; i < v1.length; i++){
            for(int j = 0; j <v2.length; j++){
                if(i < v1.length && j < v2.length){
                    if(v1[i]==v2[j]){
                        cont++;
                    }
                }
            }
        }

        return cont;
    }
}