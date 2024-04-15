package lista01_variaveis_esprecoes

fun main() {
    println("Horario de inicio")
    print("Hora: ")
    val horaInicio = readln().toInt()
    print("Minuto: ")
    val minutoInicio = readln().toInt()
    print("Segundo: ")
    val segundoInicio = readln().toInt()

    val horarioInicial = (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio
    println("Segundos de inicio: $horarioInicial")

    print("Duração da esperiencia em segundos: ")
    val duracao = readln().toInt()

    var totalSegundos = horarioInicial + duracao
    println("Totoal de segundos: $totalSegundos")

    // Horario de termino
    val horasTermino = totalSegundos / 3600
    totalSegundos -= horasTermino * 3600
    val minutosTermino = totalSegundos / 60
    totalSegundos -= minutosTermino * 60


    println("Horas termino: $horasTermino")
    println("Minutos termino: $minutosTermino")
    println("Segundos termino: $totalSegundos")
}