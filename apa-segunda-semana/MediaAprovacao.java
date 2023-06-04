// Questão 03 - Cálculo de média e aprovação

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class MediaAprovacao {
    private static BigDecimal lerValorBigDecimal(String mensagemAoUsuario) {
        String leitura = JOptionPane.showInputDialog(mensagemAoUsuario);
        return new BigDecimal(leitura);
    }

    public static void main(String[] args) {
        BigDecimal notaProva1 = lerValorBigDecimal("Digite a nota da Prova 1:");
        BigDecimal notaProva2 = lerValorBigDecimal("Digite a nota da Prova 2:");
        BigDecimal notaTrabalho = lerValorBigDecimal("Digite a nota da Trabalho:");

        BigDecimal media = notaProva1.add(notaProva2).add(notaTrabalho).divide(new BigDecimal(3));
        String resultado = media.compareTo(new BigDecimal(6)) == -1 ? "reprovado" : "aprovado";

        System.out.printf("Média: %.2f\nResultado final: %s\n", media, resultado);
    }
}