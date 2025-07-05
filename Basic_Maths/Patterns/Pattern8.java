import java.util.Scanner;

public class Pattern8 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern8Func(n);  
    }

    public static void pattern8Func(int n){
        for(int i=0;i<n;i++){
            //for space
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            //for *
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
