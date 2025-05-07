class employee{
    int id;
    //String name;
   int salary;
    int area;
   employee (int l,int b){
        id=l;
        //name=n;
       salary=b;
        area=id*salary;

}
void display(){
    System.out.println(id);
    System.out.println(salary);
    System.out.println(area);
}
}
public class emp{
    public static void main(String[] args) {
        employee s1=new employee(10,5);
        s1.display();
    }
}
