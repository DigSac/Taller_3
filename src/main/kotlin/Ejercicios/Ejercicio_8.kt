package Ejercicios

fun main() {
    var num: Int
    print("Ingrese un numero entero positivo: ")
    num = readln()!!.toInt()
    println("Los numeros primos entre 2 y ${num} son: ")
    for (i in 2 .. num) {
        if (es_primo(i)) {
            println("$i")
        }
    }
}

fun es_primo(num: Int): Boolean {
    return divisores(num) == 2
}
