/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examen02;

import java.util.Scanner;

/**
 *
 * @author Murillo
 */
public class Examen02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        double impuestoLey = precioProducto * 0.19;
        double importeVenta = precioProducto * cantidad;
        double totalVenta = importeVenta + impuestoLey;

        System.out.println("Importe de la venta: " + importeVenta);
        System.out.println("Impuesto de ley: " + impuestoLey);
        System.out.println("Total de la venta: " + totalVenta);
    }
}

