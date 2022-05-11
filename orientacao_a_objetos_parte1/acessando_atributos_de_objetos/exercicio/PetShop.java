package com.company.orientacao_a_objetos.orientacao_a_objetos_parte1.acessando_atributos_de_objetos.exercicio;


public class PetShop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Largetha";
        cachorro.raca = "Dog alemão";
        cachorro.sexo = "Fêmea";
        cachorro.idade = 2;

       Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Pituca";
        meuCachorro.raca = "Picher";
        meuCachorro.sexo = "Fêmea";
        meuCachorro.idade = 10;

        System.out.println("Cachorro");
        System.out.println("______________________________");
        System.out.println("Raça: "+cachorro.raca);
        System.out.println("Nome: "+cachorro.nome);
        System.out.println("Sexo: "+cachorro.sexo);
        System.out.println("Idade: "+cachorro.idade);

        System.out.println("Meu Cachorro");
        System.out.println("______________________________");
        System.out.println("Raça: "+meuCachorro.raca);
        System.out.println("Nome: "+meuCachorro.nome);
        System.out.println("Sexo: "+meuCachorro.sexo);
        System.out.println("Idade: "+meuCachorro.idade);

    }
}