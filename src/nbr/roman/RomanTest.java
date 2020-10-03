package nbr.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanTest {
    @Test
    public void One() {
        assertEquals("I", Roman.convert(1));
    }
}