import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeNumberCheckTest {
        PrimeNumberCheck temp = new PrimeNumberCheck();

    @Test
    void should_return_falseWhenSquareCompositeNumber(){
//        Numbers temp = new Numbers();
        boolean actual = temp.checkPrimeOrNot(4);
        boolean expected =false;
        assertEquals(actual,expected);
    }

    @Test
    void should_return_falseWhenCompositeNumber(){
//        Numbers temp = new Numbers();
        boolean actual = temp.checkPrimeOrNot(6);
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
        boolean expected =true;
        assertEquals(actual,expected);
    }
}