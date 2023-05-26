package main

import (
	"fmt"
)

func findLongestUniqueChar(str string) string {

	// build points table full of zeros
	var pointsTable [][]int = make([][]int, len(str))

	for i := 0; i < len(str); i++ {
		pointsTable[i] = make([]int, len(str))
	}

	var usedChars map[rune]bool
	usedChars = make(map[rune]bool)

	var i int = 0
	var pointsCount int = 0
	var maxRowIndex int = 0

	for i < len(str) {
		var j int
		for j = i; j < len(str); j++ {
			if _, ok := usedChars[rune(str[j])]; !ok {
				usedChars[rune(str[j])] = true
				pointsTable[i][j] = 1
			} else {
				usedChars = make(map[rune]bool)
				break
			}
		}
		i++
	}

	for k, row := range pointsTable {
		var rowSum int = 0
		for _, val := range row {
			rowSum += val
		}
		if rowSum > pointsCount {
			pointsCount = rowSum
			maxRowIndex = k
		}
	}
	var k int
	var returnString string

	for k = 0; k < len(str); k++ {
		if pointsTable[maxRowIndex][k] == 1 {
			returnString += string(str[k])
		}
	}

	return returnString
}

func main() {
	var output string = findLongestUniqueChar("test string")
	fmt.Println(output)
}
