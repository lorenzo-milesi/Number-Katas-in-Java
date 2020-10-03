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

    @Test
    public void nine() {
        assertEquals("IX", Roman.convert(9));
    }

    @Test
    public void ten() {
        assertEquals("X", Roman.convert(10));
    }

    @Test
    public void seriesOfNumbers() {
        assertEquals("XCIX", Roman.convert(99));
        assertEquals("XLV", Roman.convert(45));
        assertEquals("CCC", Roman.convert(300));
        assertEquals("CXV", Roman.convert(115));
        assertEquals("DLXXV", Roman.convert(575));
        assertEquals("DCCCXLV", Roman.convert(845));
        assertEquals("MDCCCLXXIV", Roman.convert(1874));
    }
}