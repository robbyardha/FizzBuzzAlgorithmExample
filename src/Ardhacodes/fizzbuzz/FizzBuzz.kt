package Ardhacodes.fizzbuzz

fun main() {
    println("Input Your range, MUST BE INTEGER!")
    val input = readLine()!!
    println("Your input is ${input}")

    if (input.matches(Regex("-?\\d+(\\.\\d+)?"))){
        for(i in 1..input.toInt()){
            if (i % 3 == 0 && i % 5 == 0){
                println("Fizz Buzz")
            }else if (i % 3 == 0){
                println("Fizz")
            }else if(i % 5 == 0){
                println("Buzz")
            }else{
                println(i)
            }
        }
    }else{
        println("Sorry Not Number or NULL")
    }

}