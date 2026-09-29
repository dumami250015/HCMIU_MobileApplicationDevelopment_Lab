fun main() {
    val school = listOf("mackerel", "trout", "halibut")
	println(school)
    
    val myList = mutableListOf("tuna", "salmon", "shark")
	myList.remove("shark")
    println(myList)
    
//     val mix = arrayOf("fish", 2)
//     println(mix)

	val numbers = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers
    println(foo2[5])
    
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)
    
    val array = Array (5) { it * 2 }
	println(java.util.Arrays.toString(array))
    
    for (element in school) {
        print(element + " ")
    }
    
    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }
    
    for (i in 1..5) print(i)
    println()

    for (i in 5 downTo 1) print(i)
    println()

    for (i in 3..6 step 2) print(i)
    println()

    for (i in 'd'..'g') print (i)
    println()

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
         println("A fish is swimming")
    }
}