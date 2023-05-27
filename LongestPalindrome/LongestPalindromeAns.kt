class LongestPalindromeAns(val inputStr: String) {

    fun findPalindrome(): String {
        var longestPal: String = ""

        for (i in inputStr.indices) {

            // handle odd length palindromes
            var left = i
            var right = i

            while (left >= 0 && right < inputStr.length && inputStr[left] == inputStr[right]) {
                left--
                right++
            }
            var oddPalindrome = inputStr.substring(left + 1, right)

            if (oddPalindrome.length >= longestPal.length) {
                longestPal = oddPalindrome.toString()
            }
            // handle even length palindromes
            left = i
            right = i + 1

            while (left >= 0 && right < inputStr.length && inputStr[left] == inputStr[right]) {
                left--
                right++
            }
            var evenPalindrome = inputStr.substring(left + 1, right)

            if (evenPalindrome.length >= longestPal.length) {
                longestPal = evenPalindrome.toString()
            }

        }
        return longestPal
    }
}

fun main() {
    var a = LongestPalindromeAns("racecar")
    println(a.findPalindrome())
}