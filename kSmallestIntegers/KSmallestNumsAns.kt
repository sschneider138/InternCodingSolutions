import java.util.PriorityQueue

class KSmallestNumsAns(val inputList: MutableList<Int>, val k: Int) {

    fun method1(): List<Int> {
        val largestInts = mutableListOf<Int>()
        var counter = 0

        while (counter != k) {
            largestInts.add(inputList.max())
            inputList.remove(inputList.max())
            counter++
        }
        return largestInts
    }

    fun method2(): List<Int> {
        val largestInts = mutableListOf<Int>()
        inputList.sort()
        for (num in 0..k - 1) {
            largestInts.add(inputList.removeAt(inputList.size - 1))
        }
        return largestInts
    }

    fun method3(): List<Int> {
        val largestInts = mutableListOf<Int>()
        val maxHeap = PriorityQueue<Int>(reverseOrder())

        for (num in inputList) {
            maxHeap.add(num)
        }

        for (pop in 0..k - 1) {
            largestInts.add(maxHeap.poll())
        }
        return largestInts
    }

    fun method4(): IntArray {
        var largestInts = IntArray(k)
        for (num in inputList) {
            if (num > largestInts.min()) {
                largestInts[largestInts.indexOf(largestInts.min())] = num
            }
        }
        return largestInts
    }
}

fun main() {
    val testNums = mutableListOf(20, 6, 13, 9, 15, 8, 4, 1, 11, 3, 20)
    val outputList = KSmallestNumsAns(testNums, 3).method4()

    println(outputList.joinToString())
}
