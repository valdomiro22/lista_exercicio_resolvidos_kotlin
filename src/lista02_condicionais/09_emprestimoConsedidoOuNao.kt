package lista02_condicionais

fun main() {
    print("Informe o salario: ")
    val salario = readln().toDouble()
    print("Valor da prestação: ")
    val prestacao = readln().toDouble()

    val porcentagem = salario * 0.2

    if (prestacao > porcentagem) {
        println("Empréstimo não consedido")
    } else {
        println("Empréstimo consedido")
    }
}