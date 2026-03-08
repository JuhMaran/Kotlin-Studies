package variables

// Conversão de tipos numéricos
fun main() {

    // Tipo Inteiro
    val i1 = 10

    // Converter Int para Double
    val d1 = i1.toDouble()
    println(d1)

    // Converter Int para Long
    val l1 = i1.toLong()
    println(l1)

    // Double = tem casas decimais
    // Int = não tem casas decimais
    val d2 = 10.34
    val i2 = d2.toInt()
    // o que vai acontecer com o '.34'?
    println(i2)
    // resultado: 10
    // o '.34' some
    // truncated - cuidado!

    // Tipo de destino é mais restrito que o de origem
    val i3 = 2000 // número inteiro válido
    // converter para byte
    val b1 = i3.toByte()
    // 2000 é um valor superior ao do byte
    // um byte não consegue chegar até 2000
    println(b1)
    // resultado: -48
    // o valor é inconsistente, está errado, deixou o valor negativo
    // truncated

}