package Ejercicios

fun main() {
    var empleados: Int
    print("Ingrese el numero de empleados: ")
    empleados = readln()!!.toInt()
    repeat(empleados) {
        var horas: Double
        println("Ingrese el numero de horas trabajadas del empleado ${it + 1} durante la semana")
        horas = readln()!!.toDouble()
        println("El salario del empleado ${it + 1} es ${calculo_salario(horas)}")
    }
}

fun calculo_salario(horas: Double): Double =
    when {
        horas <= 35 -> 15_000 * horas
        horas < 60 -> 15_000 * 35 + 18_000 * (horas - 35)
        horas > 60 -> 15_000 * 35 + 18_000 * 25 + 25_000 *  (horas - 60)
        else -> 0.0
    }
