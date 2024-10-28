import java.util.ArrayList;

void main(){
    ArrayList<Integer> nums = new ArrayList<>();
    System.out.println("Is array empty? " + nums.isEmpty());
    System.out.println("Has array added the value 10?: " + nums.add(10));
    System.out.println("Is array empty? " + nums.isEmpty());
    nums.add(20);
    nums.add(30);
    System.out.println(nums.size());
    System.out.println(nums.toString());
    nums.add(40);
    System.out.println(nums);
    System.out.println(nums.size());
    System.out.println("Does array contain 30?: " + nums.contains(30));
    System.out.println("Does array contain 35?: " + nums.contains(35));
    System.out.println("What is the index of 30?: " + nums.indexOf(30));
    System.out.println("What is the index of 100?: " + nums.indexOf(100));
    System.out.println("What is the value of index 2?: " + nums.get(2));
    // System.out.println("What is the value of index -5?: " + nums.get(-5));
    System.out.println("What is the first element of the array?: " + nums.get(0));
    System.out.println("What is the first element of the array?: " + nums.getFirst());
    System.out.println("What is the last element of the array?:" + nums.get(nums.size() - 1));
    System.out.println("What is the last element of the array?:" + nums.getLast());
    int oldValue = nums.set(1,15);
    System.out.println(oldValue);
    System.out.println(nums);
}