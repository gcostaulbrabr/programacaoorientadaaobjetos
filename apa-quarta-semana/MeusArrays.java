import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MeusArrays {
    public int pesquisarEmArrays(int[] array1, int[]array2, int valor) {
        boolean existeNoArray1 = Arrays.stream(array1).anyMatch(i -> i == valor);
        boolean existeNoArray2 = Arrays.stream(array2).anyMatch(i -> i == valor);
        return existeNoArray1 && existeNoArray2 ? 2 : (existeNoArray1 || existeNoArray2 ? 1 : 0);
    }

    public int[] criarArray(int tamanho) {
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++)
            array[i] = ThreadLocalRandom.current().nextInt(0, 1001);

        return array;
    }
}
