class FibonacciAns(val n: Int) {

    fun recursiveFib(fibNum: Long): Long {
        if (fibNum < 2) {
            return fibNum
        }
        return recursiveFib(fibNum - 1) + recursiveFib(fibNum - 2)
    }

    fun startRecursiveFib(): Long {
        return recursiveFib(n.toLong())
    }

    fun dynamicFib(): Long {
        val storage = LongArray(n + 1) { -1 }
        storage[0] = 0
        storage[1] = 1
        for (i in 0..n) {
            if (storage[i] == -1L) {
                storage[i] = storage[i - 1] + storage[i - 2]
            }
        }
        return storage[storage.lastIndex]
    }
}

fun main() {
    val a = FibonacciAns(50)
    println(a.dynamicFib())
}
