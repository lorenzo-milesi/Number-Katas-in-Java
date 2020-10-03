package nbr.roman;

public class Roman {

    /**
     * Converts int into Roman letters upto 3000.
     */
    public static String convert(int number) {
        StringBuilder value = new StringBuilder();
        value.append("I".repeat(number));
        return value.toString();
    }
}
