public class ValidPalindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isStringPalindrome(s, 0, s.length() - 1));
    }

    private static boolean isStringPalindrome(String s, int start, int end) {
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;
            start++;
            end--;
        }
        return true;

    }


}
