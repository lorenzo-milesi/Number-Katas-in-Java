package nbr.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}