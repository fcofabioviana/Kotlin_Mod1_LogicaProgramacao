/* 1 - Faça um programa que receba a idade de uma pessoa em anos e imprima essa idade em meses, dias,
horas e minutos. (obs: não será preciso levar em conta anos bissextos, podendo usar 365 dias por ano)

Exemplo:

Digite sua idade:
-> 1
Sua idade equivale a:
12 meses
365 dias
8760 horas
525600 minutos
*/
fun main (){

    var idade: Int = 0

    do {
        println ("Informe sua idade:")
        idade = readln().toInt()
        if (idade <= 0){
            println("Digite um número maior que zero.")
        }
    } while (idade <= 0)

    println ("Sua idade ($idade anos) equivale a:\n" +
            "${idade.times(12)} meses\n" +
            "${idade.times(365)} dias\n" +
            "${idade.times(8760)} horas\n" +
            "${idade.times(525600)} minutos")
}