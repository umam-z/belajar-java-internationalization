package zuper.programmer.i18n;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Locale;


public class LocaleTest {
    @Test
    void testLocale() {
        var lang = "id";
        var country = "ID";
        Locale locale = new Locale(lang,country);
        System.out.println(locale.getCountry());
        System.out.println(locale.getLanguage());

        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
    }

    @Test
    void testLocaleUs() {
        var lang = "en";
        var country = "US";
        Locale locale = new Locale(lang,country);
        System.out.println(locale.getCountry());
        System.out.println(locale.getLanguage());

        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
    }
}
