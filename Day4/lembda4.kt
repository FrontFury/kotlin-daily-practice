//Even

fun main() {
    val isEven: (Int) -> Boolean = { num -> num % 2 == 0 }

    println(isEven(8))
    println(isEven(7))
}