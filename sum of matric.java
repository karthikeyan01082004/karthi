import java.util.*;
class sum{
   public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
       int r=sc.nextInt();
       int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        for (int i = 0; i< r; i++) {
            for (int j = 0; j < c;j++){
                arr[i][j]=sc.nextInt();
            }   
        }
        for (int i = 0; i< r; i++) {
            for (int j = 0; j < c;j++){
             arr1[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i< r; i++) {
            for (int j = 0; j < c;j++){
             arr2[i][j]=arr[i][j]+arr1[i][j];
            
            System.out.print(arr2[i][j] +" ");
        }
   System.out.println();
    }
    }
    }


