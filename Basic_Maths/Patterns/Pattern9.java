import java.util.Scanner;

public class Pattern9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern9Func(n);
    }

    public static void pattern9Func(int n){

        // Triangle 1
        for(int i=0;i<n;i++){
            //for space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //for *
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Triangle 2
        // Triangle 1
        for(int i=0;i<n;i++){
            //for space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //for *
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
