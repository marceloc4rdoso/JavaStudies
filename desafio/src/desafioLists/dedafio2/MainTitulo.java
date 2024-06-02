package desafioLists.dedafio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MainTitulo {

    public static void main(String[] args) {
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("O Alto da Compadecida"));
        titulos.add(new Titulo("Lisbela e o Prisionairo"));
        titulos.add(new Titulo("Central do Brasil"));

        System.out.println("Lista original:");
        for (Titulo titulo : titulos) {
            System.out.println(titulo);
        }

        Collections.sort(titulos);

        System.out.println("\nLista ordenada:");
        for (Titulo titulo : titulos) {
            System.out.println(titulo);
        }
    }
}
