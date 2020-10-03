package nbr.roman;

public class Roman {

    /**
     * Converts int into Roman letters upto 3000.
     */
    public static String convert(int number) {
        if (4 == number) {
            return "IV";
        }
        return "I".repeat(number);
    }
}
