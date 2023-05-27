package main

import (
	"fmt"
)

type MergeSortedListsAns struct {
	intArr1 []int
	intArr2 []int
}

func (structInstance *MergeSortedListsAns) mergeArrsEasy() []int {
	var mergedArr []int = make([]int, len(structInstance.intArr1)+len(structInstance.intArr2))

	var ptr1 int = 0
	var ptr2 int = 0

	var i int

	for i = 0; i < len(mergedArr); i++ {
		if ptr1 < len(structInstance.intArr1) && ptr2 < len(structInstance.intArr2) {
			if structInstance.intArr1[ptr1] <= structInstance.intArr2[ptr2] {
				mergedArr[i] = structInstance.intArr1[ptr1]
				ptr1++

			} else {
				mergedArr[i] = structInstance.intArr2[ptr2]
				ptr2++
			}
		} else if ptr1 < len(structInstance.intArr1) {
			mergedArr[i] = structInstance.intArr1[ptr1]
			ptr1++
		} else if ptr2 < len(structInstance.intArr2) {
			mergedArr[i] = structInstance.intArr2[ptr2]
			ptr2++
		} else {
			break
		}
	}
	return mergedArr
}

func main() {

	var lst1 []int = []int{1, 4, 6}
	var lst2 []int = []int{2, 5, 12, 54}

	var testInstance MergeSortedListsAns = MergeSortedListsAns{lst1, lst2}
	var outputList []int = testInstance.mergeArrsEasy()
	fmt.Println(outputList)
}
