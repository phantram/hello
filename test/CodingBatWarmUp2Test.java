import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by tram on 6/26/17.
 */
class CodingBatWarmUp2Test {

    @Test
    public void testStringTimes() {
        assertEquals("HiHi", CodingBatWarmUp2.stringTimes("Hi", 2));
    }

    @Test
    public void countXX() {
        assertEquals(1 , CodingBatWarmUp2.countXX("abcxx"));
    }

    @Test
    public void altPairs() {
        assertEquals("Chole" , CodingBatWarmUp2.altPairs("Chocolate"));
    }

}