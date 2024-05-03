package Module09LoopsAssigment;
import java.util.Scanner;
public class Q04_CheckingPalidromeOfString {
    public static void main(String [] arguments){
        Scanner c=new Scanner(System.in);
        String str=c.nextLine();
        str=str.toLowerCase();
        int l=str.length();
        boolean s=true;
        int lastIndex=l-1;
        for(int i=0;i<l;i++){
            if(str.charAt(i)!=str.charAt(lastIndex)){
                s=false;
                break;
            }
            lastIndex--;
        }
        System.out.println(s);
    }
}
