public class Exercicio2 {
    public static void Executar() {
        System.out.print("***** EXERCÍCIO 2 - INÍCIO *****\n\n");

        Contagem contagem = new Contagem();
        System.out.print("contar():\n");
        contagem.contar();
        System.out.print("\ncontar(fim:3):\n");
        contagem.contar(3);
        System.out.print("\ncontar(inicio:2, fim:5):\n");
        contagem.contar(2, 5);
        System.out.print("\ncontar(inicio:6, fim:9, pausa: 2):\n");
        contagem.contar(6, 9, 2);

        System.out.print("\n***** EXERCÍCIO 2 -  FIM   *****\n");
    }
}
