package Number;

public class PrimeNumberCheck implements NumberMethods {
    @Override
    public boolean checkPrimeOrNot(int numberToCheck)
    {
        boolean flag = false;
        if( numberToCheck == 1 ){
            return false;
        }
        for (int i=2;i<=numberToCheck/2;i++) {
            if( numberToCheck % i == 0 ) {
                flag = true;
                break;
            }
        }
        return !flag;
    }
}
