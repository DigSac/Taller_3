package Ejercicios

fun main() {
    var salario: Double
    var ventas: Double
    var continuar: String
    // repetir
    do{
        print("Cual es el salario del empleado?")
        salario = readln()!!.toDouble()
        print("Cuanto fueron las ventas del empleado?")
        ventas = readln()!!.toDouble()
        var valor_comision = calculo_comision(ventas)
        println("La comision es $valor_comision y su salario neto es ${salario + valor_comision}")
        println("Desea continuar? Y / N")
        continuar = readln()!!.toString().uppercase()
    } while (continuar.equals("Y"))
}

fun calculo_comision (ventas: Double): Double =
    when{
        ventas > 50_000 -> 0.15 * (ventas - 50_000)
        else -> 0.0
    }