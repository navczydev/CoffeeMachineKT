import java.util.*

fun main() {
    println("Starting to make a coffee")
    println("Grinding coffee beans")
    println("Boiling water")
    println("Mixing boiled water with crushed coffee beans")
    println("Pouring coffee into the cup")
    println("Pouring some milk into the cup")
    println("Coffee is ready!")
    val scanner = Scanner(System.`in`)
    // put your code here
    val num1 = scanner.next()
    println(num1)
    val num2 = scanner.next()
    println(num2)
    val num3 = scanner.next()
    println(num3)
    val num4 = scanner.next()
    println(num4)
    read5words()
    flightTripCalculate()
}

fun read5words() {
    val scanner = Scanner(System.`in`)
    //var word = ""
    //for (i in 1..5){
    val word1 = scanner.nextLine()
    val word2 = scanner.nextLine()
    println(word1)
    println(word2)
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    println(num1)
    println(num2)
    // }
}

fun flightTripCalculate(){
    val scanner = Scanner(System.`in`)
    val days = scanner.next().toInt()
    val flighCost = scanner.next().toInt()
    val foodCostPerDay = scanner.next().toInt()
    val oneNightCost = scanner.next().toInt()
    println(((days * foodCostPerDay) + ((days -1) * oneNightCost)) + (flighCost * 2))
}
