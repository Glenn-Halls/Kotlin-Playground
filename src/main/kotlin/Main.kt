class Event (
    title: String,
    description: String? = null,
    daypart: String,
    duration: Int
){}

fun main() {
    val test = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", "Evening", 15)
    println(test)
}