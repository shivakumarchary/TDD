public class Numbers {
    boolean checkPrimeOrNot(int n)
    {
        boolean flag = false;
        if(n==1)
            return flag;
        for (int i=2;i<=n/2;i++) {
            if(n % i == 0) {
                flag = true;
                break;
            }
        }
        if(!flag)
            return true;

       return false;
    }
}
