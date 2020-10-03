package nbr.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanTest {
    @Test
    public void oneTwoThree() {
        assertEquals("I", Roman.convert(1));
        assertEquals("II", Roman.convert(2));
        assertEquals("III", Roman.convert(3));
    }

    @Test
    public void four() {
        assertEquals("IV", Roman.convert(4));
    }

    @Test
    public void fiveSixSevenEight() {
        assertEquals("V", Roman.convert(5));
        assertEquals("VI", Roman.convert(6));
        assertEquals("VII", Roman.convert(7));
        assertEquals("VIII", Roman.convert(8));
    }
}