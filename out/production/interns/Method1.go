package main

import (
	"fmt"
	)

type KSmallestNumsAns struct {
	integerList []int
	k           int
}

// method 1 - iterate over list k times, add largest to temp list and remove from original
func (structInstance *KSmallestNumsAns) method1() []int {
	var largestInts []int

	var counter int = 0
	for counter < structInstance.k {
		var maxNum int = findMax(structInstance.integerList)
		largestInts = append(largestInts, maxNum)
		structInstance.integerList = remove(structInstance.integerList, maxNum)
		counter++
	}
	return largestInts
}

func findMax(arr []int) int {
	var max int = arr[0]

	var i int
	for i = 0; i < len(arr); i++ {
		if arr[i] > max {
			max = arr[i]
		}
	}
	return max
}

func remove(arr []int, num int) []int {
	for i, val := range arr {
		if val == num {
			arr = append(arr[:i], arr[i+1:]...)
			break
		}
	}
	return arr
}


func main() {

	var intList []int
	intList = []int{20, 6, 13, 9, 15, 8, 4, 1, 11, 3}

	var k int = 3

	var testInstance KSmallestNumsAns = KSmallestNumsAns{
		integerList: intList,
		k: k,
	}

	var outputList []int = testInstance.method1()
	fmt.Println(outputList)


}