public class Exercicio3 {
    public static void Executar() {
        System.out.print("***** EXERCÍCIO 3 - INÍCIO *****\n\n");

        Data data = new Data();
        String[] datas = {"01/02/2023","21/12/2012","28/02/1997","29/02/1998","30/02/1999","29/02/2000","32/10/1234","30/20/1000","01/02/304","2/03/0004","03/4/5060","20/10/0000"};
        for (String d: datas)
            System.out.printf("Data: %s\n\tdia = %d\n\tmês = %d\n\tano = %d\n", d, data.getDia(d), data.getMes(d), data.getAno(d));

        System.out.print("\n***** EXERCÍCIO 3 -  FIM   *****\n");
    }
}
