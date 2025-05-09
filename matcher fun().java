import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class add{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String phone=sc.nextLine();
       String regex="^[6-9]\\d{9}$";
       Pattern pattern=Pattern.compile(regex);
       Matcher matcher=pattern.matcher(phone);
       if(matcher.matches()){
        System.out.print(phone);
       }else{
        System.out.println("No");
       }
    }
}
