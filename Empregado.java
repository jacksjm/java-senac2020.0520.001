import java.util.ArrayList;

public class Empregado {
    int id;
    String nome;
    String endereco;
    ArrayList<Documento> documentos;

    public Empregado(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.documentos = new ArrayList<>();
    }

    public void addDocumento(
        int idDocumento, 
        String tipoDocumento, 
        String numeroDocumento
    ) {
        Documento documento = new Documento(idDocumento, tipoDocumento, numeroDocumento);
        this.documentos.add(documento);
    }

    public void imprimirEmpregado() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Documentos: ");
        for (Documento documento : documentos) {
            System.out.println("Tipo: " + documento.tipo + " Numero: " + documento.numero);
        }
    }
}
