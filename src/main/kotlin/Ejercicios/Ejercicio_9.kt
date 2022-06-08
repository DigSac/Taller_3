package Ejercicios

fun main() {
    var num: Int
    print("Ingrese un numero entero positivo:")
    num = readln()!!.toInt()
    for(i in 1 ..num){
        println("Factorial de $i es ${factorial(i)}")
    }
}

fun factorial(num: Int): Int {
    var facto: Int = 1
    for (i in 1 .. num){
        facto *= i
    }
    return facto
}
