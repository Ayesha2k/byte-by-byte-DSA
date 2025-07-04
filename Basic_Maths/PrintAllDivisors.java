import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {
    /*
    PROBLEM DESCRIPTION :
    You are given an integer n. You need to find all the divisors of n. 
    Return all the divisors of n as an array or list in a sorted order.
    A number which completely divides another number is called it's divisor.
    1 <= n <= 1000
    */
    public static void main(String args[]){
        System.out.println("Welcome...");
        int n = 36;
        int res[] = PrintAllDivisorsFunc(n);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
    public static int[] PrintAllDivisorsFunc(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                //avoid repeating
                if(i != n/i) list.add(n/i);
            }   
        }
        Collections.sort(list);
        //convert list to array
        int res[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
