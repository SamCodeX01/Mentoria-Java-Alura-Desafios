public class Audio implements Interface{
    private String titulo;
    private float duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    //GETTERS
    public String getTitulo(){
        return titulo;
    }

    //SETTERS

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public float getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.curtidas++;
    };
    public void reproduzir(){
        totalDeReproducoes++;
    };

    //e assim por diante, impedindo que a classe Principal tenha acesso a esses atributos.

}
