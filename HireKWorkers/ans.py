class Solution:
    def __init__(self, inputArr, target):
        self.inputArr = inputArr
        self.target = target
        self.firstIndex = 0
        self.lastIndex = len(self.inputArr) - 1

    def ans(self):
        while True:
            if len(self.inputArr) == 0:
                self.firstIndex, self.lastIndex = -1, -1
                break
            if self.inputArr[self.firstIndex] != self.target:
                self.firstIndex += 1

            if self.inputArr[self.lastIndex] != self.target:
                self.lastIndex -= 1

            if self.firstIndex <= self.lastIndex:
                self.firstIndex, self.lastIndex = -1, -1

        return [self.firstIndex, self.lastIndex]


nums = []
a = Solution(nums, 6)
print(a.ans())
