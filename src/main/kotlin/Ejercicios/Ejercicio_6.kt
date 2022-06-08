package Ejercicios

fun main() {
    print("Digite un numero entero positivo: ")
    var n = readln()!!.toInt()
    println("La tabla de multiplicar de $n es")
    repeat(10) {
        println("$n x ${it + 1} = ${n * (it + 1)}")
    }
}