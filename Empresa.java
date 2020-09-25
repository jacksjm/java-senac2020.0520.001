public class Empresa {
    public static void main(String[] args) {
        Departamento departamentoUm = new Departamento(
            1,
            "Contabilidade",
            5,
            "Fernando Villasboas",
            "Rua dos Bobos"
        );

        Departamento departamentoDois = new Departamento(
            2,
            "Administracao",
            7,
            "Rafaela Albuquerque",
            "Rua das Gaivotas"
        );

        departamentoUm.imprimirDepartamento();
        departamentoDois.imprimirDepartamento();
    }
}
