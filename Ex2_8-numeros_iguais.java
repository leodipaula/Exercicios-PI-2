//Implementar um algoritmo que leia dois números e mostre o menor. Se os números forem iguais, deve-se imprimir “Numeros iguais!”.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int numero = teclado1.nextInt();
    int numero_2 = teclado1.nextInt();
    // PROCESSAMENTO E SAÍDA
    int menor_numero = numero-numero_2;
    if (menor_numero < 0) {
        System.out.print("Menor eh: " +numero);
    } else if (menor_numero > 0) {
        System.out.print("Menor eh: " +numero_2);
    } else {
        System.out.print("Numeros iguais!");
    }
  }
} 
