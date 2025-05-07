import java.util.*;
class Manager{
    String n1;
    double s1;
    String dep;

     Manager(String n1,double s1,String dep) {
        this.n1=n1;
        this.s1=s1;
        this.dep=dep;
    }void display(){
        System.out.println("--- Manager Details ---");
        System.out.println("Name: "+n1);
        System.out.println("Salary: "+s1);
        System.out.println("Department: "+dep);
        System.out.println();
    }
}
class Employee extends Manager{
    String n2;
    double s2;
    String tech;

     Employee(String n1,double s1,String dep,String n2,double s2,String tech){
        super(n1,s1,dep);
        this.n2=n2;
        this.s2=s2;
        this.tech=tech;
    }void display(){
        super.display();
        System.out.println("--- Developer Details ---");
        System.out.println("Name: "+n2);
        System.out.println("Salary: "+s2);
        System.out.println("Technology: "+tech);
       // super.display();
    }
}
class work{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String n1=sc.nextLine();
       // sc.nextLine();
    double s1 =sc.nextDouble();
    sc.nextLine();
    String dep=sc.nextLine();
    String n2=sc.nextLine();
    double s2=sc.nextDouble();
    sc.nextLine();
    String tech=sc.nextLine();

    Employee emp=new Employee(n1,s1,dep,n2,s2,tech);
    emp.display();
    }
}
