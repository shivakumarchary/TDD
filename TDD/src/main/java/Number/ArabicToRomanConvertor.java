package Number;

public class ArabicToRomanConvertor implements Convertor {

    private static final String[] ROMAN_CHARACTERS = {"C","XC","L","XL","X", "V","IV" ,"I"};
    private static final int[] DECIMAL_EQUIVALENTS = {100,90,50,40,10,5,4,1};

    @Override
    public String convertArabicToRoman(int A) {

        StringBuilder r = new StringBuilder();

        /*if (A == 1) {
            r += "I";
        }

        if (A == 2) {
            r += "II";
        }
        if (A == 3) {
            r += "III";
        }*/

        for (int index = 0; index < ROMAN_CHARACTERS.length; index++){

            while(A >= DECIMAL_EQUIVALENTS[index]){
                r.append(ROMAN_CHARACTERS[index]);
                A -= DECIMAL_EQUIVALENTS[index];
            }

        }

        /*for(;A>=10;A-=10) {
             if (A >= 10) {
                 r += "X";
             }

        }
        for(;A>=5;A-=5)
        {
             if (A >= 5) {
                 r += "V";
             }
        }

        for(; A > 0; A--){
            r += "I";
        }

*/
        return r.toString();
    }

   }
