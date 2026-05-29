//1-2+3-4+5-6......n

fun main() {

    print("Enter the value of n: ")
    val n = readln().toInt()

    var sum = 0

    for (i in 1..n) {
        if (i % 2 == 0) {
            sum -= i
        } else {
            sum += i
        }
    }

    println("Sum of series = $sum")
}