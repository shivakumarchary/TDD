import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void should_return_checkPrimeorNot(){
        Numbers temp = new Numbers();
        boolean actual = temp.checkPrimeOrNot(4);
        boolean expected =false;
        assertEquals(actual,expected);
    }
    @Test
    void should_return_falseWhenWeGive1()
    {
        Numbers temp = new Numbers();
        boolean actual = temp.checkPrimeOrNot(1);
        boolean expected =false;
        assertEquals(actual,expected);
    }
}