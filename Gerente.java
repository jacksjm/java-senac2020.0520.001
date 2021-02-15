public class Gerente {
    int id;
    String nome;
    String endereco;
    Departamento departamento;

    public Gerente(int id, String nome, String endereco, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.departamento = departamento;
    }
}