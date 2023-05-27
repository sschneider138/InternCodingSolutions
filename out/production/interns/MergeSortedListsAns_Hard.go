package main

import (
	"container/heap"
	"fmt"
)

type MinHeap []int

func (h MinHeap) Len() int {
	return len(h)
}

func (h MinHeap) Less(i, j int) bool {
	return h[i] < h[j]
}

func (h MinHeap) Swap(i, j int) {
	h[i], h[j] = h[j], h[i]
}

func (h *MinHeap) Push(x interface{}) {
	*h = append(*h, x.(int))
}

func (h *MinHeap) Pop() interface{} {
	old := *h
	n := len(old)
	x := old[n-1]
	*h = old[:n-1]
	return x
}

type MergeSortedArrsAns struct {
	intArr1 []int
	intArr2 []int
}

func (structInstance *MergeSortedArrsAns) mergeArrsHard() []int {
	var mergedArr []int = make([]int, len(structInstance.intArr1)+len(structInstance.intArr2))
	var mergeHeap MinHeap

	//just realized that you don't need two heaps like I used in java and python
	//you can just add all elements to a single heap... way easier

	//no need to make a new arr holding elements from both input arrs, just use two loops
	//same time complexity but two loops uses less memory becuase no extra arr is created

	//add elements from intArr1 to heap
	for _, val := range structInstance.intArr1 {
		mergeHeap = append(mergeHeap, val)
	}

	//add elements from intArr2 to heap
	for _, val := range structInstance.intArr2 {
		mergeHeap = append(mergeHeap, val)
	}

	var i int
	for i = 0; i < len(mergedArr); i++ {
		var storage int
		storage = heap.Pop(&mergeHeap).(int)
		mergedArr[i] = storage
	}
	return mergedArr
}

func main() {
	var arr1 []int = []int{1, 4, 6}
	var arr2 []int = []int{2, 5, 12, 54}
	var testInstance MergeSortedArrsAns = MergeSortedArrsAns{arr1, arr2}

	var outputArr []int = testInstance.mergeArrsHard()
	fmt.Println(outputArr)
}
