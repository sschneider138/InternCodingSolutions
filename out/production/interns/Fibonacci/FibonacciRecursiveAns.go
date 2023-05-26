package main

import (
	"fmt"
)

type FibStruct struct {
	num int
}

func (fibStructInstance *FibStruct) startFibRecursion() int {
	return fibRecursive(fibStructInstance.num)
}

func fibRecursive(n int) int {

	if n == 0 {
		return 0
	} else if n == 1 || n == 2 {
		return 1
	}
	return fibRecursive(n-1) + fibRecursive(n-2)
}

func main() {
	var testInstance FibStruct = FibStruct{50}
	var output = testInstance.startFibRecursion()
	fmt.Println(output)
}
