import org.junit.Assert;
import org.junit.Test;

public class BigIntegerTest {
    /**
     * Basic test for the toString method, ensures that the bigInt can be read out as it was entered
     * @result Should always be the same as what was entered
     */
    @Test
    public void basicToStringTest(){
        toStringTest("123,456");
    }

    /**
     * Basic test for the toString method, ensures that the bigInt can be read out as it was entered
     * @result Should always be the same as what was entered
     */
    @Test
    public void basicNegativeToStringTest(){
        toStringTest("-123,456");
    }

    /**
     * Bigger test for the toString method, ensures that the bigInt can be read out as it was entered
     * @result Should always be the same as what we entered
     */
    @Test
    public void bigToStringTest(){
        toStringTest("46,376,937,677,490,009,712,648,124,896,970,078,050,417,018,260,538");
    }

    /**
     * Negative test for the toString method, ensures that the bigInt can be read out as it was entered
     * @result Should always be the same as what we entered
     */
    @Test
    public void negativeToStringTest(){
        toStringTest("-46,376,937,677,490,009,712,648,124,896,970,078,050,417,018,260,538");
    }

    /**
     * Tests the toString method, ensuring all other tests will work
     * @param initial The initial value which the toString should return exactly
     */
    private void toStringTest(String initial) {
        BigInteger bigInt = new BigInteger(initial);
        Assert.assertEquals(initial, bigInt.toString());
    }
}