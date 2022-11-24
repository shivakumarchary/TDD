import java.util.Arrays;

public class StringMethods {

    String s="";
//Swap the last two Characters in a string
    String lastTwoCars(String str) {
        char[] ss=str.toCharArray();
        if (str.length() == 1)
            return str;
        if(str.length()  == 2) {
            int n=str.length();
            s+=ss[n-1];
            s+=ss[0];
            return s;
        }
        if(str.length() > 2){
            char strArray[] = str.toCharArray();
            char temp = strArray[ str.length() - 1 ];
            strArray[strArray.length - 1] = strArray[ strArray.length - 2];
            strArray[ strArray.length - 2] = temp;

            String stringWithLastTwoCharactersSwapped = new String(strArray);

            return stringWithLastTwoCharactersSwapped;
        }
        return "";
    }
    //Check given string is polindrome or not
    int palindromeOrNot(String s)
    {
        if(s=="")
            return -1;
        if(s.length() == 1) {
             return 1;
        }

        StringBuilder outputString = new StringBuilder(s);
        outputString.reverse();
        String reversedString = outputString.toString();

        if( reversedString.equals(s)){
            return 10;
        }
        else {
            return 0;
        }
    }
}
