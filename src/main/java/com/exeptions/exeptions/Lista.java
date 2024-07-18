package com.exeptions.exeptions;

import java.util.InputMismatchException;
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

    public void ex02() {

        /*
         * Crie um menu que de ao usuário 3 opções (1- 2- e 3- ),
         * solicite a opção inteira ao usuário e previna erros caso o
         * usuário insira um valor indevido.
         */

        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Opção 1");
                System.out.println("2 - Opção 2");
                System.out.println("3 - Opção 3");
                System.out.print("Digite sua escolha: ");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu a Opção 1");
                        validInput = true;
                        break;
                    case 2:
                        System.out.println("Você escolheu a Opção 2");
                        validInput = true;
                        break;
                    case 3:
                        System.out.println("Você escolheu a Opção 3");
                        validInput = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); // Limpa o scanner para evitar loop infinito
            }
        }

        scanner.close();
    }

    public void ex03() {

        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Listar Pokémons");
                System.out.println("2 - Opção 2");
                System.out.println("3 - Opção 3");
                System.out.print("Digite sua escolha: ");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        listarPokemons(scanner);
                        validInput = true;
                        break;
                    case 2:
                        System.out.println("Você escolheu a Opção 2");
                        validInput = true;
                        break;
                    case 3:
                        System.out.println("Você escolheu a Opção 3");
                        validInput = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); // Limpa o scanner para evitar loop infinito
            }
        }

        scanner.close();
    }

    public static void listarPokemons(Scanner scanner) {
        String[] pokemons = { "Charmander", "Bulbasauro", "Squirtle" };
        boolean validIndex = false;

        while (!validIndex) {
            try {
                System.out.println("Escolha um Pokémon:");
                for (int i = 0; i < pokemons.length; i++) {
                    System.out.println((i + 1) + " - " + pokemons[i]);
                }
                System.out.print("Digite o índice do Pokémon desejado: ");

                int index = scanner.nextInt() - 1;

                if (index >= 0 && index < pokemons.length) {
                    System.out.println("Você escolheu: " + pokemons[index]);
                    validIndex = true;
                } else {
                    System.out.println(
                            "Índice inválido. Por favor, escolha um índice entre 1 e " + pokemons.length + ".");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); // Limpa o scanner para evitar loop infinito
            }
        }
    }

}
