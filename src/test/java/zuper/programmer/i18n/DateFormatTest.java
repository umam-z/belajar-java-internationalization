package zuper.programmer.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        Locale locale = new Locale("in", "ID");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);

        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        Locale locale = new Locale("ja", "JP");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);

        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatParseIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        Locale locale = new Locale("in", "ID");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);

        try {
            Date parse = simpleDateFormat.parse("Kamis 04 September 2024");
            System.out.println(parse);
        } catch (ParseException e) {
            System.out.println("Error Parse: " + e.getMessage());
        }
    }

    @Test
    void testDateFormatParseJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        Locale locale = new Locale("ja", "JP");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);

        try {
            Date parse = simpleDateFormat.parse("木曜日 05 9月 2024");
            System.out.println(parse);
        } catch (ParseException e) {
            System.out.println("Error Parse: " + e.getMessage());
        }
    }
}
