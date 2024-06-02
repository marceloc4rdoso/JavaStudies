package desafioLists.desafio3;

/*
No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista.
Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

*/

public class Titulo implements Comparable<Titulo> {

    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    @Override
    public String toString() {
        return "Titulo: " + nome;
    }
}