import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersTest {
        Numbers temp = new Numbers();

    @Test
    void should_return_checkPrimeorNot(){
//        Numbers temp = new Numbers();
        boolean actual = temp.checkPrimeOrNot(4);
        boolean expected =false;
        assertEquals(actual,expected);
    }
    @Test
    void should_return_falseWhenWeGive1()
    {
        boolean actual = temp.checkPrimeOrNot(1);
        boolean expected =false;
        assertEquals(actual,expected);
    }

    @Test
    void should_return_trueWhenPrimeNumber(){

        boolean actual = temp.checkPrimeOrNot(7);
        boolean expected =false;
        assertEquals(actual,expected);
    }
}