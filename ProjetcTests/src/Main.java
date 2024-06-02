import commerce.Produto;
import commerce.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //escola
        /*
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jacqueline");
        nomes.add("Paulo");
        nomes.add("Suellen");
        nomes.add("Emily");
        //nomes.clear();
        //String string = nomes.get(2);
        //int size = nomes.size();
        nomes.forEach(System.out::println);
        //System.out.println(string);
        //System.out.println(size);


        //Commerce

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);


        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }
        Produto produtoNovo = new Produto("Novo Produto", 15.99, 3);
        System.out.println(produtoNovo);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(produtoPerecivel);

        */

        Produto p1 = new Produto("Caneta", 1.50, 5);
        Produto p2 = p1;
        p2.setPreco(2.00);
        System.out.println(p1.getPreco());

    }
}