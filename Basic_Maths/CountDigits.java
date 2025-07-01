public class CountDigits {
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

