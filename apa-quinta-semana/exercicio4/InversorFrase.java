package exercicio4;

public class InversorFrase {
    public String inverterRemovendoEspacos(String frase) {
        return (new StringBuilder(frase)).reverse().toString().replace(" ", "");
    }
}
