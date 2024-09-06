package zuper.programmer.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {
    @Test
    void testMessageFormatType() {
        Locale locale = new Locale("in", "ID");
        ResourceBundle message = ResourceBundle.getBundle("message", locale);
        String pattern = message.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String format = messageFormat.format(new Object[]{
                "fulan", new Date(), 100000
        });
        System.out.println(format);
    }
    @Test
    void testMessageFormatTypeUS() {
        Locale locale = new Locale("en", "US");
        ResourceBundle message = ResourceBundle.getBundle("message", locale);
        String pattern = message.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String format = messageFormat.format(new Object[]{
                "fulan", new Date(), 100000
        });
        System.out.println(format);
    }
}
