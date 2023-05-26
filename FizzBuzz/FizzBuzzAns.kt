class FizzBuzzAns(val n: Int) {

    fun fizzBuzz() {
        for (num in 0..n) {
            if (num % 3 == 0 && num % 5 == 0) {
                println("FizzBuzz")
            } else if (num % 3 == 0) {
                println("Fizz")
            } else if (num % 5 == 0) {
                println("Buzz")
            } else {
                println(num)
            }
        }
    }
}

fun main() {
    FizzBuzzAns(15).fizzBuzz()
}
