import java.util.concurrent.ThreadLocalRandom;

public class Senha {
    public String gerar() {
        StringBuilder senha = new StringBuilder();
        int tamanhoSenha = 8;
        for (int i = 1; i <= tamanhoSenha; i++)
            senha.append(ThreadLocalRandom.current().nextInt(0, 10));

        return senha.toString();
    }
}
