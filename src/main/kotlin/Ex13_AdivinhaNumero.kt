import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    var continuar: Char
    var quantTentativas = 0
    var quantPartidas = 0
    var numerosSorteados: MutableList<Int> = mutableListOf()

    do {
        quantPartidas++
        println("Digite o numero minimo:")
        val min = readln().toInt()

        println("Digite o numero maximo:")
        val max = readln().toInt()

        val random = Random.nextInt(min..max)
        numerosSorteados.add(random)

        do {
            quantTentativas++
            println("Tente adivinhar o número gerado:")
            val number = readln().toInt()

            when {
                number > random -> println("O número secreto é menor do que o escolhido.")
                number < random -> println("O número secreto é maior do que o escolhido.")
                else -> {
                    println("O número secreto era $number.")
                }
            }

        } while (number != random)

        println("Quer continuar? [S/N]")
        continuar = readln().uppercase()[0]
    } while (continuar == 'S')

    println("Você teve uma média de ${quantTentativas / quantPartidas.toDouble()} tentativas por partida.")
    println("Os números sorteados foram $numerosSorteados.")
}