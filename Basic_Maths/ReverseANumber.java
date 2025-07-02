public class ReverseANumber {
    /*
    PROBLEM STATEMENT : 
    Given a signed 32-bit integer x, return x with its digits reversed. 
    If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
    */
    public static void main(String[] args){
        System.out.println("Welcome...");
        int x = -6532;
        int res = reverseANumberFunc(x);
        System.out.println(res);

    }

    public static int reverseANumberFunc(int x){
        int lastDigit = 0,rev = 0;
        while(x != 0){
            lastDigit = x % 10;
            x = x / 10;
            //check if overflow, return 0
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && lastDigit > 7)) return 0;
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && lastDigit < -8)) return 0;
            rev = rev * 10 + lastDigit;
        }
        return rev;
    }
}
