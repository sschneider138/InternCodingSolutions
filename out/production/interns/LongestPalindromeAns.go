package main

import "fmt"

func findLongestPalindrome(palindrome string) string {
	var longestPalindrome string

	var i int
	var j int

	// odd length palindrome
	for i = 0; i < len(palindrome); i++ {
		var left int = i
		var right int = i

		for left >= 0 && right < len(palindrome) && palindrome[left] == palindrome[right] {
			left--
			right++
		}
		var oddPalindrome string = palindrome[left+1 : right]
		if len(oddPalindrome) >= len(longestPalindrome) {
			longestPalindrome = oddPalindrome
		}
	}

	// even length palindrome
	for j = 0; j < len(palindrome); j++ {
		var left int = j
		var right int = j + 1

		for left >= 0 && right < len(palindrome) && palindrome[left] == palindrome[right] {
			left--
			right++
		}

		var evenPalindrome string = palindrome[left+1 : right]
		if len(evenPalindrome) >= len(longestPalindrome) {
			longestPalindrome = evenPalindrome
		}
	}
	return longestPalindrome
}

func main() {
	var testStr string = "racecar"
	fmt.Println(findLongestPalindrome(testStr))
}
