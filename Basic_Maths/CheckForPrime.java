public class CheckForPrime {
    /*
    PROBLEM DESCRIPTION: 
    You are given an integer n. You need to check if the number is prime or not. 
    Return true if it is a prime number, otherwise return false.
    A prime number is a number which has no divisors except 1 and itself.
     */
    public static void main(String args[]){
        System.out.println("Welcome...");
        int n = 17;
        boolean res = checkForPrimeFunc(n);
        System.out.println(res);
    }

    public static boolean checkForPrimeFunc(int n){
        if(n < 2) return false;
        //count divisors
        int count = 0;
        //i starts with 2 ans 1 is the divisor of every number.
        for(int i = 2;i*i<=n;i++){
            if(n%i == 0){
                count++;
                break;
            }
        }
        // No divisor found --> PRIME
        return count==0?true:false;
    }
}
