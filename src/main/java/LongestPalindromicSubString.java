public class LongestPalindromicSubString {

    public static void main(String[] args) {

        String str = "baabaad";
        System.out.println(longestPalindrome(str));
    }
    
    //abccba

    private static int longestPalindrome(String str) {
        int maxLength = 0;
        String resultString = "";

        for (int i = 0; i < str.length(); i++) {
            int len1 = extend(str, i, i);
            int len2 = extend(str, i, i + 1);
            maxLength = Integer.max(maxLength, Integer.max(len1, len2));
        }
        return maxLength;
        
    }
    
    private static int extend(String str, int start, int end) {
        while (start >= 0 && end < str. length() && str.charAt(start) == str.charAt(end)) {
                start--;
                end++;
        }
        return end - start - 1;
    }
}
