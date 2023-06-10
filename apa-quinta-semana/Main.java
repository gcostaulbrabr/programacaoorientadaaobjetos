public class Main {
    public static void main(String[] args) {
        System.out.println("***** EXERCICIO 1 *****");
        exercicio1.Dado dado = new exercicio1.Dado();
        dado.jogarTresVezes();

        System.out.println("\n***** EXERCICIO 2 *****");
        exercicio2.AcrescimoProduto acrescimoProduto = new exercicio2.AcrescimoProduto();
        acrescimoProduto.executar();

        System.out.println("\n***** EXERCICIO 3 *****");
        exercicio3.Senha senha = new exercicio3.Senha();
        senha.imprimirSenhaAleatoria();

        System.out.println("\n***** EXERCICIO 4 *****");
        exercicio4.InversorFrase inversorFrase = new exercicio4.InversorFrase();
        String frase = "Socorram me subi num onibus em Marrocos!";
        System.out.printf("Frase: %s\nInvertida: %s\n", frase, inversorFrase.inverterRemovendoEspacos(frase));

        System.out.println("\n***** EXERCICIO 5 *****");
        exercicio5.InspetorFrase inspetorFrase = new exercicio5.InspetorFrase();
        frase = "Esta vaga de emprego oferece como vantagem, vale refeição ou alimentação da bandeira sodexo.";
        System.out.printf("Frase: %s\n", frase);
        inspetorFrase.inspecionarConteudoImproprio(frase);
        frase = "O workshop demonstrará como identificar os diferentes tipos de pedras e minerais, e ensinará sobre a sexualidade dos aerolitos.";
        System.out.printf("Frase: %s\n", frase);
        inspetorFrase.inspecionarConteudoImproprio(frase);

        System.out.println("\n***** EXERCICIO 6 *****");
        exercicio6.Substring substring = new exercicio6.Substring();
        frase = "Seu pai está na frente da TV, assistindo a missa";
        System.out.printf("Frase: %s\nSubstring: %s\n", frase, substring.substring(frase));

        System.out.println("\n***** EXERCICIO 7 *****");
        System.out.printf("Para elevar um número a uma potência, usamos o método pow() de Math.\nExemplo: Math.pow(%.0f, %.0f) = %.0f\n", 2F, 6F, Math.pow(2, 6));

        System.out.println("\n***** EXERCICIO 8 *****");
        System.out.printf("Para converter radianos em graus, usamos o método toDegrees() de Math.\nExemplo: Math.toDegrees(%.6f) = %.6f\n", 3.141592F, Math.toDegrees(3.141592F));
    }
}