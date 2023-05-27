package main

import (
	"container/heap"
	"fmt"
)

type KSmallestNumsAns struct {
	integerList []int
	k           int
}

type MaxHeap []int

func (heap MaxHeap) Len() int           { return len(heap) }
func (heap MaxHeap) Less(i, j int) bool { return heap[i] > heap[j] } // Greater than for max heap
func (heap MaxHeap) Swap(i, j int)      { heap[i], heap[j] = heap[j], heap[i] }

// Push an element to the heap.
func (heap *MaxHeap) Push(x interface{}) {
	*heap = append(*heap, x.(int))
}

// Pop the maximum element from the heap.
func (heap *MaxHeap) Pop() interface{} {
	old := *heap
	n := len(old)
	x := old[n-1]
	*heap = old[0 : n-1]
	return x
}

// method 3 - pop from top of max heap k times
func (structInstance *KSmallestNumsAns) method3() []int {
	var largestInts []int
	var maxHeap MaxHeap

	// add elements to max heap
	var i int
	for i = 0; i < len(structInstance.integerList); i++ {
		heap.Push(&maxHeap, structInstance.integerList[i])
	}

	var j int
	for j = 0; j < structInstance.k; j++ {
		var storage int
		storage = heap.Pop(&maxHeap).(int)
		largestInts = append(largestInts, storage)
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

	var outputList []int = testInstance.method3()
	fmt.Println(outputList)

}
