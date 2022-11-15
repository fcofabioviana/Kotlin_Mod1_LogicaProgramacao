/*
4 - Faça um algoritmo para ler 15 números e armazenar em uma lista. Após a leitura total dos
15 números, o algoritmo deve escrever esses 15 números lidos na ordem inversa da qual foi declarado.
*/
fun main(){
    var listaNumeros: MutableList<Int> = mutableListOf()
    for (i in 1..15) {
        println("Digite o valor nº $i/15:")
        val numero = readln().toInt()
        listaNumeros.add(numero)
    }
    println("Lista reversa: ${listaNumeros.asReversed()}")
}