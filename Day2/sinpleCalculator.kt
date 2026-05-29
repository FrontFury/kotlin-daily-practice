fun main() {

    println("=== Simple Calculator ===")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")

    print("Choose an operation (1-4): ")
    val choice = readln().toInt()

    if(choice <= 0 || choice >=5){
        println("Invalid choice!")
    }
    else{
        print("Enter first number: ")
        val num1 = readln().toDouble()

        print("Enter second number: ")
        val num2 = readln().toDouble()

        when (choice) {

            1 -> {
                val result = num1 + num2
                println("Result = $result")
            }

            2 -> {
                val result = num1 - num2
                println("Result = $result")
            }

            3 -> {
                val result = num1 * num2
                println("Result = $result")
            }

            4 -> {
                if (num2 != 0.0) {
                    val result = num1 / num2
                    println("Result = $result")
                } else {
                    println("Cannot divide by zero!")
                }
            }

            else -> {
                println("Invalid choice!")
            }
        }
    }
}