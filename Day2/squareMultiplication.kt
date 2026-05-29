fun main() {

    print("Enter the value of n: ")
    val n = readln().toInt()

    var result = 1

    for (i in 1..n) {
        result *= (i * i)
    }

    println("Product of squares = $result")
}