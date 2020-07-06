fun main(args: Array<String>) {
    println(fizzBuzz())
}

fun twoPlusTwo(a: Int, b: Int): Int {
    return a.plus(b)
}

fun fizzBuzz() {
    for (i in 1..100) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("fizz-buzz")
            i % 3 == 0 -> println("fizz")
            i % 5 == 0 -> println("buzz")
            else -> println(i.toString())
        }
    }
}