public class Contratador {
    public static void main(String[] args) {
        Empregado empregadoUm = new Empregado(1, "Joaquim Santos","Rua dos Alfaiates");
        Empregado empregadoDois = new Empregado(2, "Marilia de Souza", "Rua das Araucárias");

        empregadoUm.addDocumento(1, "RG", "4878956");
        empregadoUm.addDocumento(2, "CPF", "99999999999");

        empregadoDois.addDocumento(3, "CNH", "45745745687");

        empregadoUm.imprimirEmpregado();
        empregadoDois.imprimirEmpregado();
    }
}
