class LongestUniqueCharStringAns(private val inputStr: String) {

    fun answer(): String {
        val pointsTable = Array(inputStr.length) { IntArray(inputStr.length) }
        val usedChars = mutableSetOf<Char>()

        var i = 0
        var pointsCount = 0
        var maxRowIndex = 0

        while (i < inputStr.length) {
            var j = i
            while (j < inputStr.length) {
                if (inputStr[j] !in usedChars) {
                    usedChars.add(inputStr[j])
                    pointsTable[i][j] = 1
                    j++
                } else {
                    usedChars.clear()
                    i++
                    break
                }
            }
        }
        for (row in pointsTable) {
            if (row.sum() > pointsCount) {
                pointsCount = row.sum()
                maxRowIndex = pointsTable.indexOf(row)
            }
        }
        var k = 0
        val returnString = StringBuilder()
        while (k < inputStr.length) {
            if (pointsTable[maxRowIndex][k] == 1) {
                returnString.append(inputStr[k])
            }
            k++
        }


        return returnString.toString()
    }


}

fun main() {
    val a = LongestUniqueCharStringAns("pwwkew")
    val b = a.answer()
    println(b)
}