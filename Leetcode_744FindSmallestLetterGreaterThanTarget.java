class Leetcode_744FindSmallestLetterGreaterThanTarget{
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters , target));
    }
    public static char nextGreatestLetter(char[] letters , char target){
        int left  = 0 , right = letters.length-1 , mid = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid - 1;
            } else if (letters[mid] < target) {
                left = mid + 1;
            } else {
                left = mid + 1;
            }
        }
        
        System.out.println(left);
        if (left >= letters.length) {
            return letters[0];
        }
        return letters[left];




    }
}