import kotlin.properties.Delegates

/*
5 - Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e voltando a pedir as informações.
 */
fun main (){

    println ("Digite um nome de usuário:")
    val username = readln().lowercase()
    var password: String
    do {
        println ("Agora crie uma senha:")
        password = readln().lowercase()
        if (password == username){
            println("ATENÇÃO! Senha não pode ser igual ao nome de usuário. Defina uma senha válida.")
        } else
            println("Usuário e senha definidos com sucesso.")
    } while (password == username)
}