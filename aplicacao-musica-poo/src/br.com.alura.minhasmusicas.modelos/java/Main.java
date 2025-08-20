public class Main {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();

        minhaMusica.setTitulo("Numb");
        minhaMusica.setArtista("Numb");
        minhaMusica.setArtista("Linkin Park");
        System.out.println("Música escolhida é: " + minhaMusica.getTitulo() +
                "\nE o artista é: " + minhaMusica.getArtista());
        //System.out.println(minhaMusica.reproduzir());

        for(int i = 0; i < 1000; i++){
            minhaMusica.reproduzir();
        }
        for(int i = 0; i < 50; i++){
            minhaMusica.curtir();
        }

        System.out.println("Total de curtidades: " + minhaMusica.getCurtidas());

        Podcasts meuPodcasts = new Podcasts();
        meuPodcasts.setTitulo("DevClub");
        meuPodcasts.setApresentador("Marcus Mendes");
        System.out.println("Podcast: " + meuPodcasts.getTitulo());
        System.out.println("Apresentador: " + meuPodcasts.getApresentador());

        for(int i = 0; i < 5000;i++){
            meuPodcasts.reproduzir();
        }
        for(int i = 0; i < 1000;i++){
            meuPodcasts.curtir();
        }

    }
}
