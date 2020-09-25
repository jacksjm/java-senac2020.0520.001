public class Departamento {
    int id;
    String descricao;
    Gerente gerente;

    public Departamento(
        int id, 
        String descricao, 
        int idGerente, 
        String nomeGerente, 
        String enderecoGerente
    ) {
        this.id = id;
        this.descricao = descricao;
        this.gerente = new Gerente(idGerente, nomeGerente, enderecoGerente, this);
    }

    public void imprimirDepartamento() {
        System.out.println("Descrição: " + this.descricao + " Gerente: " + this.gerente.nome);
    }
}