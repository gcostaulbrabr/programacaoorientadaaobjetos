public class Exercicio1 {
    public static void Executar() {
        System.out.print("***** EXERCÍCIO 1 - INÍCIO *****\n\n");

        //MesHardcoded mes = new MesHardcoded();
        Mes mes = new Mes();

        System.out.print("MÊS\t|\tIDIOMA\t|\tRETORNO\t\n");
        System.out.print("===\t|\t======\t|\t=======\t\n");
        for (int i = 1; i <= 12; i++) {
            // Seguindo exemplo da tabela no exercício
            // - mês ímpar: imprime em português
            // - mês par: imprime em inglês
            int codigoIdioma = (i % 2 == 0 ? 2 : 1);
            System.out.printf(" %d\t|\t%d\t\t|\t%s\t\n", i, codigoIdioma, mes.getMesPorExtenso(i, codigoIdioma));
        }

        System.out.print("\n***** EXERCÍCIO 1 -  FIM   *****\n");
    }
}
