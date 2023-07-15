//Implementar um algoritmo que faça a leitura de um determinado valor e verifique se o valor é maior ou igual a três. Se sim, deve-se imprimir "Eh maior ou igual!"". Caso contrário, deve ser impresso "Eh menor!".

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int valor = teclado1.nextInt();
    // PROCESSAMENTO E SAÍDA
    if (valor > 3)
        System.out.print("Eh maior ou igual!");
    else if (valor < 3)
        System.out.print("Eh menor!");
    else
        System.out.print("Eh maior ou igual!");
  }
} 
