class Solution:
    def __init__(self, inputArr):
        self.inputArr = inputArr

    def method1(self):
        self.inputArr.sort()
        outArr = [self.inputArr[0]]

        for i in range(1, len(self.inputArr)):
            if self.inputArr[i] != self.inputArr[i-1]:
                outArr.append(self.inputArr[i])

        return outArr

    def method2(self):
        return list(set(self.inputArr))


a = [4, 3, 8, 3, 2, 2, 10, 3, 1, 0, 3, 4, 8, 1, 1, 0, 3, 6, 9, 8, 10]

test = Solution(a)
print(test.inputArr)
print(test.method1())
print(test.method2())
