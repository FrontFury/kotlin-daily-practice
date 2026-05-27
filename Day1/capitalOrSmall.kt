fun main() {

    print("Enter a character: ")

    val input = readLine()

    if (input != null && input.length == 1) {

        val ch = input[0]

        if (ch in 'A'..'Z') {
            println("Capital Letter")
        } else if (ch in 'a'..'z') {
            println("Small Letter")
        } else {
            println("Invalid Input")
        }

    } else {
        println("Invalid Input")
    }
}