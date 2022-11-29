private const val PAES = 1
private const val SALGADOS = 2
private const val DOCES = 3
private const val FINALIZAR = 0

private const val LINHA = ".........."

val valorPaoFrances = 0.60
val valorPaoDeLeite = 0.40
val valorPaoDeMilho = 0.50

val produtoPaoFrances = "Pão Francês"
val produtoPaoDeLeite = "Pão de Leite"
val produtoPaoDeMilho = "Pão de Milho"

val paes: List<Pair<String, Double>> = listOf(
    Pair(produtoPaoFrances, valorPaoFrances), // index 0
    Pair(produtoPaoDeLeite, valorPaoDeLeite), // index 1
    Pair(produtoPaoDeMilho, valorPaoDeMilho), // index 2
)

val valorCoxinha = 5.00
val valorEsfiha = 6.00
val valorPaoDeQueijo = 3.00

val produtoCoxinha = "Coxinha"
val produtoEsfiha = "Esfiha"
val produtoPaoDeQueijo = "Pão de Queijo"

val salgados: List<Pair<String, Double>> = listOf(
    Pair(produtoCoxinha, valorCoxinha), // index 0
    Pair(produtoEsfiha, valorEsfiha), // index 1
    Pair(produtoPaoDeQueijo, valorPaoDeQueijo), // index 2
)

val valorCarolina = 1.50
val valorPudim = 4.00
val valorBrigadeiro = 2.00

val produtoCarolina = "Carolina"
val produtoPudim = "Pudim"
val produtoBrigadeiro = "Brigadeiro"

val doces: List<Pair<String, Double>> = listOf(
    Pair(produtoCarolina, valorCarolina), // index 0
    Pair(produtoPudim, valorPudim), // index 1
    Pair(produtoBrigadeiro, valorBrigadeiro), // index 2
)

val categorias = """
    Digite a opção desejada no Menu:
    1..................Pães
    2..............Salgados
    3.................Doces
    0......Finalizar compra
""".trimIndent()

val menuPaes = """
        1 - $produtoPaoFrances...........R$ $valorPaoFrances
        2 - $produtoPaoDeLeite..........R$ $valorPaoDeLeite
        3 - $produtoPaoDeMilho..........R$ $valorPaoDeMilho
        0 - Voltar
    """.trimIndent()

val menuSalgados = """
        1 - $produtoCoxinha...........R$ $valorCoxinha
        2 - $produtoEsfiha..........R$ $valorEsfiha
        3 - $produtoPaoDeQueijo..........R$ $valorPaoDeQueijo
        0 - Voltar
    """.trimIndent()

val menuDoces = """
        1 - $produtoCarolina...........R$ $valorCarolina
        2 - $produtoPudim..........R$ $valorPudim
        3 - $produtoBrigadeiro..........R$ $valorBrigadeiro
        0 - Voltar
    """.trimIndent()

val itensComanda: MutableList<String> = mutableListOf<String>()
var total: Double = 0.0
var desconto: Double = 0.0

fun main() {
    do {
        var finalizarCompra = "S"
        ePadoca()

        if (itensComanda.isEmpty()) {
            println("Deseja mesmo finalizar a compra? (S/N)")
            finalizarCompra = readln().uppercase()
        } else {
            println("Possui um Cupom de desconto? (S/N)")
            val possuiCupom = readln().uppercase()
            if(possuiCupom == "S") aplicarCupomDesconto()
            println("=====================Comanda E-padoca========================")
            println("item.......Produto.............Qtd.......Valor...........Total")
            itensComanda.forEach { item -> // funcao
                println(item)
            }
            println("======================== Total sem desconto R$ ${String.format("%.2f", total)} =====================")
            println("=============== Desconto aplicado R$ ${String.format("%.2f", desconto)} ====================")
            println("======================== Total a pagar R$ ${String.format("%.2f", (total - desconto))} =====================")
            println("======================= VOLTE SEMPRE ^-^ ======================")
        }
    } while (finalizarCompra != "S")
}

fun ePadoca() {
    println("Bem Vindo à padaria E-Padoca!")
    do {
        println(categorias)

        val categoria = readln().toInt()

        when (categoria) {
            PAES -> selecionaProduto(menuSelecionado = menuPaes, produtos = paes)
            SALGADOS -> selecionaProduto(menuSelecionado = menuSalgados, produtos = salgados)
            DOCES -> selecionaProduto(menuSelecionado = menuDoces, produtos = doces)
            else -> Unit
        }
    } while (categoria != FINALIZAR)
}

fun selecionaProduto(menuSelecionado: String, produtos: List<Pair<String, Double>>) {
    do {
        println(menuSelecionado)
        val produtoSelecionado = readln().toInt() // valor atual -> 1 (corresponde ao pao frances)

        for ((i, produto) in produtos.withIndex()) {
            if (i.inc() == produtoSelecionado) {
                selecionaQuantidadeDoProduto(produto)
                break
            }
        }


    } while (produtoSelecionado != 0)
}

fun selecionaQuantidadeDoProduto(produto: Pair<String, Double>) {
    println("Digite a quantidade:")
    val quantidade = readln().toInt()
    val totalItem = quantidade * produto.second
    val item =
        itemComanda(produto = produto.first, quantidade = quantidade, valorUnitario = produto.second, total = totalItem)
    itensComanda.add(item)
    total += totalItem
}

fun itemComanda(
    produto: String,
    quantidade: Int,
    valorUnitario: Double,
    total: Double,
): String = "${itensComanda.size.inc()}$LINHA$produto$LINHA$quantidade${LINHA}R$${String.format("%.2f", valorUnitario)}${LINHA}R$${String.format("%.2f", total)}"

fun aplicarCupomDesconto(){
    println("Digite o código do seu cupom:")
    val cupom = readln().uppercase()
    when(cupom){
        "5PADOCA" -> desconto =  0.05 * total
        "10PADOCA"-> desconto = 0.10 * total
        "5OFF"    -> if(total > 20) desconto = 5.0
        else {
            println("ATENÇÂO! Desconto válido apenas para compras acima de R$20.")
            cupomInvalido()
        }
        else -> cupomInvalido()
    }
}

fun cupomInvalido(){
    println("Deseja digitar um novo código? (S/N)")
    val cupom = readln().uppercase()
    if(cupom == "S") aplicarCupomDesconto()
}