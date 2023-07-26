fun main(args: Array<String>) {
    var number = 1
    var count = Math.rint(Math.random()*100).toInt()
    var evenNumbers = 0
    println("Total number count: $count")
    println("Starting with: $number")
    for (i in number..count){
        if (i % 2 == 0) {
            print("$i ")
            evenNumbers++
        }
    }
    println("\n===========================================")
    println("Total even numbers: $evenNumbers")
}