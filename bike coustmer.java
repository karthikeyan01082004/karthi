import java.util.*;

 class Bike{
    String bikeName;
    int bikeNo;
    String cusName;
    double serviceCost;
    Bike(String bikeName1,int bikeNo1,String cusName1,double serviceCost1){
        bikeName=bikeName1;
        bikeNo=bikeNo1;
        cusName=cusName1;
        serviceCost=serviceCost1;
    }
    void display(){
        System.out.println("bikeName:" +bikeName);
        System.out.println("bikeNo:" +bikeNo);
        System.out.println("cusName:" +cusName);
        System.out.println("serviceCost:" +serviceCost);
    }
}
public class kk{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bikeName=sc.nextLine();
        int bikeNo=sc.nextInt();
        sc.nextLine();
        String cusName=sc.nextLine();
        double serviceCost=sc.nextDouble();
        Bike bike =new Bike(bikeName, bikeNo, cusName, serviceCost);
        bike.display();
    }
}
