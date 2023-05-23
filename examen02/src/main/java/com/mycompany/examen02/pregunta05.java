/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen02;

import java.util.Scanner;

/**
 *
 * @author Murillo
 */
public class pregunta05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el valor de b: ");
        int b = scanner.nextInt();

        System.out.println("Ingrese el valor de c: ");
        int c = scanner.nextInt();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("El área del triángulo es: " + area);

    }
}

