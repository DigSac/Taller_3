package Ejercicios

fun main() {
    var num: Int
    print("Ingrese un numero entero positivo: ")
    num = readln()!!.toInt()
    println("Los numeros perfectos que hay entre 1 y ${num} son: ")
    for (i in 1 .. num) {
        if (es_perfecto(i)) {
            println("$i")
        }
    }
}

fun es_perfecto(num: Int): Boolean {
    return suma_divisores_inferiores(num) == num
}