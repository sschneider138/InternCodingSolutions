# import heap module
import heapq

# print k smallest numbers from the list of unsorted unique integers


class Solution:

    def __init__(self, inputList, k):
        self.inputList = inputList
        self.k = k

    # first way - iterate over list k times, add largest int to list, and return list
    # time complexity - O(nk) =~ O(n^2)
    def method1(self):
        largestInts = []
        counter = 0
        while counter != self.k:
            largestInts.append(max(self.inputList))
            # remove after finding largest in list
            self.inputList.remove(max(self.inputList))
            counter += 1
        return largestInts

    # second way - sort list and pop from end k times

    def method2(self):
        largestInts = []
        self.inputList.sort()
        for i in range(0, self.k):
            largestInts.append(self.inputList.pop())
            i += 1
        return largestInts

    # third way - make max heap dat structure and pop head k times
    def method3(self):
        largestInts = []
        negativeNums = [-num for num in self.inputList]

        heapq.heapify(negativeNums)
        for i in range(0, self.k):
            largestInts.append(-heapq.heappop(negativeNums))
        return largestInts

    # fourth way - scan through list and update stored large values as list is traversed

    def method4(self):
        largestInts = [0] * self.k
        for num in self.inputList:
            if num > min(largestInts):
                largestInts[largestInts.index(min(largestInts))] = num
        return largestInts


testLst = [20, 6, 13, 9, 15, 8, 4, 1, 11, 3, 20]
a = Solution(testLst, 3)
print(a.method1())
print(a.method2())
print(a.method3())
print(a.method4())
