//    EXERCICIO 3 - AULA 07/11
/* Gerador de usuarios. Crie um programa que receba o nome, sobrenome e ano de nascimento do usuário
e a partir disso gere um nick com as duas primeiras letras do nome, seu sobrenome ao contrario e os
ultimos dois digitos de seu ano de nascimento, tudo minusculo.

Exemplo:  (toString, subString, reversed, split, takeLast)
- Maria
- Medeiros
- 1984

nick gerado: masoriedem84
 */
fun main(){
    println("Digite o seu nome:")
    val nome = readln()
    println("Digite o seu sobrenome:")
    val sobrenome: String = readln()
    println("Digite o seu ano de nascimento:")
    val ano = readln()
    val nickName = "${nome.substring(0,2)}${sobrenome.reversed()}${ano.takeLast(2)}"
    println("Nickname gerado: ${nickName.lowercase()}")
}