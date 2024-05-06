package lista03_repeticao

fun main() {
    print("Digite o valor do saque: ")
    var saque = readln().toInt()

    //    var saque = 401

    // https://www.youtube.com/watch?v=mQ3b4ogAuNI
    val cem: Int = saque / 100
    saque -= cem * 100
    println("Número de cédulas de R$ 100: $cem")

    val cinquenta: Int = saque / 50
    saque -= cinquenta * 50
    println("Número de cédulas de R$ 50: $cinquenta")

    val vinte: Int = saque / 20
    saque -= vinte * 20
    println("Número de cédulas de R$ 20: $vinte")

    val dez: Int = saque / 10
    saque -= dez * 10
    println("Número de cédulas de R$ 10: $dez")

    val cinco: Int = saque / 5
    saque -= cinco * 5
    println("Número de cédulas de R$ 5: $cinco")

    val dois: Int = saque / 2
    saque -= dois * 2
    println("Número de cédulas de R$ 2: $dois")

//    val um = saque / 1
//    saque -= saque * 1
    println("Número de cédulas de R$ 1: $saque ")
}