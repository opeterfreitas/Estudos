fun main() {
    val entrada: String? = "13/02/1982"

    val (dia, mes, ano) = entrada!!.split("/")

    val mesPorExtenso = when (mes.toInt()) {
       //in 1..12 ->
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês Inválido!"
    }

    println("$dia de $mesPorExtenso de $ano")
}