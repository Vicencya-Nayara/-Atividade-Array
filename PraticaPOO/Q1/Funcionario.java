package Q1;

class Funcionario {
    String nome;
    String cpf;
    String dataNascimento;
    String telefone;
    double salario;
    String cargo;
    String endereco;

    public Funcionario(String nome, String cpf, String dataNascimento, String telefone,
                       double salario, String cargo, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.salario = salario;
        this.cargo = cargo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
