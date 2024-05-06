package lista03_repeticao

fun main() {

    var maiorConsumo = 0.0
    var menorConsumo = 0.0
    var somaConsumo = 0.0
    var totalResidencial = 0.0
    var totalComercial = 0.0
    var totalIndustrial = 0.0
    var consumoMes = 0.0
    var codigoConsumidor = 0

    print("Digite o numero de habitantes: ")
    val qtHabitantes = readln().toInt()
    print("Digite o valor do kwh: ")
    val vlKilowatHora = readln().toDouble()

    for (i in 1..qtHabitantes) {
        print("Digite o consumo do mes: ")
        consumoMes = readln().toDouble()
        println("Digite o codigo do consumidor: ")
        println("[1] - Residencial")
        println("[2] - Comercial")
        println("[3] - Industrial")
        print("Codigo: ")
        codigoConsumidor = readln().toInt()

        if (consumoMes > maiorConsumo) maiorConsumo = consumoMes
        if (consumoMes < menorConsumo || menorConsumo == 0.0) menorConsumo = consumoMes

        somaConsumo += consumoMes

        when (codigoConsumidor) {
            1 -> totalResidencial += consumoMes
            2 -> totalComercial += consumoMes
            3 -> totalIndustrial += consumoMes
            else -> {
                println("Consumo invalido")
                break
            }
        }
    }

    val mediaConsumo = somaConsumo / qtHabitantes

    println()
    println("Maior consumo: $maiorConsumo")
    println("Menor consumo: $menorConsumo")
    println("Media de consumo: $mediaConsumo")
    println("Total categoria residencial: $totalResidencial")
    println("Total categoria comercial: $totalComercial")
    println("Total categoria industrial: $totalIndustrial")
}