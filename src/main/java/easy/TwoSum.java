package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayString = scanner.next();

        int[] nums = Arrays.stream(arrayString.substring(1, arrayString.length()-1).split(","))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();

        int target = scanner.nextInt();

        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i = 0, j = 1; i < nums.length && j < nums.length; i++, j++) {
            if(nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
            }
        }
        return result;
    }
}
