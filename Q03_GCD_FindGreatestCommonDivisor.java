package Module09LoopsAssigment;
import java.util.Scanner;

public class Q03_GCD_FindGreatestCommonDivisor {
    public static void main(String[] arguments) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.1 ");
        int n1=sc.nextInt();
        System.out.println("Enter the no.2 ");
        int n2=sc.nextInt();

        int gsd=0;

        for(int i=1; i<=Math.min(n1,n2);i++ ){
            if(n1%i==0 && n2%i==0){
                gsd=i;
            }
        }
        System.out.println(gsd);
    }
}
