package day07_stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulationsConcat {
    public static void main(String[] args) {
/*
        ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

            */

            System.out.println(15 + 20 + "Merhaba");//35Merhaba
            System.out.println("Merhaba" + 15 + 20);//Merhaba1520
            System.out.println("Merhaba" + (15 + 20));//Merhaba35
            System.out.println("Merhaba" + 15 * 20);//Merhaba300

            //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
            //tam isminin buyuk harfle yazilmasini saglayin.

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen ad ve soyadinizi giriniz");
        String isim=input.nextLine(),soyIsim=input.nextLine();

        //Strin soyIsim=input.nextLine();
        String tamIsim=isim.concat(" "+soyIsim).toUpperCase();
        System.out.println("tamIsim="+tamIsim);


        }

    }
