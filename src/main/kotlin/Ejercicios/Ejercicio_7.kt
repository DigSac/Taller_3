package Ejercicios

fun main() {
    var num: Int
    print("Ingrese un numero entero positivo: ")
    num = readln()!!.toInt()
    println("El numero $num tiene ${divisores(num)} divisores")
}

fun divisores(num: Int): Int {
    var count = 0
    repeat(num) {
        if (num % (it + 1) == 0) {
            count += 1
        }
    }
    return count
}