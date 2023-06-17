class Event (
    title: String,
    description: String? = null,
    daypart: Daypart,
    duration: Int
){}

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

fun main() {
    val test = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", Daypart.EVENING, 15)
    println(test)
}