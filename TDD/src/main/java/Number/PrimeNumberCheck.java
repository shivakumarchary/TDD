package Number;

public class PrimeNumberCheck implements NumberMethods {
    @Override
    public boolean checkPrimeOrNot(int n)
    {
        boolean flag = false;
        if(n==1)
            return false;
        for (int i=2;i<=n/2;i++) {
            if(n % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }
}
