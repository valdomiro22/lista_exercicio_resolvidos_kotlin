package lista02_condicionais

import kotlin.math.cbrt

fun main() {
    println("Escolha uma opção: ")
    println("[1] - Média Geometrica")
    println("[2] - Média Ponderada")
    println("[3] - Média Harmonica")
    println("[4] - Média Aritmetica")
    print("Opção: ")
    val opcao = readln().toInt()

    if ( opcao < 1 || opcao > 4) {
        println("Opção inválida")
    } else {
        print("Digite o valor de X: ")
        val vlx = readln().toDouble()
        print("Digite o valor de Y: ")
        val vlY = readln().toDouble()
        print("Digite o valor de Z: ")
        val vlZ = readln().toDouble()

        val media: Double
        when (opcao) {
            1 -> {
                media = cbrt(vlx * vlY * vlZ)
                println("Média Geometrica: $media")
            }
            2 -> {
                media = (vlx + (2 * vlY) + 3 * vlZ) / 6
                println("Média Geometrica: $media")
            }
            3 -> {
                media = 1 / ((1/vlx) + (1/vlY) + (1/vlZ))
                println("Média Geometrica: $media")
            }
            else -> {
                media = (vlx + vlY + vlZ) / 3
                println("Média Geometrica: $media")
            }
        }
    }
}