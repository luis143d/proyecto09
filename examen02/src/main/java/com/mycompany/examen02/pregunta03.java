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
public class pregunta03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese a:");
        int a = scanner.nextInt();

        System.out.println("Ingrese b:");
        int b = scanner.nextInt();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("El valor de la hipotenusa es: " + c);
    }
}
    
