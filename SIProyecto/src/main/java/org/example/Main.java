package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al conversor de numeros de 32 bits a redes IPv4");
        System.out.println("Por favor introduzca el numero a continuacion");

        long numero = scanner.nextLong();


        System.out.println("Tu direccion IPv4 es: " + LongToIp.longToIP(numero));

        String pausa = scanner.next();
        scanner.close();
    }
}