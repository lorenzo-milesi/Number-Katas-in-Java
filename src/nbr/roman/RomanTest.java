package nbr.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanTest {
    @Test
    public void one() {
        assertEquals("I", Roman.convert(1));
    }

    @Test
    public void two() {
        assertEquals("II", Roman.convert(2));
    }

    @Test
    public void three() {
        assertEquals("III", Roman.convert(3));
    }

    @Test
    public void four() {
        assertEquals("IV", Roman.convert(4));
    }

    @Test
    public void five() {
        assertEquals("V", Roman.convert(5));
    }
}