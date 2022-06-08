package Ejercicios

fun main() {
    var precio: Double
    print("Cual es el precio del libro?")
    precio = readln()!!.toDouble()
    // repetir
    while(precio > 0) {
        println("El precio neto del libro es ${precio_neto(precio)}")
        print("Cual es el precio del siguiente libro?")
        precio = readln()!!.toDouble()
    }
}

fun precio_neto (precio_libro: Double): Double =
    when{
        precio_libro < 100_000 -> precio_libro * (1 - 0.12)
        else -> precio_libro * (1 - 0.18)
    }