/*
2 - Escreva um algoritmo que receba um número e imprima a tabuada dele (de 1 a 10)
Ex:
Digite um número:
-> 9
Tabuada do 9
1 x 9 = 9
2 x 9 = 18
3 x 9 = 27
4 x 9 = 36
5 x 9 = 45
6 x 9 = 54
7 x 9 = 63
8 x 9 = 72
9 x 9 = 81
10 x 9 = 90
 */
fun main (){
    var numTab = 0
    do {
        println("Informe o número da tabudada desejado:")
        numTab = readln().toInt()
        if (numTab == 0) println("ATENÇÃO! Toda tabuada de 0 tem valor 0. Escolha outro valor.")
    } while(numTab == 0)
    println("## Tabuada do $numTab ##")
    for (i in 1..10){
        println("$i x $numTab = ${i * numTab}")
    }
}