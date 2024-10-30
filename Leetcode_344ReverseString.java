/* 
344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output:["h","a","n","n","a","H"]
*/
import java.util.Arrays;

public class Leetcode_344ReverseString {
    public static void main(String[] args) {
        char[] arr = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverseString(char[] s) {
        int left = 0, right = s.length-1 ; char  temp;
        while(left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // update the pointers
            left++;
            right--;
        }
        
    }
}
