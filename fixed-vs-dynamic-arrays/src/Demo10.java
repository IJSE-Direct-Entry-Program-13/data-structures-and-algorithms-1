import java.util.ArrayList;
import java.util.Vector;

void main(){
    Vector<Integer> nums = new Vector<>();
    nums.add(10);
    nums.add(20);
    nums.add(30);
    nums.add(40);
    System.out.println(nums);
    nums.add(1, 15);
    System.out.println(nums);
    nums.add(0, 5);
    System.out.println(nums);
    nums.addFirst(2);
    System.out.println(nums);
    nums.addLast(45);
    System.out.println(nums);
}