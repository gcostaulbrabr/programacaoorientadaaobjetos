// Questão 01 - Cálculo de desconto

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor do produto:");
            float valorProduto = scanner.nextFloat();
            System.out.println("Digite o percentual de desconto:");
            float percentualDesconto = scanner.nextFloat();

            float valorDesconto = percentualDesconto / 100 * valorProduto;
            float valorLiquidoProduto = valorProduto - valorDesconto;

            System.out.printf("Valor do desconto: R$ %.2f\nValor do produto com o desconto: R$ %.2f\n", valorDesconto, valorLiquidoProduto);
        }
    }
}