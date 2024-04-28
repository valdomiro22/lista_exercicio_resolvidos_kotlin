package lista02_condicionais

import kotlin.random.Random

fun main() {
    var qtAcertos = 0

    var vl1 = Random.nextInt(100)
    var vl2 = Random.nextInt(100)
    var resultado = vl2 + vl1
    print("Quanto é $vl1 + $vl2 = ")
    var resposta = readln().toInt()
    println("$vl1 + $vl2 = $resultado --> Sua resposta: $resposta")
    if (resposta == resultado) {
        qtAcertos++
    }

    vl1 = Random.nextInt(100)
    vl2 = Random.nextInt(100)
    resultado = vl2 + vl1
    print("Quanto é $vl1 + $vl2 = ")
    resposta = readln().toInt()
    println("$vl1 + $vl2 = $resultado --> Sua resposta: $resposta")
    if (resposta == resultado) {
        qtAcertos++
    }

    vl1 = Random.nextInt(100)
    vl2 = Random.nextInt(100)
    resultado = vl2 + vl1
    print("Quanto é $vl1 + $vl2 = ")
    resposta = readln().toInt()
    println("$vl1 + $vl2 = $resultado --> Sua resposta: $resposta")
    if (resposta == resultado) {
        qtAcertos++
    }

    vl1 = Random.nextInt(100)
    vl2 = Random.nextInt(100)
    resultado = vl2 + vl1
    print("Quanto é $vl1 + $vl2 = ")
    resposta = readln().toInt()
    println("$vl1 + $vl2 = $resultado --> Sua resposta: $resposta")
    if (resposta == resultado) {
        qtAcertos++
    }

    vl1 = Random.nextInt(100)
    vl2 = Random.nextInt(100)
    resultado = vl2 + vl1
    print("Quanto é $vl1 + $vl2 = ")
    resposta = readln().toInt()
    println("$vl1 + $vl2 = $resultado --> Sua resposta: $resposta")
    if (resposta == resultado) {
        qtAcertos++
    }

    println("Quantidade de acertos: $qtAcertos")

}