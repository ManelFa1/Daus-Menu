package com.company;

import java.util.Scanner;

public class Dados {
    private int valor;

    public Dados() {
        valor = (int) Math.random() * 6 + 1;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Dado{" +
                "valor='" + valor +
                '}';
    }
    public void tirar(){
        valor = this.valor;
    }
}
