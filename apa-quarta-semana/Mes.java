import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Mes {
    public String getMesPorExtenso(int mes, int codigoIdioma) {
        if (mes < 1 || mes > 12)
            throw new IllegalArgumentException("Mês inválido! Deve estar no intervalo 1-12");

        String languageTag;
        switch (codigoIdioma) {
            case 1:
                languageTag = "pt-BR";
                break;
            case 2:
                languageTag = "en-US";
                break;
            default:
                throw new IllegalArgumentException("Código de idioma inválido! Deve estar no intervalo 1-2");
        }

        return Month.of(mes).getDisplayName(TextStyle.FULL_STANDALONE, Locale.forLanguageTag(languageTag));
    }
}
