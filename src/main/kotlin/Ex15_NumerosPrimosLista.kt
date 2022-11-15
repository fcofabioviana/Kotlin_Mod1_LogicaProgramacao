/*
Faça um programa que gera uma lista dos números primos existentes entre 1 e um número inteiro
informado pelo usuário.
[Número primo = num > 1 e divisível apenas por 1 e por ele mesmo]
 */
fun main(){
    val listaNumPrimos: MutableList<Int> = mutableListOf()
    var primo: Boolean
    var numInformado = 0
    do {
        println("Informe número maior que 1 (um):")
        numInformado = readln().toInt()
        if (numInformado <= 1) println("ATENÇÃO! Informar número maior que um.")
    } while (numInformado <= 1)
    for (i in 2..numInformado){
        primo = true
        if (i == 1) {
            primo = false
        }
        if (primo) {
            if ((i % 2 == 0) && (i != 2)) {
                primo = false
            }
        }
        if (primo) {
            for (j in 3..(i / 2)) {
                if (i % j == 0) {
                    primo = false
                    break
                }
            }
        }
        if (primo){
            listaNumPrimos.add(i)
        }
    }
    println("Há ${listaNumPrimos.size} números primos até $numInformado. São eles: $listaNumPrimos.")
}