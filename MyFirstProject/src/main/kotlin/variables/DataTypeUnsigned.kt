package variables

// Números Inteiros Sem Sinal
// Números positivos, iniciam em 0
fun main() {

    /*
    TIPOS INTEIROS DO KOTLIN
    Byte -> UByte
    Short -> UShort
    Int -> UInt
    Long -> ULong

    U = Unsigned (sem sinal)
     */

    // Criando um número sem sinal
    // 100U - o sufixo pode ser minúsculo ou maiúsculo
    val x = 100u // Tipo: UInt
    println(x)

    // Unsigned Long
    val y = 100UL

    // Transformando unsigned em signed
    val x2 = x.toInt()
    val y2 = y.toDouble()

    val x3 = -20 // Int válido
    val x4 = x3.toUInt()
    println(x4)
    // Result: 4294967276
    // Cuidado: tomar cuidado para retornar valor correto

}