fun main() {

    print("Enter the value of n: ")
    val n = readln().toDouble()

    var sum = 0.0
    var i = 1.5

    while (i <= n) {
        sum += i
        i += 1.0
    }

    println("Sum = $sum")
}