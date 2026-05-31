fun main() {
    val input = readLine()

    if (input == null || input.isEmpty()) {
        println("Wrong Input")
        return
    }

    // check every character is digit or not
    for (ch in input) {
        if (ch !in '0'..'9') {
            println("Wrong Input")
            return
        }
    }

    val n = input.toInt()
    var temp = n
    var rev = 0

    while (temp != 0) {
        val digit = temp % 10
        rev = rev * 10 + digit
        temp /= 10
    }

    if (rev == n)
        println("Palindrome")
    else
        println("Not Palindrome")
}