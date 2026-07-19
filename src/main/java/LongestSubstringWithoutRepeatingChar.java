import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {

        String s = "bbbbb";

        System.out.println(longestSubstringWithoutRepeatingChars(s));
    }

    private static int longestSubstringWithoutRepeatingChars(String s) {

        int left = 0;
        int maxLength = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {

            while (hashSet.contains(s.charAt(i))) {
                hashSet.remove(s.charAt(left));
                left ++;
            }
            hashSet.add(s.charAt(i));
            maxLength = Integer.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
