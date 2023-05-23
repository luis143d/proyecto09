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
public class pregunta02 {
    public static void main(String[] args) {
        // Solicitar al usuario los datos de entrada
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario los datos de entrada
            System.out.print("Ingrese la distancia en kilómetros: ");
            double distancia = scanner.nextDouble();
            
            System.out.print("Ingrese la velocidad en kilómetros por hora: ");
            double velocidad = scanner.nextDouble();
            
            // Calcular el tiempo de desplazamiento
            double tiempoDesplazamiento = calcularTiempoDesplazamiento(distancia, velocidad);
            
            // Imprimir el resultado
            System.out.println("El tiempo de desplazamiento es de " + tiempoDesplazamiento + " horas");
        }
    }

    public static double calcularTiempoDesplazamiento(double distancia, double velocidad) {
        double tiempo = distancia / velocidad;
        return tiempo;
    }
}
