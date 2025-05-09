import java.util.*;

class Main {
    int employeeId;
    String name;
    double basicSalary;
    double netSalary;

    public void setDetails(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void calculateNetSalary() {
        double hra = 0.10 * basicSalary;
        double da = 0.05 * basicSalary;
        netSalary = basicSalary + hra + da;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Net Salary: " + netSalary);
    }
}
    public class empy{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double basicSalary = sc.nextDouble();

        Main emp = new Main();
        emp.setDetails(id, name, basicSalary);
        emp.calculateNetSalary();
        emp.displayEmployeeDetails();
    }
}
