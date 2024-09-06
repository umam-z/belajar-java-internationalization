package zuper.programmer.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {
    @Test
    void testMessageFormat() {
        String pattern =  "Hai {0}, Anda dapat mencari data anda dengan mengetikkan \"{0}\" di pencarian ";
        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{
                "fulan"
        });
        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundle() {
        Locale locale = new Locale("en", "US");
        ResourceBundle message = ResourceBundle.getBundle("message", locale);

        String pattern = message.getString("welcome.message");
        MessageFormat messageFormat = new MessageFormat(pattern,locale);
        String format = messageFormat.format(new Object[]{
                "fulan", new Date(), 1000000
        });
        System.out.println(format);
    }
}
