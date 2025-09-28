
    public class Roupas extends Produtos{
        private float tamanho;
        private String cor;

        public Roupas(int codigo, String nomeProduto, double preço, int qtdEstoque, float tamanho, String cor) {
            super(codigo, nomeProduto, preço, qtdEstoque);
            this.tamanho = tamanho;
            this.cor = cor;
        }

        public float getTamanho() {
            return tamanho;
        }
        public String getCor() {
            return cor;
        }

        public void setTamanho(float tamanho) {
            this.tamanho = tamanho;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

}
