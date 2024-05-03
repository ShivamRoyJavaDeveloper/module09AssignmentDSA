package Module09LoopsAssigment;
import java.util.Scanner;
public class Q05_FibonacciSerise {
    public static void main(String[]arguments){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term n.  ");
        int n=sc.nextInt();
        int fib=0;
        int print=1;
        for(int i=1;i<=n;i++){
            System.out.println(print);
            int temp=print;
            print=fib+print;
            fib=temp;
        }
    }
}
