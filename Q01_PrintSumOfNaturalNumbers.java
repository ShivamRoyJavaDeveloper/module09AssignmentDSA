package Module09LoopsAssigment;
import java.util.Scanner;
public class Q01_PrintSumOfNaturalNumbers {
    public static void main(String [] arguments){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the no.  ");
        int n=inp.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
