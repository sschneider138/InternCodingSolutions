package ListDuplicates

class ListDuplicatesAns(val inputArr: List<Int>) {

    fun removeDuplicates(): MutableList<Int> {
        // var outList = inputArr.sorted().distinct().toMutableList()

        var sortedInputArr = inputArr.sorted()
        var outList = mutableListOf<Int>()
        outList.add(sortedInputArr[0])

        for (i in 1 until sortedInputArr.size) {
            if (sortedInputArr[i - 1] != sortedInputArr[i]) {
                outList.add(sortedInputArr[i])
            }
        }
        return outList
    }
}

fun main() {
    val a = listOf(4, 3, 8, 3, 2, 2, 10, 3, 1, 0, 3, 4, 8, 1, 1, 0, 3, 6, 9, 8, 10)
    var test = ListDuplicatesAns(a)
    println(test.removeDuplicates())
}
