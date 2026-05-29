fun main() {

    print("Enter the value of n: ")
    val n = readln().toInt()

    var fact = 1

    for (i in 1..n) {
        fact *= i
    }

    println("Factorial of $n = $fact")
}