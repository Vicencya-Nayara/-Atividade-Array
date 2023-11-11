/*Utilizando ArrayList, faça o que se pede abaixo:
Crie uma Classe Funcionário. Um Funcionário possui nome, CPF, data de nascimento, telefone, salário, cargo e endereço.
Crie uma classe Empresa. A Empresa tem um nome, cnpj, cidade, UF e um array de Funcionários, além de outros atributos que você julgar necessário.
 A empresa deve ter um método adiciona que recebe uma referência a Funcionario como argumento, e guarda esse funcionário.
Crie um método para verificar se um determinado Funcionario se encontra ou não como funcionario desta empresa
Crie um método que Percorra o atributo funcionarios da sua instância da Empresa e imprima o nome e o salário de todos seus funcionários.
 */

package Q1;

import java.util.ArrayList;

public class Empresa {
    String nome;
    String cnpj;
    String cidade;
    String uf;
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();


    public void cadastrarEmpresa(String nome, String cnpj, String cidade, String uf){
        this.nome = nome;
        this.cnpj= cnpj;
        this.cidade = cidade;
        this.uf = uf;
        this.funcionarios = new ArrayList<Funcionario>();
       
    }

    public void adiciona(Funcionario f){
        this.funcionarios.add(f);
    }

    public boolean verificarFuncionario(Funcionario f){
        return this.funcionarios.contains(f);

        }
      

    public void imprimirFuncionario(){
        for(Funcionario f: this.funcionarios){
            System.out.println("Nome: " + f.getNome() + ", Salário: " + f.getSalario());
        }
    }
}
