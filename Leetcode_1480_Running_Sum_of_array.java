
import java.util.Arrays;

/*
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1
 */

public class Leetcode_1480_Running_Sum_of_array {
    public static void main(String[] args) {
        int[] arr = {3,43,24,32,4,5,34232,4545,45524,234,234};
        int[] sumArr = runningSum(arr);
        System.out.println(Arrays.toString(sumArr));


    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] arr = new int[nums.length];
        for( int i = 0; i<nums.length ; i++){
            sum = sum + nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
