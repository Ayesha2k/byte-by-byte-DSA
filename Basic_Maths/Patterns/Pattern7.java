import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern7Func(n);  
    }

    public static void pattern7Func(int n){
        for(int i=0;i<n;i++){
            //for space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //for *
            for(int j=0;j<(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
