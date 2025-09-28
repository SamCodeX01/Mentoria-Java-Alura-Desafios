
public  class Eletronicos extends Produtos {
    private int garantiaMeses;

    //CONSTRUTOR
    public Eletronicos(int codigo, String nomeProduto, double preço, int qtdEstoque, int garantiaMeses){
        super(codigo, nomeProduto, preço, qtdEstoque);
        this.garantiaMeses = garantiaMeses;
    }

    //GETTERS
    public int getGarantiaMeses(){
        return garantiaMeses;
    }

    //SETTERS
    public void setGarantiaMeses(int garantiaMeses){
        this.garantiaMeses = garantiaMeses;
    }

}