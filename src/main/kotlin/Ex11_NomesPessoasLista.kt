/*
3 - Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armazene os nomes lidos em uma
lista. Depois, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa (para efetuar uma busca)
e depois escrever a mensagem ACHEI e sua posição na lista, se o nome estiver entre os 10 nomes lidos
anteriormente (guardados na lista), ou NÃO ACHEI caso contrário.
 */
fun main(){
    var listaPessoas: MutableList<String> = mutableListOf()
    for (i in 1..10) {
        println("Digite o nome da pessoa nº $i/10:")
        val nome = readln()
        listaPessoas.add(nome)
    }
    println("Busque uma pessoa na lista:")
    val busca = readln()
    if (listaPessoas.containsAll(listOf(busca))){
        println("ACHEI! :) $busca está na lista.")
    }else{
        println("NÃO ACHEI! :( Essa pessoa não está na lista.")
    }
}