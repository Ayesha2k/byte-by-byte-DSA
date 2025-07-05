import java.util.Scanner;

public class Pattern6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern5Func(n);  
    }

    public static void pattern5Func(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
