import java.util.Locale;

class Main {
   public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage());
        System.out.println (loc.getLanguage());
    }
}