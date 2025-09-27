import java.util.List;

public class Produto {
    private int codigo;
    private String nomeProduto;
    private double preço;
    private int qtdEstoque;
    List<>

    //GETTERS
    public int getCodigo() {
        return codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreço() {
        return preço;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    //SETTERS

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}

/*

Criar um estoque de produtos em Java usando polimorfismo, herança e obrigatoriamente utilizando a classe ArrayList do pacote java.util.

Descrição do Desafio: Neste desafio, você deve criar um sistema para gerenciar um estoque de produtos em uma loja.
O estoque deve ser capaz de armazenar diferentes tipos de produtos,
como por exemplo, produtos eletrônicos, roupas, alimentos, etc.
Cada tipo de produto deve herdar características comuns da classe Produto,
que inclui atributos como nome, código, preço e quantidade em estoque.

O sistema deve ser capaz de realizar as seguintes operações:


1) Adicionar produtos ao estoque: O sistema deve permitir a adição de novos produtos ao estoque, seja eletrônico,
roupa, alimento, ou qualquer outro tipo de produto suportado.

2) Listar produtos em estoque: O sistema deve ser capaz de exibir a lista de todos os produtos presentes no estoque,
mostrando os detalhes de cada produto, como nome, código, preço e quantidade em estoque.

*/
