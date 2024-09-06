package zuper.programmer.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    @Test
    void testResourceBundle() {
        ResourceBundle message = ResourceBundle.getBundle("message");

        System.out.println(message.getString("hello"));
        System.out.println(message.getString("goodBye"));
    }

    @Test
    void testResourceBundleIndonesia() {
        Locale locale = new Locale("in", "ID");
        ResourceBundle message = ResourceBundle.getBundle("message", locale);

        System.out.println(message.getString("hello"));
        System.out.println(message.getString("goodBye"));
    }

    @Test
    void testResourceBundleNotFound() {
        Locale locale = new Locale("en", "US");
        ResourceBundle message = ResourceBundle.getBundle("message", locale);

        System.out.println(message.getString("hello"));
        System.out.println(message.getString("goodBye"));
    }

    @Test
    void testResourceBundleMultipleTime() {
        Locale locale = new Locale("en", "US");
        ResourceBundle message1 = ResourceBundle.getBundle("message", locale);
        ResourceBundle message2 = ResourceBundle.getBundle("message", locale);

        Assertions.assertSame(message1, message2);
    }
}
