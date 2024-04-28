package lista02_condicionais

fun main() {
    print("Digite o peso: ")
    val peso = readln().toFloat()
    print("Digite a altura: ")
    val altura = readln().toFloat()

    val imc = peso / (altura * altura)

    if (imc < 18.5) {
        println("Abaixo do Peso")
    } else if (imc < 25) {
        println("Saudavel")
    } else if (imc < 30) {
        println("Peso em excesso")
    } else if (imc < 35) {
        println("Obesidade Grau I")
    } else if (imc < 40) {
        println("Obesidade Grau II(severa)")
    } else {
        println("Obesidade Grau III(morbida)")
    }
}