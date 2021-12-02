//import java.text.NumberFormat;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.FormatStyle;
//import java.util.Currency;
//import java.util.ResourceBundle;
//import java.util.function.Consumer;1

public class Main {
    public static void main(String[] args) {
        DateApplication dateApp = new DateApplication();
        dateApp.run();
//        Language language = new Language();
//        language.setLocale(Language.Option.ICELAND);
//        ResourceBundle messages = language.getMessages();
//        System.out.println(messages.getString("greeting"));
//        System.out.println(messages.getString("inquiry"));
//        System.out.println(messages.getString("farewell"));
//        Consumer<LocalDate> today = (date) -> {
//            DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(language.getLocale());
//            System.out.println(dtf.format(date));
//        };
//        today.accept(LocalDate.now());
//        Currency usd = Currency.getInstance("USD");
//        NumberFormat nf = NumberFormat.getCurrencyInstance(language.getLocale());
//        nf.setCurrency(usd);
//        System.out.println(nf.format(23));
    }
}
