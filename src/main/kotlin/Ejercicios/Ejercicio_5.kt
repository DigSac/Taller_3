package Ejercicios

fun main() {
    var n: Int
    print("Hasta que numero desea la sumatoria?")
    n = readln()!!.toInt()
    var suma = 0
    var i = 1
    repeat(n) {
        suma += i
        println("Iteracion $it: $suma")
        i ++

    }
}