public class PalindromicSubstrings {

    static int count = 0;
    public static void main(String[] args) {
        String string = "aaa";

        System.out.println(palindromicSubStrings(string));
    }

    private static int palindromicSubStrings(String string) {
        for (int i = 0; i < string.length(); i++) {
            expand(string, i, i);
            expand(string, i, i + 1);

        }
        return count;
    }

    private static void expand(String string, int start, int end) {
        while (start >= 0 && end < string.length() && string.charAt(start) == string.charAt(end)) {
            count++;
            start--;
            end++;
        }

    }
}
