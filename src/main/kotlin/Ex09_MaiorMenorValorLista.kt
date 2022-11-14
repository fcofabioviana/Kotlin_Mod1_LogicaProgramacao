/*
1 - Faça um programa que leia 10 valores digitados pelo usuário e no final, escreva o maior e o
menor valor lido.
 */
fun main(){
    var listaValores: MutableList<Int> = mutableListOf()
    for (i in 1..10){
        println("Digite o valor nº $i/10:")
        val valor = readln().toInt()
        listaValores.add(valor)
    }
    println("Menor valor: ${listaValores.min()}. Maior valor: ${listaValores.max()}")
}