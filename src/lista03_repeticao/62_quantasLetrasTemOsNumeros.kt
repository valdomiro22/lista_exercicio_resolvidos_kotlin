package lista03_repeticao

fun main() {

    var totalLetras = 0
    for (i in 1..1000) totalLetras += contarLetras(i)
    println(totalLetras)
}

fun contarLetras(numero: Int): Int {
    val unidades = listOf("", "um", "dois",
        "tres", "quatro", "cinco",
        "seis", "sete", "oito",
        "nove", "dez", "onze",
        "doze", "treze", "quatorze",
        "quinze", "dezesseis", "dezessete",
        "dezoito", "dezenove")
    val dezenas = listOf("", "", "vinte",
        "trinta", "quarenta", "cinquenta",
        "sessenta", "setenta", "oitenta", "noventa")
    val centenas =listOf("", "cem", "duzentos",
        "trezentos", "quatrocentos", "quinhentos",
        "seiscentos", "setecentos", "oitocentos", "novecentos")

    if (numero == 1000) {
        return "mil".length
    }

    var letras = 0

    if (numero >= 100) {
        letras += centenas[numero / 100].length
        if (numero % 100 != 0) letras += "e".length
    }

    if (numero % 100 >= 20) {
        letras += dezenas[(numero % 100) / 10].length
        if (numero % 10 != 0) letras += unidades[numero % 10].length
    } else if (numero % 100 >= 10) {
        letras += unidades[numero % 100].length
    } else if (numero % 100 > 0) {
        letras += unidades[numero % 20].length
    }

    return letras
}