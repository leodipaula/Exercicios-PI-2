//Implementar um algoritmo que faça a leitura de um determinado valor e verifique se o valor é diferente de zero. Se sim, deve-se imprimir "Eh diferente!"". Caso contrário, a seguinte frase deve ser impressa: "Eh zero!".

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int valor = teclado1.nextInt();
    // PROCESSAMENTO E SAÍDA
    if (valor != 0)
        System.out.print("Eh diferente!");
  
    else
        System.out.print("Eh zero!");
  }
} 
