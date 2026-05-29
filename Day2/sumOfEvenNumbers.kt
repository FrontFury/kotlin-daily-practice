// 2 + 4 + 6 + .... + n sum of the even number

fun main() {

    print("Enter the value of n: ")
    val n = readln().toInt()

    var sum = 0

    for (i in 2..n step 2) {
        sum += i
    }

    println("Sum of even numbers = $sum")
}