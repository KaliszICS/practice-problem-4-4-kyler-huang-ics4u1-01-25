public class CampbellClass {

    // Private constructor so the class behaves like a utility class
    private CampbellClass() {
    }

    // --------------------------------
    // convertString methods
    // --------------------------------

    public static String convertString(int value) {
        return String.valueOf(value);
    }

    public static String convertString(double value) {
        return String.valueOf(value);
    }

    public static String convertString(char value) {
        return String.valueOf(value);
    }

    public static String convertString(boolean value) {
        return String.valueOf(value);
    }

    // --------------------------------
    // convertMetersToCenti methods
    // --------------------------------

    public static int convertMetersToCenti(int meters) {
        return meters * 100;
    }

    public static double convertMetersToCenti(double meters) {
        return meters * 100.0;
    }

    // --------------------------------
    // removeNonAlpha methods
    // --------------------------------

    // Version without case changing
    public static String removeNonAlpha(String input) {
        if (input == null) return null;
        return input.replaceAll("[^A-Za-z]", "");
    }

    // Version with uppercase/lowercase option
    public static String removeNonAlpha(String input, boolean toUppercase) {
        if (input == null) return null;

        String cleaned = input.replaceAll("[^A-Za-z]", "");

        return toUppercase ? cleaned.toUpperCase() : cleaned.toLowerCase();
    }
}
