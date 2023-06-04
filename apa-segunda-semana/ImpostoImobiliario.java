// Questão 02 - Cálculo de imposto imobiliário (ITBI)

import javax.swing.JOptionPane;

public class ImpostoImobiliario {
    private static float lerValorFloat(String mensagemAoUsuario) {
        String leitura = JOptionPane.showInputDialog(mensagemAoUsuario);
        return Float.parseFloat(leitura);
    }

    public static void main(String[] args) {
        float valorTransacao = lerValorFloat("Digite o valor da transação imobiliária:");
        float valorVenal = lerValorFloat("Digite o valor venal:");
        float percentualImposto = lerValorFloat("Digite o percentual de imposto:");

        float baseCalculo = Math.max(valorTransacao, valorVenal);
        float valorImposto = percentualImposto / 100 * baseCalculo;

        System.out.printf("Valor do imposto a ser pago: R$ %.2f\n", valorImposto);
    }
}