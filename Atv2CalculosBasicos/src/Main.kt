fun main(args: Array<String>) {

    var nome = "JESS"
    var idade = 19
    var salario = 1.600
    var mesestrab = 12
    var quantprod = 3
    var desconAnual = 300

    var somaAnual: Double = salario * mesestrab
    var salAnual:  Double = somaAnual - desconAnual

    var prodUm = 20
    var prodDois = 10
    var prodTres = 20

    var somaProdutos = prodUm+prodDois+prodTres
    var mediaProduto = somaProdutos/quantprod
     println("Ola $nome, o seu salario anual é igual a $salAnual")

    println("Segue abaixo os dados informados")

    println("$nome")

    println("$idade")

    println("$salario")

    println("$mesestrab")

    println("$quantprod")

    println("$desconAnual")

    println("$salAnual")

    println("esses são os produtos $prodUm, $prodDois, $prodTres")

    println("$somaProdutos")

    println("$mediaProduto")


}