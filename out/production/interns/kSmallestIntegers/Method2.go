package main

import (
	"fmt"
	"sort"
)

type KSmallestNumsAns struct {
	integerList []int
	k           int
}

// method 2 - sort list and pop k final elements
func (structInstance *KSmallestNumsAns) method2() []int {
	var largestInts []int
	sort.Ints(structInstance.integerList)

	var i int
	for i = 0; i < structInstance.k; i++ {
		var poppedNum int = structInstance.integerList[len(structInstance.integerList)-1]
		structInstance.integerList = structInstance.integerList[:len(structInstance.integerList)-1]
		largestInts = append(largestInts, poppedNum)
	}
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

	var outputList []int = testInstance.method2()
	fmt.Println(outputList)

}
