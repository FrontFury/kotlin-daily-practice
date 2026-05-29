// 1 + 3 + 5 + .... + n sum of the Odd Numbers

fun main() {

    print("Enter the value of n: ")
    val n = readln().toInt()

    var sum = 0

    for (i in 1..n step 2) {
        sum += i
    }

    println("Sum of odd numbers = $sum")
}