# dynamic programming to find longest string of unique integers

class Solution:
    def __init__(self, str):
        self.str = str

    def answer(self):
        # instantiate empty matrix. size is [len of string] x [len of string]
        pointsTable = [[0] * len(self.str) for row in range(len(self.str))]
        # instantiate set to track used chars in constant time lookup
        usedChars = set()
        # counters initialized at 0
        i = 0
        pointsCount = 0
        maxRowIndex = 0

        '''
        fill out table -- goal is to explore all possibilities. this is done by starting at the first char in string and
        continue adding until you run into a char in set of usedChars

        once this happens, redo the process starting at the second (i+1) char. continue this process starting at one later
        string each time

        table will track continuous chars. if char is ok to add to sequence, change from 0 to 1
        1 represents permissable char, 0 is impermissable char
        '''
        while i < len(self.str):
            j = i
            while j < len(self.str):
                if self.str[j] not in usedChars:
                    usedChars.add(self.str[j])
                    pointsTable[i][j] = 1
                    j += 1
                else:
                    usedChars.clear()
                    i += 1
                    break

        for i, row in enumerate(pointsTable):
            if sum(row) > pointsCount:
                pointsCount = sum(row)
                maxRowIndex = i

        k = 0
        returnStr = ""
        while k < len(self.str):
            if pointsTable[maxRowIndex][k] == 1:
                returnStr += self.str[k]
            k += 1

        return returnStr


testStr = 'pwwkew'
a = Solution(testStr).answer()
print(a)
