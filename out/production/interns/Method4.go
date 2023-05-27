package main

import (
	"fmt"
)

type KSmallestNumsAns struct {
	integerList []int
	k           int
}

// method 4 - scan through list and update stored large values as list is
// traversed
func (structInstance *KSmallestNumsAns) method4() []int {
	var largestInts []int

	return largestInts
}

func main() {

	var intList []int
	intList = []int{20, 6, 13, 9, 15, 8, 4, 1, 11, 3}

	var k int = 3

	var testInstance KSmallestNumsAns = KSmallestNumsAns{
		integerList: intList,
		k:           k,
	}

	var outputList []int = testInstance.method4()
	fmt.Println(outputList)

}
