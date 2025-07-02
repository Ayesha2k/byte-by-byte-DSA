public class CountDigits {
    /*
    PROBLEM STATEMENT : 
    You are given an integer n. You need to return the number of digits in the number.
    The number will have no leading zeroes, except when the number is 0 itself.
    */
    public static void main(String[] args) {
        System.out.println("Welcome...");
        int num = 8765;
        int res = countDigitsFunc(num);
        System.out.println(res);
    }

    public static int countDigitsFunc(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}

