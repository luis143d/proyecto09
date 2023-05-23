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
public class pregunta04 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el pago por hora: ");
        double pagoPorHora = scanner.nextDouble();

        double sueldoBruto = horasTrabajadas * pagoPorHora;
        double impuesto = sueldoBruto * 0.05;
        double sueldoNeto = sueldoBruto - impuesto;

        System.out.println("El sueldo neto a pagar es: " + sueldoNeto);

    }
}


