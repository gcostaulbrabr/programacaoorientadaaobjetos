public class Exercicio4 {
    public static void Executar() {
        System.out.print("***** EXERCÍCIO 4 - INÍCIO *****\n\n");
        Senha senha = new Senha();
        for (int i = 1; i <= 10; i++)
            System.out.printf("Senha %2d: %s\n", i, senha.gerar());

        System.out.print("\n***** EXERCÍCIO 4 -  FIM   *****\n");
    }
}
