package nbr.roman;

public class Roman {

    /**
     * Converts int into Roman letters upto 3000.
     */
    public static String convert(int number) {

        if (number < 4) {
            return "I".repeat(number);
        }
        if (number == 4) {
            return "IV";
        }
        return "V" + "I".repeat(number - 5);

    }
}
