import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Data {
    private final DateTimeFormatter formatter;

    Data() {
        formatter = DateTimeFormatter
                .ofPattern("dd/MM/uuuu")
                // https://stackoverflow.com/a/32823520 - não aceita 30/02/1999 como uma data válida
                .withResolverStyle(ResolverStyle.STRICT);
    }

    private LocalDate parseDate(String date) {
        try {
            return LocalDate.parse(date, formatter);
        }
        catch (DateTimeParseException e) {
            return null;
        }
    }

    public int getDia(String data) {
        LocalDate date = parseDate(data);
        return date == null ? 0 : date.getDayOfMonth();
    }

    public int getMes(String data) {
        LocalDate date = parseDate(data);
        return date == null ? 0 : date.getMonthValue();
    }

    public int getAno(String data) {
        LocalDate date = parseDate(data);
        return date == null ? 0 : date.getYear();
    }
}
