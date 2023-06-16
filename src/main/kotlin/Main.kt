fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
    println()
    for (planet in solarSystem) {
        println(planet)
    }
    println()
    val newSolarSystem: MutableList<String> = mutableListOf()
    solarSystem.forEach {
        newSolarSystem.add(it)
    }
    newSolarSystem.add("Pluto")
    newSolarSystem.add(3, "Theia")

    newSolarSystem.forEach {
        println(it)
    }

    newSolarSystem.removeAt(8)
}