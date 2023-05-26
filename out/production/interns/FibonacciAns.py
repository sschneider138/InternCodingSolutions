# problem link - https://leetcode.com/problems/fibonacci-number/

# define method that can calculate fibonacci series up to a given int

class Solution:
    def __init__(self, num):
        self.num = num

    def fibRecursion(self, fibNum):
        if fibNum < 2:
            return fibNum
        return self.fibRecursion(fibNum - 1) + self.fibRecursion(fibNum - 2)

    def fibStart(self):
        return self.fibRecursion(self.num)


class Solution2:
    def __init__(self, num):
        self.num = num
        self.dpTable = [None] * (self.num + 1)
        self.dpTable[0] = 0
        self.dpTable[1] = 1

    def fibDynamic(self):
        for i in range(0, self.num+1):
            if self.dpTable[i] == None:
                self.dpTable[i] = self.dpTable[i-1] + self.dpTable[i-2]
            i += 1
        return self.dpTable[-1]


# a = Solution2(300).fibDynamic()
# print(b)


a = Solution(40).fibStart()
print(a)
