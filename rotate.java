import java.util.*;
class rotate {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        int arr1[][]=new int[n][n];
        int arr2[][]=new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j]=arr[j][i];
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j]=arr1[i][n-1-j];
                System.out.print(arr2[i][j] +" " );
    }
    System.out.println();
}
    }
}
