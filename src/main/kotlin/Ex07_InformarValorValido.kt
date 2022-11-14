/*
4 - Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e
 continue pedindo até que o usuário informe um valor válido.
 */
fun main (){

    do {
        println ("Digite uma nota (0 - 10):")
        val nota = readln().toInt()
        if (nota < 0 || nota > 10){
            println("ATENÇÃO! Digite uma nota entre 0 e 10.")
        } else
            println("Você digitou a nota $nota.")
    } while (nota < 0 || nota > 10)
}