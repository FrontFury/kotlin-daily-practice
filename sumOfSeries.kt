// 1 + 2 + 3 + .... + n sum of the Series
fun main() {

    print("Enter the value of n: ")
    val n = readln().toInt()

    var sum = 0

    for (i in 1..n) {
        sum += i
    }

    println("Sum = $sum")
}