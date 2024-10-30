/*
 1464. Maximum Product of Two Elements in an Array
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 

Example 1:

Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Example 3:

Input: nums = [3,7]
Output: 12
 * 
 */

public class Leetcode_1464MaximumProductofTwoElementsArray {

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 2};
        System.out.println(maxProduct(arr));

    }

    public static int maxProduct(int[] nums) {
        int max = nums[0], secondMax = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        System.out.println("max : " + max + " secondMax: " + secondMax);
        return (max - 1) * (secondMax - 1);
    }
}
