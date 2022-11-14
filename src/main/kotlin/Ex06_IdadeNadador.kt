/* 3 - Faça um programa que receba a idade de um nadador e imprima a sua categoria seguindo as regras:

CATEGORIA   	IDADE

Infantil A 		5 — 7 anos
Infantil B		8 — 10 anos
Juvenil A		11 — 13 anos
Juvenil B		14 — 17 anos
Sênior		    maiores de 18 anos
 */
fun main (){

    println ("Informe a idade do nadador:")
    val idade = readln().toInt()
    when {
        idade in 5..7 -> println("O nadador pertence a categoria Infantil A (5 — 7 anos).")
        idade in 8..10 -> println("O nadador pertence a categoria Infantil B (8 — 10 anos).")
        idade in 11..13 -> println("O nadador pertence a categoria Juvenil A (11 — 13 anos).")
        idade in 14..17 -> println("O nadador pertence a categoria Juvenil B (14 — 17 anos).")
        idade >= 18                -> println("O nadador pertence a categoria Senior (maiores de 18 anos).")
        else -> println("O nadador ainda não pertence a nenhuma categoria.")
    }
}