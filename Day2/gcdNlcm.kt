//GCD = Greatest Common Divisor
//LCM = Least Common Multiple

fun main() {

    print("Enter first number: ")
    val num1 = readln().toInt()

    print("Enter second number: ")
    val num2 = readln().toInt()

    var a = num1
    var b = num2

    // Find GCD
    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }

    val gcd = a

    // Find LCM
    val lcm = (num1 * num2) / gcd

    println("GCD = $gcd")
    println("LCM = $lcm")
}