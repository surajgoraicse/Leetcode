
public class Leetcode_1957DeleteCharacterstoMakeFancyString {

    public static void main(String[] args) {
        String ans = makeFancyString("aaabaaaaaaabbbbb");
        System.out.println(ans);
    }

    public static String makeFancyString(String s) {
        String fancyString = s.substring(0, 2);
        
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i - 2)) {
                continue;
            }
            fancyString += s.charAt(i);
        }
        return fancyString;
    }
}
