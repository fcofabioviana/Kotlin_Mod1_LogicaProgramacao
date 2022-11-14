import kotlin.properties.Delegates

/* 2 - Faça um programa que receba o ano de nascimento de uma pessoa, o ano atual e calcule e imprima:
- A idade dessa pessoa.
- A idade convertida em semanas.

(obs: vamos usar o valor aproximado de 52 semanas por ano para o calculo)

Exemplo:

Qual seu ano de nascimento?
-> 1953
Em qual ano estamos?
-> 2022

Você tem 69 anos, você já viveu aproximadamente 3588 semanas.
 */
fun main (){

    println ("Informe o ano de nascimento da pessoa:")
    val anoNasc = readln().toInt()
    var anoAtual = 0
    do{
        println ("Informe o ano atual:")
        anoAtual = readln().toInt()
        if (anoAtual <= anoNasc){
            println("Ano atual tem que ser maior que ano de nascimento. Informe novamente ano atual.")
        }
    } while (anoAtual <= anoNasc)
    val idade = anoAtual - anoNasc
    println("Você tem $idade anos. Você já viveu aproximadamente ${idade.times(52)} semanas.")
}