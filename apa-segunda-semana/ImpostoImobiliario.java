// Questão 02 - Cálculo de imposto imobiliário (ITBI)

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ImpostoImobiliario {
    private static BigDecimal lerValorBigDecimal(String mensagemAoUsuario) {
        String leitura = JOptionPane.showInputDialog(mensagemAoUsuario);
        return new BigDecimal(leitura);
    }

    public static void main(String[] args) {
        BigDecimal valorTransacao = lerValorBigDecimal("Digite o valor da transação imobiliária:");
        BigDecimal valorVenal = lerValorBigDecimal("Digite o valor venal:");
        BigDecimal percentualImposto = lerValorBigDecimal("Digite o percentual de imposto:");

        BigDecimal baseCalculo = valorTransacao;
        if (valorTransacao.compareTo(valorVenal) == -1) {
            baseCalculo = valorVenal;
        }
        BigDecimal valorImposto = percentualImposto.divide(new BigDecimal(100)).multiply(baseCalculo);

        System.out.printf("Valor do imposto a ser pago: R$ %.2f\n", valorImposto);
    }
}