// Training: Lambda Functions: Trick or Treat

fun main() {

    val coins: (Int) -> String = { "$it quarters" }
    val cupcake: (Int) -> String = { "Have a cupcake!" }


    println(testOutput())
    val treatFunction = trickOrTreat(false, coins)
    var trickFunction = trickOrTreat(true, cupcake)

    treatFunction()
    trickFunction()

    trickOrTreat(false, { "$it quarters" })()
    trickOrTreat(false) { "$it quarters" }()
    trickFunction = trickOrTreat(true, null)
    trickFunction()
}

fun testOutput(): String {
    return "output"
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

 val trick = {
     println("No treats!")
 }

val treat: () -> Unit = {
    println("Have a treat!")
}
