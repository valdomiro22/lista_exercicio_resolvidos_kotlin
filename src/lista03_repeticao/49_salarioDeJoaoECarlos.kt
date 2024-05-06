package lista03_repeticao

fun main() {
    print("Digite o salario de carlos: ")
    var salarioCarlos = readln().toDouble()

    var salarioJoao = salarioCarlos / 3

    var qtMeses = 0
    while (salarioJoao < salarioCarlos) {
        salarioJoao *= 0.02
        salarioCarlos *= 0.05
        qtMeses++
    }

    println(qtMeses)
}