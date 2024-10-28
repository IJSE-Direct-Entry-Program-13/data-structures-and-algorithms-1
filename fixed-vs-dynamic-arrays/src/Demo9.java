import java.util.ArrayList;
import java.util.Vector;

void main(){
    Vector<Integer> nums = new Vector<>();
    nums.add(10);
    nums.add(20);
    nums.add(30);
    nums.add(30);
    nums.add(20);
    System.out.println(nums);
    System.out.println(nums.indexOf(20)); // search from head
    System.out.println(nums.lastIndexOf(20));   // search from tail
}