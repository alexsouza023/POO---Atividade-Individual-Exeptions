package com.exeptions.exeptions;

import java.util.Scanner;

public class Lista {

    public void ex01() {

        /*
         * Crie um programa que faça divisão de 2 números
         * informados pelo usuário. Previna o erro caso o usuário
         * escolha o divisor 0.
         */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            double numerador = scanner.nextDouble();

            System.out.print("Digite o divisor: ");
            double divisor = scanner.nextDouble();

            if (divisor == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }

            double resultado = numerador / divisor;
            System.out.println("O resultado da divisão é: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Por favor, insira apenas números.");
        } finally {
            scanner.close();
        }
    }
}
