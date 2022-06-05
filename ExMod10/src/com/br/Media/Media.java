package com.br.Media;

import java.util.Scanner;

public class Media {


    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);
    double n1,n2 ,n3,n4 , media;

        System.out.println(" Digite N1:");
        n1 = leia.nextDouble()  ;
        System.out.println(" Digite N2:");
        n2 = leia.nextDouble()  ;
        System.out.println(" Digite N3:");
        n3 = leia.nextDouble()  ;
        System.out.println(" Digite N4:");
        n4 = leia.nextDouble()  ;

        media =(n1+n2+n3+n4)/ 4;

        if (media >= 7 ){
            System.out.println( " Sua media foi:"+ media + "   Você está Aprovado");
        }
        else if( media >= 5 ){
            System.out.println( " Sua media foi:"+ media + "   Você está de Recuperação");
        }
        else {
            System.out.println( " Sua media foi:"+ media + "   Você está Reprovado");
        }

    }
}