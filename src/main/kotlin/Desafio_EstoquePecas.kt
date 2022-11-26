private const val ADDITEM = "1"
private const val EDITARITEM = "2"
private const val EXIBIRITENS = "3"
private const val EXIBIRTODOS = "4"
private const val FECHAR = "0"

val menuPrincipal = """
    Digite a opção desejada no Menu:
    1..............ADICIONAR ITEM
    2..............EDITAR ITEM
    3..............EXIBIR ITENS EM ESTOQUE
    4..............EXIBIR TODOS OS ITENS
    0......FECHAR SISTEMA
""".trimIndent()

val itensEstoque = mutableListOf<Triple<Int, String, Int>>()
var idItem = 1

fun main(){
    controleEstoque()
    println("----- Sistema encerrado -----")
}

fun controleEstoque() {
    println("------------------------------")
    println("SISTEMA DE CONTROLE DE ESTOQUE")
    println("------------------------------")
    do {
        println(menuPrincipal)

        val menu = readlnOrNull() ?: 0

        when (menu) {
            ADDITEM -> adicionarItem()
            EDITARITEM -> editarItem()
            EXIBIRITENS -> exibirItensComEstoque()
            EXIBIRTODOS -> exibirTodosItens()
        }
    } while (menu != FECHAR)
}

fun adicionarItem(){
    println("Digite o produto a ser adicionado:")
    val produto = readln()
    println("Digite a quantidade do produto que está sendo adicionado:")
    val qtdeProduto = readln().toIntOrNull() ?: 0
    if (qtdeProduto > 999){
        throw LimiteEstoqueMaxException("Quantidade máxima permitida em estoque: 999 itens.")
    } else if (qtdeProduto < 0) {
        throw LimiteEstoqueMinException("A quantidade em estoque não pode ser negativa.")
    }
    itensEstoque.add(Triple(idItem, produto, qtdeProduto))
    idItem++
}

fun editarItem(){
    if (itensEstoque.isEmpty()){
        println("Não há itens no estoque.")
    } else {
        println("Informe o código do item a ser modificado:")
        val codItem = readln().toIntOrNull() ?: 0
        if (codItem > itensEstoque.size || codItem <= 0){
            println("Item não existe no estoque. Digite um código válido.\n")
            return
        } else{
            println("Você está alterando o item de código #0$codItem." +
                    "\nEscolha a opção a ser alterada:" +
                    "\n[1] Altera apenas o nome." +
                    "\n[2] Altera apenas a quantidade." +
                    "\n[3] Altera nome e quantidade.")
            val alteraProduto = readln().toIntOrNull() ?: 0
            if (alteraProduto <= 0 || alteraProduto > 3){
                println("Opção inválida! Não foi possível alterar o item.\n")
                return
            }
            when (alteraProduto){
                1 -> {
                    println("Informe o novo nome para o produto de código #0$codItem:")
                    val novoProduto = readln()//tratar aqui
                    itensEstoque[codItem - 1] = itensEstoque [codItem - 1].copy(second = novoProduto)
                }
                2 -> {
                    println("Informe a nova quantidade para o produto de código #0$codItem:")
                    val novaQtde = readln().toIntOrNull() ?: 0 //tratar aqui
                    itensEstoque[codItem - 1] = itensEstoque [codItem - 1].copy(third = novaQtde)
                }
                3 -> {
                    println("Informe o novo nome para o produto de código #0$codItem:")
                    val novoProduto = readln() //tratar aqui
                    itensEstoque[codItem - 1] = itensEstoque [codItem - 1].copy(second = novoProduto)
                    println("Informe a nova quantidade para o produto de código #0$codItem:")
                    val novaQtde = readln().toIntOrNull() ?: 0 //tratar aqui
                    itensEstoque[codItem - 1] = itensEstoque [codItem - 1].copy(third = novaQtde)
                }
            }
        }
    }
}

fun exibirItensComEstoque(){
    if(itensEstoque.all { it.third == 0 }){
        println("Não há itens em estoque.\n")
    } else {
        val semEstoque = itensEstoque.filter { it.third > 0 }
        println("------------------------")
        println("ID | Item | Quantidade")
        println("------------------------")
        semEstoque.forEach {
            println("#0${it.first} | ${it.second} | ${it.third}")
        }
        println("------------------------\n")
    }
}

fun exibirTodosItens(){
    if (itensEstoque.isEmpty()){
        println("Não há itens em estoque.")
    } else {
        println("------------------------")
        println("ID | Item | Quantidade")
        println("------------------------")
        itensEstoque.forEach {
            println("#0${it.first} | ${it.second} | ${it.third}")
        }
        println("------------------------\n")
    }
}

class LimiteEstoqueMaxException(message: String): Exception(message)
class LimiteEstoqueMinException(message: String): Exception(message)