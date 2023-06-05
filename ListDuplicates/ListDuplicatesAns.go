package main

import (
	"fmt"
	"sort"
	"strings"
)

func ans(intArr1 []int) []int {
	sort.Slice(intArr1, func(i, j int) bool {
		return intArr1[i] < intArr1[j]
	})

	var outArr []int
	outArr = append(outArr, intArr1[0])

	var i int
	for i = 1; i < len(intArr1); i++ {
		if intArr1[i] != intArr1[i-1] {
			outArr = append(outArr, intArr1[i])
		}
	}
	return outArr
}

func main() {
	var testArr []int = []int{4, 3, 8, 3, 2, 2, 10, 3, 1, 0, 3, 4, 8, 1, 1, 0, 3, 6, 9, 8, 10}
	var sortedArr []int = ans(testArr)

	arrString := fmt.Sprintf("[%s]", strings.Trim(strings.Join(strings.Fields(fmt.Sprint(sortedArr)), ", "), "[]"))

	// Print the formatted string
	fmt.Println(arrString)
}
