fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    if (number > 0) {
        println("Positive Number")
    } else if (number < 0) {
        println("Negative Number")
    } else {
        println("Zero")
    }
}