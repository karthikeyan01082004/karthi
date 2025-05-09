class Y{
    void display(){
        System.out.println("39");
    }
}class x extends Y{
        void display(){
            super.display();
            System.out.println("79");
        }
    }
    public class inn{
        public static void main(String[] args) {
            x n=new x();
            n.display();
        }
    }

