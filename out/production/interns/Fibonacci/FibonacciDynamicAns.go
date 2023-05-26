package main

import (
	"fmt"
)

type FibStruct struct {
	num int
}

func (fibStructInstance *FibStruct) dynamicSol() int {
	var storageList = make([]int, fibStructInstance.num+1)

	storageList[0] = 0
	storageList[1] = 1
	storageList[2] = 1

	var i int
	for i = 3; i < len(storageList); i++ {
		storageList[i] = storageList[i-1] + storageList[i-2]
	}
	return storageList[len(storageList)-1]
}

func main() {
	var testInstance FibStruct = FibStruct{50}
	var output = testInstance.dynamicSol()
	fmt.Println(output)
}
