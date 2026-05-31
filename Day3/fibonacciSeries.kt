fun main() {
    val n = readLine()!!.toInt()

    var a = 0
    var b = 1

    for (i in 0 until n) {
        print(a)

        if (i != n - 1) {
            print(", ")
        }

        val next = a + b
        a = b
        b = next
    }

    println()
}