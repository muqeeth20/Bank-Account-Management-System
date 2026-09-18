public class Utils {

    public static boolean isValidName(String name) {

        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidPhone(String phone) {

        return phone.matches("\\d{10}");
    }

    public static boolean isValidEmail(String email) {

        return email.contains("@") && email.contains(".");
    }

    public static boolean isValidAmount(double amount) {

        return amount > 0;
    }
}