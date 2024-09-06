package zuper.programmer.i18n;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChoiceFormatTest {
    @Test
    void testChoiceFormat() {
        String pattern = "-1#negatif | 0#kosong | 1#positif | 1<banyak";
        ChoiceFormat choiceFormat = new ChoiceFormat(pattern);
        System.out.println(choiceFormat.format(-2));
        System.out.println(choiceFormat.format(-1));
        System.out.println(choiceFormat.format(0));
        System.out.println(choiceFormat.format(1));
        System.out.println(choiceFormat.format(2));
    }

    @Test
    void testChoiceFormatInMessageFormat() {
        Locale locale = new Locale("id", "ID");
        ResourceBundle balance = ResourceBundle.getBundle("message", locale);
        String pattern = balance.getString("balance");
        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        System.out.println(messageFormat.format(new Object[]{-10000}));
        System.out.println(messageFormat.format(new Object[]{0}));
        System.out.println(messageFormat.format(new Object[]{10000}));
    }

    @Test
    void testChoiceFormatInMessageFormatUS() {
        Locale locale = new Locale("en", "US");
        ResourceBundle balance = ResourceBundle.getBundle("message", locale);
        String pattern = balance.getString("balance");
        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        System.out.println(messageFormat.format(new Object[]{-10000}));
        System.out.println(messageFormat.format(new Object[]{0}));
        System.out.println(messageFormat.format(new Object[]{10000}));
    }
}
