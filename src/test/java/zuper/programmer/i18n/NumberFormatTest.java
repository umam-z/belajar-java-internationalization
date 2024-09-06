package zuper.programmer.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    @Test
    void testNumberFormat() {
        NumberFormat instance = NumberFormat.getInstance();
        String format = instance.format(1000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatIndonesia() {
        Locale locale = new Locale("id", "ID");
        NumberFormat instance = NumberFormat.getInstance(locale);
        String format = instance.format(1000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatParseIndonesia() {
        Locale locale = new Locale("id", "ID");
        NumberFormat instance = NumberFormat.getInstance(locale);
        try {
            double value = instance.parse("10.000,255").doubleValue();
            System.out.println(value);
        } catch (ParseException e) {
            System.out.println("Error Parse: " + e.getMessage());
        }
    }
}
