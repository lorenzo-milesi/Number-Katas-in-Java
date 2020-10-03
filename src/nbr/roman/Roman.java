package nbr.roman;

import java.util.ArrayList;

public class Roman {

    /**
     * Converts int into Roman letters upto 3000.
     */
    public static String convert(int number) {
        if (number > 3000 || number <= 0) {
            return "Cannot convert";
        }

        ArrayList<Integer> decomposition = Roman.decimalDecompose(number);

        if (decomposition.get(0) < 4) {
            return "I".repeat(number);
        }
        if (decomposition.get(0) == 4) {
            return "IV";
        }
        if (decomposition.get(0) < 9) {
            return "V" + "I".repeat(decomposition.get(0) - 5);
        }
        return "IX";
    }

    /**
     * Decomposes any int into its factor 10^i decomposition, example :
     * 456 will give [6, 5, 4] ( 6*10^0 + 5*10^1 + 4*10^2 )
     *
     * @param number int to decompose
     * @return array of integers indexed by power of 10
     */
    private static ArrayList<Integer> decimalDecompose(int number) {
        ArrayList<Integer> result = new ArrayList<>();
        int decompose = number;
        while (decompose > 0) {
            int keep = decompose % 10;
            result.add(keep);
            decompose = (decompose - keep) / 10;
        }
        return result;
    }
}
