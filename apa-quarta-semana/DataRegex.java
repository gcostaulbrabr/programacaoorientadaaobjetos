import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataRegex {
    private final Pattern dataPattern;
    DataRegex() {
        dataPattern = Pattern.compile("(?<dia>0[1-9]|[12][0-9]|3[01])/(?<mes>0[1-9]|1[0-2])/(?<ano>\\d{4})");
    }

    private int getElementoData(String data, String elemento) {
        // No "pattern" do regex no constructor, os grupos são nomeados com os elementos "dia", "mes" e "ano"
        if (!dataPattern.pattern().contains("?<" + elemento + ">"))
            throw new InvalidParameterException("Elemento de data inválido: " + elemento);

        Matcher matcher = dataPattern.matcher(data);
        if (!matcher.find())
            return 0;

        return Integer.parseInt(matcher.group(elemento));
    }

    public int getDia(String data) {
        return getElementoData(data, "dia");
    }

    public int getMes(String data) {
        return getElementoData(data, "mes");
    }

    public int getAno(String data) {
        return getElementoData(data, "ano");
    }
}
