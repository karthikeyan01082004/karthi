import java.util.*;
class reversearr{

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        return list;
    }
    public static void main(String[] args){
        ArrayList<Integer>rev=new ArrayList<>();
        rev.add(1);
        rev.add(2);
        rev.add(3);
        rev.add(4);
        System.out.println(reverseArrayList(rev)); 
        System.out.println(reverseArrayList(rev));
    }
}
