package com.company.orientacao_a_objetos.orientacao_a_objetos_parte1.acessando_atributos_de_objetos;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Honda";
        seuCarro.modelo = "Civic";
        seuCarro.anoDeFabricacao = 2009;
        seuCarro.cor = "Preto";

        System.out.println("Meu carro");
        System.out.println("-----------------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoDeFabricacao);

        System.out.println();
        System.out.println("Seu carro");
        System.out.println("-----------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoDeFabricacao);

    }
}