public class LongestPalindromeAns {
    String inputStr;

    public LongestPalindromeAns(String inputStr) {
        this.inputStr = inputStr;
    }

    public String findPalindrome() {
        String longestPalindrome = "";

        // odd length palindrome
        for (int i = 0; i < this.inputStr.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < this.inputStr.length()
                    && this.inputStr.charAt(left) == this.inputStr.charAt(right)) {
                left--;
                right++;
            }
            String oddPalindrome = this.inputStr.substring(left + 1, right);
            if (oddPalindrome.length() >= longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }
        }

        // even length palindrome
        for (int i = 0; i < this.inputStr.length(); i++) {
            int left = i;
            int right = i + 1;
            while (left >= 0 && right < this.inputStr.length()
                    && this.inputStr.charAt(left) == this.inputStr.charAt(right)) {
                left--;
                right++;
            }
            String evenPalindrome = this.inputStr.substring(left + 1, right);
            if (evenPalindrome.length() >= longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
        }
        return longestPalindrome;
    }

    public static void main(String[] args) {
        LongestPalindromeAns testSol = new LongestPalindromeAns("hello");
        System.out.println(testSol.findPalindrome());
    }

}
