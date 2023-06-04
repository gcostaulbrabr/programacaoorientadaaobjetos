// Questão 01 - Cálculo de desconto

import java.math.BigDecimal;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor do produto:");
            BigDecimal valorProduto = scanner.nextBigDecimal();
            System.out.println("Digite o percentual de desconto:");
            BigDecimal percentualDesconto = scanner.nextBigDecimal();

            BigDecimal valorDesconto = percentualDesconto.divide(new BigDecimal(100)).multiply(valorProduto);
            BigDecimal valorLiquidoProduto = valorProduto.subtract(valorDesconto);

            System.out.printf("Valor do desconto: R$ %.2f\nValor do produto com o desconto: R$ %.2f\n", valorDesconto, valorLiquidoProduto);
        }
    }
}