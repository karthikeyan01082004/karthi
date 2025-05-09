import java.util.*;
class digonal{
   public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i = 0; i< n; i++) {
            for (int j = 0; j < n;j++){
                arr[i][j]=sc.nextInt();
            }   
        }
        int major=0;
        int minor=0;
        for (int i = 0; i< n; i++) {
                major+=arr[i][i];
                minor+=arr[i][n-1-i];
            }  int totalsum=major+minor;
            if(n%2==1){
                int centre=arr[n/2][n/2];
                totalsum-=centre;
            }
        System.out.println(major);
        System.out.println(minor);
        System.out.println(totalsum);
    }
}
