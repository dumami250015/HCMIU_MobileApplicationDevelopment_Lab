fun String.hasSpaces() = indexOf(" ") != -1

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

val plant = GreenLeafyPlant(size = 10)
plant.print()
println("\n")
val aquariumPlant: AquariumPlant = plant
aquariumPlant.print()  // what will it print?

val AquariumPlant.isGreen: Boolean
   get() = color == "green"
aquariumPlant.isGreen

fun AquariumPlant?.pull() {
   this?.apply {
       println("removing $this")
   }
}

val plant: AquariumPlant? = null
plant.pull()
