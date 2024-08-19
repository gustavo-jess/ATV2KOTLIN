fun main(args: Array<String>) {

    var nome = "JESS"
    var idade = 19
    var salario = 3000
    var mesestrab = 12
    var quantprod = 3
    var desconAnual = 300

    var somaAnual = salario * mesestrab
    var salAnual = somaAnual - desconAnual

    var prodUm = 20
    var prodDois = 10
    var prodTres = 20

    var somaProdutos = prodUm+prodDois+prodTres
    var mediaProduto = somaProdutos/quantprod
     println("Ola $nome, o seu salario anual é igual a $salAnual")


    println("Segue abaixo os dados informados")

    println("Meu nome é $nome")

    println("Minha idade é $idade")

    println("O salario mensal é $salario")

    println("A quantidade de meses trabalhados é $mesestrab")

    println("A quantidade de produtos é $quantprod")

    println("O desconto do salario anual é $desconAnual")

    println("O salario anual sem desconto é $somaAnual")

    println("O salario anual é $salAnual")

    println("esses são os produtos $prodUm, $prodDois, $prodTres")

    println("A soma dos produtos é $somaProdutos")

    println("A media doss produtos é $mediaProduto")


}