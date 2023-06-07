//Lambda functions and expressions

fun main() {
    val testLambda = helloRepeat
    testLambda(5)
}

val helloRepeat: (Int) -> Unit = { repeat(it) {println("hello ")} }