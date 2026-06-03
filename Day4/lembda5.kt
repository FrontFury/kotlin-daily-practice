//Odd

fun main() {
    val isOdd: (Int) -> Boolean = { num -> num % 2 != 0 }

    println(isOdd(9))
    println(isOdd(10))
}