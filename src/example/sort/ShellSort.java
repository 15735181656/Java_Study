package example.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] temp = new int[]{2, 4, 17, 19, 9, 64, 121, 4, 21};
        System.out.println(Arrays.toString(temp));
        shellSort(temp);
        System.out.println(Arrays.toString(temp));
    }

    public static void shellSort(int[] nums){

        for (int gap = nums.length / 2; gap > 0; gap /= 2){
            for (int i = gap; i < nums.length; i++){
                int temp = nums[i];
                int j = i;
                while(j - gap > 0 && nums[j - gap] >= temp){
                    nums[j] = nums[j - gap];
                    j = j - gap;
                }
                nums[j] = temp;
            }
        }
    }
}
