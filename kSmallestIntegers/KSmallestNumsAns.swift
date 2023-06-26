class Solution {
    var inputArr: [Int]
    let n: Int

    init(inputArr: [Int], n: Int) {
        self.inputArr = inputArr
        self.n = n
    }

    func method1() -> [Int] {
        var largestInts = [Int]()
        var counter: Int = 0

        while counter != self.n {
            if let maxElement = self.inputArr.max() {
                if let maxElementIndex = self.inputArr.firstIndex(of: maxElement) {
                    largestInts.append(maxElement)
                    self.inputArr.remove(at: maxElementIndex)
                }
            }
            counter+=1
        }
        return largestInts
    }

    func method2() {
        
    }
}

let testArr = [20, 6, 13, 9, 15, 8, 4, 1, 11, 3, 20]

let a: Solution = Solution(inputArr: testArr, n:3)
let result = a.method1()

