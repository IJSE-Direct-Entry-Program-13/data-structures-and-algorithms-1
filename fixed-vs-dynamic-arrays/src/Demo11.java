import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

void main(){
    // int[] nums = {10, 20, 30, 40, 50};
//    ArrayList<Integer> nums = new ArrayList<>();
//    nums.add(10);
//    nums.add(20);
//    nums.add(30);
//    nums.add(40);
//    nums.add(50);

//    List<Integer> nums = List.of(10, 20, 30, 40, 50);
//    System.out.println(nums);

    List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    nums.add(50);
    System.out.println(nums);

    ArrayList<String> names = new ArrayList<>(Arrays.asList("ijse", "dep", "gdse", "cmjd"));

}