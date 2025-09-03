public class palindrome {

    public static void main(String[] args) {
        String testString1 = "madam";
        String testString2 = "racecar";
        String testString3 = "hello";
        String testString4 = "A man, a plan, a canal: Panama"; // Palindrome with non-alphanumeric chars

        System.out.println("\"" + testString1 + "\" is a palindrome: " + isPalindrome(testString1));
        System.out.println("\"" + testString2 + "\" is a palindrome: " + isPalindrome(testString2));
        System.out.println("\"" + testString3 + "\" is a palindrome: " + isPalindrome(testString3));
        System.out.println("\"" + testString4 + "\" is a palindrome: " + isPalindrome(testString4));
    }

    public static boolean isPalindrome(String str) {
        // Convert to lowercase and remove non-alphanumeric characters for robust checking
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Characters do not match, not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters matched, it's a palindrome
    }
}
