package controller;

import java.util.Scanner;

import model.Pessoas;

import static controller.TipoDocumento.*;

public abstract class Pessoa implements Pessoas{
    Scanner inserir = new Scanner(System.in);

    public Pessoa(String getNome, String getDocumento) {
        this.getNome();
        this.getDocumento();
    }
    @Override
    public String getNome() {
        System.out.print("Nome: ");
        return inserir.next();
    }

    @Override
    public String getDocumento() {
        System.out.println("Numero Documento: ");
        String documento = inserir.next();
        return documento;
    }
}
