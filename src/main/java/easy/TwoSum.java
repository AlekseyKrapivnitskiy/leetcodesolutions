package easy;

import java.util.Arrays;
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
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
