package exercicio3;

public class Senha {
    private String gerarSenhaAleatoria(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= tamanho; i++)
            stringBuilder.append(((int)(Math.random() * 10)));

        return stringBuilder.toString();
    }

    public void imprimirSenhaAleatoria() {
        int min = 5;
        int max = 10;
        int sorteado = (int)(Math.random() * (max - min) + min);

        System.out.printf("Número sorteado: %d\nSenha: %s\n", sorteado, gerarSenhaAleatoria(sorteado));
    }
}
