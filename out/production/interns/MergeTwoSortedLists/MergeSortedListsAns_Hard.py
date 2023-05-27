# import package for heaps
import heapq

# prompt - https://leetcode.com/problems/merge-two-sorted-lists/

# obj - merge two sorted lists into one sorted list

class Solution:
    # constructor
    def __init__(self, arr1, arr2) -> None:
        self.arr1 = arr1
        self.arr2 = arr2

    def mergeWithMinHeap(self):
        # heapify arrays
        heapq.heapify(self.arr1)
        heapq.heapify(self.arr2)
        
        # empty arrays to store sorted values
        mergedArr = []

        # while either heap exists...
        while self.arr1 or self.arr2:
            # if they both exist...
            if self.arr1 and self.arr2:
                # compare the values and add the min of both heap tops. heap data structure pops (removes) top
                # and heapifys (this means reorganizes) so we have the new min on top for future comparisons
                if self.arr1[0] < self.arr2[0]:
                    mergedArr.append(heapq.heappop(self.arr1))
                else:
                    mergedArr.append(heapq.heappop(self.arr2))
            # if only first heap, add all elements of second
            elif self.arr1:
                mergedArr.append(heapq.heappop(self.arr1))
            # if only second heap, add all elements of first
            elif self.arr2:
                mergedArr.append(heapq.heappop(self.arr2))
        # return sorted array
        return mergedArr
    
b = [1, 4, 6]
c = [2, 5, 12, 54]
a = Solution(b, c).mergeWithMinHeap()
print(a)