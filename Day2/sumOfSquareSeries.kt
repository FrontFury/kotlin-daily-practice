//1^2 + 2^2 +....+ n^2

fun main() {

    print("Enter the value of n: ")
    val n = readln().toInt()

    var sum = 0

    for (i in 1..n) {
        sum += i * i
    }

    println("Sum of squares = $sum")
}