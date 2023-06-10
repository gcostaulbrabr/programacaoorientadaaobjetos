package exercicio2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class AcrescimoProduto {
    public void executar() {
        int roundingScale = 2;
        BigDecimal percentualAcrescimo = BigDecimal.valueOf(12);
        BigDecimal fatorAcrescimo = percentualAcrescimo.divide(BigDecimal.valueOf(100)).setScale(roundingScale, RoundingMode.HALF_EVEN);

        try (Scanner scanner = new Scanner(System.in)) {
            BigDecimal valorProduto;
            do {
                System.out.print("Digite o valor do produto: ");
                valorProduto = scanner.nextBigDecimal();
                if (valorProduto.compareTo(BigDecimal.ZERO) == 0)
                    break;

                BigDecimal valorAcrescimo = valorProduto.multiply(fatorAcrescimo).setScale(roundingScale, RoundingMode.HALF_EVEN);
                BigDecimal novoValor = valorProduto.add(valorAcrescimo).setScale(roundingScale, RoundingMode.HALF_EVEN);
                System.out.printf("\n-> novo valor, com acréscimo de %.2f%%: %.2f\n", percentualAcrescimo, novoValor);
            } while (!valorProduto.equals(BigDecimal.ZERO));
        }
    }
}
