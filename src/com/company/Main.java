package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// pedir dia, mes y año de una fecha
        // indicar si es correcta
        // con meses de 28, 30 y 31 dias sin años bisiestos
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el día");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes");
        int mes = sc.nextInt();
        System.out.println("Introduce el año");
        int año =sc.nextInt();

        if (mes == 2 && (dia > 0 && dia <= 28)){
            System.out.println(dia + mes + año + "La fecha correcta");
        }else {

        } if ((mes == 4| mes == 6| mes == 9|  mes == 11) && (dia >0 && dia <= 30)){
                System.out.println( mes + dia + año + "La fecha es correcta");
            } else {

        } if ((mes == 1 | mes == 3 | mes ==5 | mes == 7| mes == 8 | mes == 10| mes ==12) && (dia >0 && dia <= 31)) {
            System.out.println(mes + dia + año + "La fecha es correcta");
            } else {
            System.out.println("La fecha no es correcta");
        }

        sc.close();







    }
}
