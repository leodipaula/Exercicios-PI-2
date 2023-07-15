//Implemente um algoritmo que leia três inteiros e imprima o maior número, se todos os valores forem iguais imprimir a mensagem "Numeros Iguais!".

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int numero = teclado1.nextInt();
    int numero_2 = teclado1.nextInt();
    int numero_3 = teclado1.nextInt();
    // PROCESSAMENTO E SAÍDA
    if (numero > numero_2 && numero > numero_3) {
        System.out.print("Maior eh: " +numero);
    } else if (numero_2 > numero && numero_2 > numero_3) {
        System.out.print("Maior eh: " +numero_2);
    } else if (numero == numero_2 && numero_2 > numero_3) {
        System.out.print("Maior eh: " +numero_2);
    } else if (numero_3 > numero && numero_3 > numero_2) {
        System.out.print("Maior eh: " +numero_3);
    } else {
        System.out.print("Numeros Iguais!");
    }
  }
} 
