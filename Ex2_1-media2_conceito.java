//Considere o seguinte pseudocódigo para ler duas notas reais, calcular a média das duas notas e atribui um conceito:
//nota1 = leia("Digite a 1a nota:");
//nota2 = leia("Digite a 2a nota:");
//media = (nota1 + nota2)/2;
//se media >= 9 então  
//    escreva("Conceito A"); 
//senão se media >= 7.5  
//    escreva("Conceito B"); 
//senão se media >= 6 
//    escreva("Conceito C"); 
//senão se media >= 5| 
//    escreva("Conceito D"); 
//senão 
//    escreva("Reprovado! Conceito F");

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    System.out.print("Digite a 1a nota: ");
    float nota1 = teclado1.nextFloat();
    System.out.print("Digite a 2a nota: ");
    float nota2 = teclado1.nextFloat();
    // PROCESSAMENTO E SAÍDA
    float media = (nota1 + nota2)/2;
    if (media >= 9.0)      
      System.out.print("Conceito A"); 
    else if (media >= 7.5) 
      System.out.print("Conceito B");
    else if (media >= 6.0) 
      System.out.print("Conceito C");
    else if (media >= 5.0) 
      System.out.print("Conceito D");
    else        
      System.out.print("Reprovado! Conceito F");
  }
} 
