import java.util.Arrays;

void main(){
    int[] nums = {17,10,25,20,17,35};

    for (int k = 0; k < nums.length - 1; k++) {
        int maxIndex = 0;
        int max = nums[maxIndex];

        for (int i = 1; i < nums.length - k; i++) {
            if (max <= nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }
        if (maxIndex != (nums.length - 1 - k)) {
            int temp = nums[nums.length - 1 - k];
            nums[nums.length - 1 - k] = max;
            nums[maxIndex] = temp;
        }
    }

    System.out.println(Arrays.toString(nums));
}