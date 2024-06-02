package com.mymusics.principal;

import com.mymusics.models.MinhaPreferidas;
import com.mymusics.models.Musica;
import com.mymusics.models.Podcast;

public class Principal {

    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setAlbum("One");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodscast = new Podcast();

        meuPodscast.setTitulo("BolhaDev");
        meuPodscast.setHost("Marcelino");

        for (int i = 0; i < 5000; i++) {
            meuPodscast.reproduz();

        }
        for (int i = 0; i < 1000 ; i++) {
            meuPodscast.curte();
        }

        MinhaPreferidas preferidas = new MinhaPreferidas();

        preferidas.inclui(meuPodscast);
        preferidas.inclui(minhaMusica);
    }

}
