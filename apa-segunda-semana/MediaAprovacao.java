// Questão 03 - Cálculo de média e aprovação

import javax.swing.JOptionPane;

public class MediaAprovacao {
    private static float lerValorFloat(String mensagemAoUsuario) {
        String leitura = JOptionPane.showInputDialog(mensagemAoUsuario);
        return Float.parseFloat(leitura);
    }

    public static void main(String[] args) {
        float notaProva1 = lerValorFloat("Digite a nota da Prova 1:");
        float notaProva2 = lerValorFloat("Digite a nota da Prova 2:");
        float notaTrabalho = lerValorFloat("Digite a nota da Trabalho:");

        float media = (notaProva1 + notaProva2 + notaTrabalho) / 3;
        String resultado = media < 6 ? "reprovado" : "aprovado";

        System.out.printf("Média: %.2f\nResultado final: %s\n", media, resultado);
    }
}