public class ArmstrongNumbers {
    /*
    PROBLEM DESCRIPTION :
    You are given an integer n. You need to check whether it is an armstrong number or not. 
    Return true if it is an armstrong number, otherwise return false.
    An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.
    0 <= n <= 5000
     */
    public static void main(String args[]){
        System.out.println("Welcome...");
        int n = 153;
        boolean res = armstrongNumbersFunc(n);
        System.out.println(res);
    }

    public static boolean armstrongNumbersFunc(int n){
        int temp=n, count = 0, ld = 0, sum = 0;
        while(temp > 0){
            temp = temp/10;
            count++;
        }
        temp = n;
        while(temp > 0){
            ld = temp % 10;
            sum = sum + (int)Math.pow(ld, count);
            temp = temp/10;
        }
        return n == sum;
    }
}
