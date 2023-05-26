# prompt - https://leetcode.com/problems/merge-two-sorted-lists/

# obj - merge two sorted lists into one sorted list

class Solution:
    # constructor
    def __init__(self, arr1, arr2) -> None:
        self.arr1 = arr1
        self.arr2 = arr2

    # merge method -- simple
    def merge(self):
        # instantiate empty arr to hold sorted values
        mergedArr = []

        # series of pointers
        ptrArr1 = 0
        ptrArr2 = 0

        # set infinite loop
        while True:
            # if pointer 1 out of bounds, add the rest of arr2 and break out
            if ptrArr1 == len(self.arr1):
                for i in range(ptrArr2, len(self.arr2)):
                    mergedArr.append(self.arr2[i])
                break

            # if pointer 2 out of bounds, add the rest of arr1 and break out
            elif ptrArr2 == len(self.arr2):
                for i in range(ptrArr1, len(self.arr1)):
                    mergedArr.append(self.arr1[i])
                break

            # if both pointers in bounds, compare values, add min of these two to mergedArr, and incrememnt as needed
            if self.arr1[ptrArr1] <= self.arr2[ptrArr2]:
                mergedArr.append(self.arr1[ptrArr1])
                ptrArr1 += 1
            elif self.arr1[ptrArr1] > self.arr2[ptrArr2]:
                mergedArr.append(self.arr2[ptrArr2])
                ptrArr2 += 1

            # probably not needed, but does not hurt :-)
            else:
                break
        # return sorted array
        return mergedArr


b = [1, 4, 6]
c = [2, 5, 12, 54]
a = Solution(b, c).merge()
print(a)
