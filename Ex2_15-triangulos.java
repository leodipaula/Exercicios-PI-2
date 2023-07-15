//Escreva um algoritmo que LEIA as medidas dos TRÊS LADOS de um suposto triângulo (A, B, C) e informe se esses 3 lados formam ou não um triângulo.  
//Caso seja um triângulo, informar o tipo: EQUILÁTERO, ISÓSCELES ou ESCALENO:

// TRIÂNGULO: figura geométrica de três lados, em que cada lado é menor do que a soma dos outros dois;
// EQUILÁTERO: três lados são iguais;
// ISÓSCELES: dois lados são iguais;
// ESCALENO: todos os lados são diferentes.

import java.util.Scanner;
import java.lang.Math;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int a = teclado1.nextInt();
    int b = teclado1.nextInt();
    int c = teclado1.nextInt();
    // PROCESSAMENTO E SAÍDA
    if (Math.abs(a-c)>b || b>a+c || a+b+c==0) {
        System.out.print("Nao eh Triangulo!");
    } else if (Math.abs(a-c)<b && b<a+c && a!=b && b!=c && a!=c) {
        System.out.println("Eh Triangulo!");
        System.out.println("Escaleno!");
    } else if (Math.abs(a-c)<b && b<a+c && a==b && b==c) {
        System.out.println("Eh Triangulo!");
        System.out.println("Equilatero!");
    } else if (Math.abs(a-c)<b && b<a+c && a==b || b==c || c==a) {
        System.out.println("Eh Triangulo!");
        System.out.println("Isosceles!");
    }
  }
} 
