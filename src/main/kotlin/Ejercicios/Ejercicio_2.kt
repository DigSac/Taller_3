package Ejercicios

fun main() {
    var ventas: Double
    print("Cual es el volumen de ventas del vendedor?")
    ventas = readln()!!.toDouble()
    // repetir
    while(ventas >= 0) {
        println("El valor de la comision es ${comision(ventas)}")
        print("Cual es el volumen de ventas del siguiente vendedor?")
        ventas = readln()!!.toDouble()
    }
}

fun comision(ventas: Double): Double =
    when {
        ventas < 50_000 -> 0.07 * ventas
        ventas <= 100_000  -> 0.09 * ventas + 5_000
        ventas <= 200_000 -> 0.11 * ventas + 10_000
        ventas <= 500_000 -> 0.13 * ventas + 20_000
        ventas > 500_000 -> 0.15 * ventas + 40_000
        else -> 0.0
    }