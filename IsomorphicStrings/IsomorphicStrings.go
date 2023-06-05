package main

func isoStr(str1 string, str2 string) bool {
	if len(str1) != len(str2) {
		return false
	}

	charMap := make(map[rune]rune)
	mappedChars := make(map[rune]bool)

	for i, char := range str1 {
		mappedChar, exists := charMap[char]
		if exists {
			if mappedChar != rune(str2[i]) {
				return false
			}
		} else {
			if mappedChars[rune(str2[i])] {
				return false
			}
			charMap[char] = rune(str2[i])
			mappedChars[rune(str2[i])] = true
		}

	}
	return true
}

func main() {
	var a bool = isoStr("egg", "add")
	println(a)
}
