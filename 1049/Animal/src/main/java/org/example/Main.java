package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String coluna, especie, alimentacao;
        coluna = sc.nextLine();
        especie = sc.nextLine();
        alimentacao = sc.nextLine();

        if (coluna.equalsIgnoreCase("vertebrado")){
            if (especie.equalsIgnoreCase("ave")){
                if (alimentacao.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                }else { //onivoro
                    System.out.println("pomba");
                }
            }else { //mamifero
                if (alimentacao.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                }else { //herbivoro
                    System.out.println("vaca");
                }
            }
        }else {  //invertebrado
            if (especie.equalsIgnoreCase("inseto")){
                if (alimentacao.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                }else { //herbivoro
                    System.out.println("lagarta");
                }
            }else { //anelideo
                if (alimentacao.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                }else { //onivoro
                    System.out.println("minhoca");
                }
            }
        }
    }
}