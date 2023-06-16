class Cookie(
    val name: String,
    val softBakes: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

fun main() {

    val cookies = listOf(
        Cookie("Chocolate Chip", false, false, 1.69),
        Cookie("Banana Walnut", true, false, 1.49),
        Cookie("Vanilla Creme", false, true, 1.59),
        Cookie("Chocolate Peanut Butter", false, true, 1.49),
        Cookie("Snickerdoodle", true, false, 1.39),
        Cookie("Blueberry Tart", true, true, 1.79),
        Cookie("Sugar and Sprinkles", false, false, 1.39)
    )

    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    fullMenu.forEach{
        println(it)
    }

}