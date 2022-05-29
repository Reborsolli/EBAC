package br.com.calcularMedia;

import java.util.Scanner;

public class CalcularMedia {

    public static void main (String args[]){

        double n1;
        double n2;
        double n3;
        double n4;
        double media;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite Nota 1");
        n1 = leia.nextDouble();

     ;
        System.out.println("Digite Nota 2");
        n2 = leia.nextDouble();

        System.out.println("Digite Nota 3");
        n3 = leia.nextDouble();

        System.out.println("Digite Nota 4");
        n4 = leia.nextDouble();

        media = (n1 + n2 + n3 +n4) / 4;

        System.out.println(" A media é : " + media);
    }
}
