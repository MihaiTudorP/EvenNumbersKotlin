fun main(args: Array<String>) {
    var number = 1
    var count = Math.rint(Math.random()*100).toInt()
    var evenNumbers = 0
    println("Total number count: $count")
    println("Starting with: $number")
    for (i in number..count){
        if (isEven(i)) {
            print("$i ")
            evenNumbers++
        }
    }
    println("\n===========================================")
    println("Total even numbers: $evenNumbers")
}

private fun isEven(i: Int) = i % 2 == 0