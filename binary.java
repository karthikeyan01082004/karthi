import java.util.*;
public class bit2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String str="";
        //int str;
        while (a>0) {
            int r=a%2;
            a=a/2;
            str =r+str;
        }
       System.out.println(str);
    }
}
