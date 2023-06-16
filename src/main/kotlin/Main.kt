fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
    println()

    val newSolarSystem: MutableSet<String> = mutableSetOf()
    solarSystem.forEach {
        newSolarSystem.add(it)
        println(it)
    }

    newSolarSystem.add("Pluto")
    println()

    newSolarSystem.forEach {
        println(it)
    }
}