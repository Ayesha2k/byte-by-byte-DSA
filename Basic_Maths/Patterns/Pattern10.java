import java.util.Scanner;

public class Pattern10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern10Func(n);
    }
    public static void pattern10Func(int n){
        for(int i=1;i<=2*n-1;i++){
            if(i <= n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
