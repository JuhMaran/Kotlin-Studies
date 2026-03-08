package variables

fun main() {

    // Char = representa um caracter
    val c: Char = 'A' // aspas simples, pode ser apenas espaço
    println(c) // retorna = A
    println(c.code) // Tabela ASCII | retorna = 65

    // Converter inteiro para char e o inverso também
    val i = 65
    println(i.toChar()) // retorna = A

    // inc = incrementa
    // dec = decrementa

    println(i.toChar().inc().inc()) // retorna = C

    // Utilitários para identificar o que é o caracter
    val c2 = '1' // como caracter
    println(c2.inc()) // incrementa o valor de c2 - retorna 2
    println(c2.inc().inc()) // incrementa o valor de c2 - retorna 3

    val c3 = 'a'
    // uso de 'is'
    println(c2.isDigit()) // verifica se um caracter é um dígito, que retorna true ou false
    println(c3.isUpperCase()) // verifica se é letra minúscula ou maiúscula

    // Converte Char para Int, extraindo o valor que está na variável
    val c4 = '1'
    println(c4.digitToInt()) // retorna = 1

    // Ver: Documentação do Char

}