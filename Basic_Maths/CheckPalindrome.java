public class CheckPalindrome {
    /*
    PROBLEM STATEMENT : 
    Given an integer x, return true if x is a palindrome, and false otherwise.
    Solve it without converting the integer to a string.
    */
    public static void main(String args[]){
        System.out.println("Welcome...");
        //int x = -121;
        int x = 121;
        boolean res = checkPalindromeFunc(x);
        System.out.println(res);
    }

    public static boolean checkPalindromeFunc(int x){
        // reverse second half of the number and compare with first half
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reverseHalf = 0, lastDigit = 0;
        while(x > reverseHalf){
            lastDigit = x % 10;
            x = x/10;
            reverseHalf = reverseHalf * 10 + lastDigit;
        }
        //when x is even || odd length
        return (x == reverseHalf || x == reverseHalf/10);
    }
    
}
