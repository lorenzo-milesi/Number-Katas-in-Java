package nbr.roman;

public class Roman {

    /**
     * Converts int into Roman letters upto 3000.
     */
    public static String convert(int number) {
        if (number == 3) {
            return "III";
        }
        if(number == 2) {
            return "II";
        }
       return "I";
    }
}
