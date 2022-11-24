import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArabicToRomanTest {
    @Test
    void should_return_Ifor1()
    {
        ArabicToRoman t=new ArabicToRoman();
        String actual=t.convertArabicToRoman(1);
        String expected="I";
        assertEquals(actual,expected);
    }
    @Test
    void should_return_IIfor2()
    {
        ArabicToRoman t=new ArabicToRoman();
        String actual=t.convertArabicToRoman(2);
        String expected="II";
        assertEquals(actual,expected);
    }

    @Test
    void should_return_IIIfor3(){
        ArabicToRoman t = new ArabicToRoman();

        String actual = t.convertArabicToRoman(3);
        String expected = "III";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_IVfor4(){
        ArabicToRoman t = new ArabicToRoman();

        String actual = t.convertArabicToRoman(4);
        String expected = "IV";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_Vfor5(){
        ArabicToRoman t = new ArabicToRoman();

        String actual = t.convertArabicToRoman(5);
        String expected = "V";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_VIIIfor8(){
        ArabicToRoman t = new ArabicToRoman();

        String actual = t.convertArabicToRoman(8);
        String expected = "VIII";

        assertEquals(expected, actual);
    }

    @Test
    void should_return_XVfor15(){
        ArabicToRoman t = new ArabicToRoman();

        String actual = t.convertArabicToRoman(15);
        String expected ="XV";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_XVIfor16(){
        ArabicToRoman t = new ArabicToRoman();

        String actual = t.convertArabicToRoman(16);
        String expected ="XVI";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_XXfor20(){
        ArabicToRoman t = new ArabicToRoman();

        String actual = t.convertArabicToRoman(20);
        String expected ="XX";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_XLfor40() {
        ArabicToRoman t = new ArabicToRoman();

        String actual = t.convertArabicToRoman(40);
        String expected = "XL";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_Lfor50() {
        ArabicToRoman t = new ArabicToRoman();

        String actual = t.convertArabicToRoman(50);
        String expected = "L";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_XCfor90() {
        ArabicToRoman t = new ArabicToRoman();

        String actual = t.convertArabicToRoman(90);
        String expected = "XC";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_Cfor100() {
        ArabicToRoman t = new ArabicToRoman();

        String actual = t.convertArabicToRoman(100);
        String expected = "C";

        assertEquals(expected, actual);
    }

}