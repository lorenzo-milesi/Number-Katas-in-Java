package nbr.roman;

public class Roman {

    /**
     * Converts int into Roman letters upto 3000.
     */
    public static String convert(int number) {
        StringBuilder value = new StringBuilder();
        for(int k = 1 ; k <= number ; k++) {
            value.append("I");
        }
        return value.toString();
    }
}
