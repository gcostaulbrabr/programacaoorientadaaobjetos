import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Exercicio5 {
    private static String joinIntArray(int[] array) {
        return Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
    }

    public static void Executar() {
        System.out.print("***** EXERCÍCIO 5 - INÍCIO *****\n\n");

        MeusArrays meusArrays = new MeusArrays();

        System.out.println("*** Teste pesquisando valor fixo, em arrays criados estaticamente ***\n");
        int[] arrFixo1 = {2, 4, 6, 8, 10};
        int[] arrFixo2 = {3, 6, 9, 12, 15};
        System.out.printf("- arr1: %s\n- arr2: %s\n", joinIntArray(arrFixo1), joinIntArray(arrFixo2));

        for (int i = 3; i <= 6; i++)
            System.out.printf("-> resultado pesquisa(%d): %d\n", i, meusArrays.pesquisarEmArrays(arrFixo1, arrFixo2, i));


        System.out.println("\n*** Teste pesquisando valor aleatório, em arrays gerados randomicamente ***\n");
        for (int i = 1; i <= 5; i++) {
            int[] arr1 = meusArrays.criarArray(i);
            int[] arr2 = meusArrays.criarArray(i * 2);
            int valor = ThreadLocalRandom.current().nextInt(0, 1001);
            int resultadoPesquisa = meusArrays.pesquisarEmArrays(arr1, arr2, valor);

            System.out.printf("- iteração %d\n-> arr1: %s\n-> arr2: %s\n-> resultado pesquisa(%d): %d\n", i, joinIntArray(arr1), joinIntArray(arr2), valor, resultadoPesquisa);
        }

        System.out.print("\n***** EXERCÍCIO 5 -  FIM   *****\n");
    }
}
