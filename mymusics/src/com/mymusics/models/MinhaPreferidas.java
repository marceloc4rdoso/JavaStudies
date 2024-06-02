package com.mymusics.models;

public class MinhaPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso abisoluto de preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " é uma excelente opção. Todo mundo está curtindo");
        }
    }

}
