package zuper.programmer.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {
    @Test
    void testCurrency() {
        Locale locale = new Locale("id", "ID");
        Currency currency = Currency.getInstance(locale);
        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(locale));
    }

    @Test
    void testCurrencyUS() {
        Locale locale = new Locale("en", "US");
        Currency currency = Currency.getInstance(locale);
        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(locale));
    }

    @Test
    void testNumberFormatCurrencyIndonesia() {
        Locale locale = new Locale("id", "ID");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        String format = currencyInstance.format(10000);
        System.out.println(format);
    }

    @Test
    void testNumberFormatParseCurrencyIndonesia() {
        Locale locale = new Locale("id", "ID");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        try {
            double value = currencyInstance.parse("Rp1.000.000,23").doubleValue();
            System.out.println(value);
        } catch (ParseException e) {
            System.out.println("cannot parse: " + e.getMessage());
        }
    }
}
