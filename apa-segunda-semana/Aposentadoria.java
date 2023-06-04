// Questão 04 - Cálculo de aposentadoria por idade ou tempo de contribuição

import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        int idade = 0;
        String sexo = "";
        int tempoContribuicao = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite sua idade, em anos:");
            idade = scanner.nextInt();
            System.out.println("Digite o seu sexo (masculino/feminino/outros):");
            sexo = scanner.next();
            System.out.println("Digite o tempo de contribuição, em anos:");
            tempoContribuicao = scanner.nextInt();
        }

        if (!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("feminino")) {
            System.out.println("Seu sexo não está previsto no cálculo de tempo de aposentadoria");
            return;
        } 

        int limiteIdade = sexo.equalsIgnoreCase("masculino") ? 65 : 60;
        int limiteTempo = sexo.equalsIgnoreCase("masculino") ? 35 : 30;

        if (idade >= limiteIdade || tempoContribuicao >= limiteTempo) {
            System.out.println("Você já tem o direito a aposentadoria");
            return;
        } 

        // Calcula quantidade de anos que falta de contribuição para se aposentar
        int tempoFaltante = limiteTempo - tempoContribuicao;
        System.out.printf("Faltam %d anos de contribuição para você se aposentar\n", tempoFaltante);
    }
}