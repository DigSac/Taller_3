package Ejercicios

fun main() {
    var num: Int
    print("Ingrese un numero entero positivo: ")
    num = readln()!!.toInt()
    println("La suma de los divisores inferiores de $num es ${suma_divisores_inferiores(num)}")
}

fun suma_divisores_inferiores(num: Int): Int {
    var suma = 0
    repeat(num - 1) {
        if (num % (it + 1) == 0) {
            suma += it + 1
        }
    }
    return suma
}