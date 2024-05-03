package Module09LoopsAssigment;
import java.util.Scanner;
public class Q02_MultiplicationTable {
    public static void main(String[]arguments){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no. of table!");
        int n=in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
