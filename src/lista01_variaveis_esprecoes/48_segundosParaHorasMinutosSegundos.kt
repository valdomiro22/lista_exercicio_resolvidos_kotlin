package lista01_variaveis_esprecoes

fun main() {
    print("Quantidade de segundos: ")
    var qtSegundos = readln().toInt()

    val horas = qtSegundos / 3600
    qtSegundos -= horas * 3600
    val minutos = qtSegundos / 60
    qtSegundos -= minutos * 60


    println()
    println("Horas: $horas")
    println("Minutos: $minutos")
    println("Segundos: $qtSegundos")
}