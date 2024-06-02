package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

import static java.util.Collections.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);


        for (Titulo item: lista) {

            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());

            }

        }

        ArrayList<String> buscaPorArtitas = new ArrayList<>();
        buscaPorArtitas.add("Adam Sandler");
        buscaPorArtitas.add("Will Smith");
        buscaPorArtitas.add("Wagner Moura");
        buscaPorArtitas.add("Tatiana Maslany");
        buscaPorArtitas.add("Elen Pompeo");


        System.out.println("Artistas:" + buscaPorArtitas);
        sort(buscaPorArtitas);
        System.out.println("Artistas ordenados:" + buscaPorArtitas);
        System.out.println();
        Collections.sort(lista);
        System.out.println("Filmes ordenados:" + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Filmes ordenados poe ano de lançamento:" + lista);

    }
}
