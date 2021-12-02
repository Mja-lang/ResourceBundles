import java.util.Locale;
import java.util.ResourceBundle;


public class Language {
    private ResourceBundle messages;
    public enum Option{USA, GERMANY, FRANCE, ICELAND}
    private Locale locale;

    public Language() {
        messages = ResourceBundle.getBundle("messages", Locale.getDefault());
    }

    public ResourceBundle getMessages() {
        return messages;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Option country) {
        switch(country) {
            case USA -> locale = Locale.US;
            case GERMANY -> locale = Locale.GERMANY;
            case FRANCE -> locale = new Locale("fr");
            case ICELAND -> locale = new Locale("is");
            default -> locale = Locale.getDefault();
        }
        messages = ResourceBundle.getBundle("messages", locale);
    }
}
