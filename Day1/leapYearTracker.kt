fun main() {

    print("Enter a year: ")

    val input = readLine()

    if (input != null && input.toIntOrNull() != null) {

        val year = input.toInt()

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            println("$year is a Leap Year")
        } else {
            println("$year is not a Leap Year")
        }

    } else {
        println("Invalid Input")
    }
}