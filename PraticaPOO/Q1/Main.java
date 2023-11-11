package Q1;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Funcionario f1 = new Funcionario("Vicencya Nayara", "00034588877", "02/02/2004", "998602994", 3000.0, "Analista", "Divisão");
        Funcionario f2 = new Funcionario("Matheus Souza", "40056789000", "15/12/2005", "987654321", 4000.0, "Desenvolvedor", "Alto do Padeiro");

        empresa.adiciona(f1);
        empresa.adiciona(f2);
        
        System.out.println("O Funcionário 1 está na empresa? " + empresa.verificarFuncionario(f1));
        System.out.println("O Funcionário 2 está na empresa? " + empresa.verificarFuncionario(f2));
        
        System.out.println("Lista de Funcionários:");
        empresa.imprimirFuncionario();
        
    }
}
