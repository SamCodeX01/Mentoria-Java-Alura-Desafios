public class Alimentos extends Produto{
    private String dataFabricacao;
    private String dataVencimento;

    public Alimentos(int codigo, String nomeProduto, double preço, int qtdEstoque, String dataFabricacao, String dataVencimento){
        super(codigo, nomeProduto, preço, qtdEstoque); //super() chama o construtor da superclasse. Permitindo acessar seus construtores, métodos e atributos.
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
    }


    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}