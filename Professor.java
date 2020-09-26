import java.util.ArrayList;

public class Professor {
    int id;
    String nome;
    String escolaridade;
    ArrayList<Materia> materias;

    public Professor(int id, String nome, String escolaridade) {
        this.id = id;
        this.nome = nome;
        this.escolaridade = escolaridade;
        this.materias = new ArrayList<>();
    }

    public void addMateria(Materia materia) {
        this.materias.add(materia);
        materia.addProfessor(this);
    }

    public void imprimirProfessor() {
        System.out.println("Nome " + this.nome);
        System.out.println("Matérias: ");
        for (Materia materia : materias) {
            System.out.println(materia.descricao);
        }
    }
}
