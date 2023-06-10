package exercicio5;

public class InspetorFrase {
    public void inspecionarConteudoImproprio(String frase) {
        if (frase.contains("sexo") || frase.contains("sexual"))
            System.out.println("Conteúdo impróprio");
        else
            System.out.println("Conteúdo liberado");
    }
}
