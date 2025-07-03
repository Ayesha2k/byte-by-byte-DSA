public class GCDOrHCF {
    /*
    PROBLEM DESCRIPTION:
    You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. 
    Return the GCD of the two numbers.
    The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.
    1 <= n1, n2 <= 1000
     */
    public static void main(String args[]){
        System.out.println("Welcome...");
        int n1 = 24,n2=36;
        int res = GCDOrHCFFunc(n1,n2);
        System.out.println(res);
    }
    public static int GCDOrHCFFunc(int n1,int n2){
        int rem = 0;
        while(n1 % n2 !=0){
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }
}
