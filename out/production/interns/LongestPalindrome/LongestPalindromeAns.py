# link - https://leetcode.com/problems/longest-palindrome/

# modification - letters will all

class Solution:
    # constructor
    def __init__(self, inputStr):
        self.inputStr = inputStr

        # input type checking
        if type(self.inputStr) == str:
            inputStr.lower()
        else:
            raise TypeError("input a string")

    # solution method/function
    def findPalindrome(self):
        # placeholder for longest string. will be updated as algorithm progresses
        longestPal = ""

        # for every char in the string...
        for i in range(len(self.inputStr)):

            # odd length palindromes - set both pointers equal to the pivot char
            left = i
            right = i

            # expand outwards while these point to same char
            while left >= 0 and right < len(self.inputStr) and self.inputStr[left] == self.inputStr[right]:
                left -= 1
                right += 1

            # longest palindrome is string formed within the indices of these pointers from left pointer (inclusive) to right pointer (exclusive)
            # we do "left + 1" as the lower index bound because this value is INCLUDED in the substring
            # we do "right" as the upper index bound because this value is NOT INCLUDED in the substring
            oddPalindrome = self.inputStr[left + 1:right]

            # update palindrome if the one we found is longer than the current best option
            if len(oddPalindrome) > len(longestPal):
                longestPal = oddPalindrome

            # even length palindromes - set pointers to current chat and char to the right
            left = i
            right = i + 1

            # expand outwards while these point to same char
            while left >= 0 and right < len(self.inputStr) and self.inputStr[left] == self.inputStr[right]:
                left -= 1
                right += 1

            # longest palindrome is string formed within the indices of these pointers from left pointer (inclusive) to right pointer (exclusive)
            # we do "left + 1" as the lower index bound because this value is INCLUDED in the substring
            # we do "right" as the upper index bound because this value is NOT INCLUDED in the substring
            evenPalindrome = self.inputStr[left + 1:right]

            # update palindrome if the one we found is longer than the current best option
            if len(evenPalindrome) > len(longestPal):
                longestPal = evenPalindrome

        # return longest palindromic substring
        return longestPal


a = Solution('racecar').findPalindrome()
print(a)
