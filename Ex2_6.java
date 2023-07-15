//Faça um algoritmo que receba a idade de uma pessoa e mostre se ela é maior de idade ou não.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int idade = teclado1.nextInt();
    // PROCESSAMENTO E SAÍDA
    if (idade >= 18) {
        System.out.print("Eh maior de idade!");
    } else {
        System.out.print("Nao eh maior de idade!");
    }
  }
} 
