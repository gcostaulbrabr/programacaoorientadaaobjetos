package exercicio1;

import java.util.concurrent.ThreadLocalRandom;

public class Dado {
    private final int lados = 6;

    public int rolar() {
        return ThreadLocalRandom.current().nextInt(1, lados + 1);
    }

    public void jogarTresVezes() {
        int resultado = 0;
        for (int i = 1; i <= 3; i++)
            resultado += rolar();

        System.out.printf("Resultado de 3 jogadas de um dado de %d lados: %d\n", lados, resultado);
    }
}