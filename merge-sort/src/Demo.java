import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] nums = {10, -5, 8, 3, 0, 12, 6, 2};
        mergeSort(nums);
    }

    static void mergeSort(int[] nums) {
        if (nums.length == 1) return;
        int[] left = new int[nums.length / 2];
        int[] right = new int[nums.length - left.length];

        for (int i = 0; i < nums.length; i++) {
            if (i < left.length) left[i] = nums[i];
            else right[i - left.length] = nums[i];
        }

        System.out.println("=====================");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        mergeSort(left);
        mergeSort(right);

        int a = 0, i = 0, j = 0;
        for (;i < left.length && j < right.length; a++) {
            if (left[i] > right[j]) {
                nums[a] = right[j++];
            } else {
                nums[a] = left[i++];
            }
        }
        for (; i < left.length; a++) {
            nums[a] = left[i++];
        }
        for (; j < right.length; a++) {
            nums[a] = right[j++];
        }

        System.out.println("**********************");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }
}
