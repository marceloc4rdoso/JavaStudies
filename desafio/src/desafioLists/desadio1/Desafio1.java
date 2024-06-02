package desafioLists.desadio1;

/*
Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente.
Em seguida, imprima a lista ordenada.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio1 {

    public static void main(String[] args) {

        List <Integer> numero = new ArrayList<Integer>();
        numero.add(1);
        numero.add(4);
        numero.add(65);
        numero.add(156);
        numero.add(51);

        Collections.sort(numero);

        System.out.println(numero);
    }



}
