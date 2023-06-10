import java.util.concurrent.TimeUnit;

public class Contagem {
    public void contar() {
        contar(1, 10);
    }

    public void contar(int fim) {
        contar(1, fim);
    }

    public void contar(int inicio, int fim) {
        contar(inicio, fim, 0);
    }

    public void contar(int inicio, int fim, int pausa) {
        for (int i = inicio; i <= fim; i++) {
            if (pausa > 0) {
                try {
                    TimeUnit.SECONDS.sleep(pausa);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.printf("%d ", i);
        }
    }
}
