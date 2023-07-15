// Uma fábrica de discos voadores produz diversos modelos que são entregues para clientes na galáxia.
// Neste fábrica, os discos voadores são vendidos em pacotes com três unidades. 
// Portanto, não é possível comprar apenas um disco voador nesta fábrica.
// Ao solicitar os três discos voadores, devem ser especificados os modelos dos discos.

// Dependendo dos modelos solicitados, o prazo de entrega pode ser diferente:

// Quando os três discos voadores solicitados são do mesmo modelo (tem o mesmo código), o prazo de entrega é de 5 dias;
// Quando dois discos voadores são do mesmo modelo (tem o mesmo código) e o outro é de outro modelo (outro código), o prazo de entrega é de 15 dias;
// Quando os três discos voadores são de modelos diferentes (três códigos diferentes), o prazo de entrega é de 30 dias.

// O gerente da fábrica escreveu um programa para calcular o prazo de entrega dependendo dos modelos solicitados pelo cliente:

import java.util.Scanner;

public class Programa {
    
    public static int obterPrazoEntrega(int disco1, int disco2, int disco3) {
        // Este método deve retornar o prazo de entrega
        
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int d1 = leitor.nextInt();
        int d2 = leitor.nextInt();
        int d3 = leitor.nextInt();
        int resultado = Programa.obterPrazoEntrega(d1, d2, d3);
        System.out.println("Disco1 = " + d1);
        System.out.println("Disco2 = " + d2);
        System.out.println("Disco3 = " + d3);
        System.out.println("Prazo de entrega = " + resultado);
    }
    
}

// Contudo, faltou implementar o método obterPrazoEntrega neste código.
// Escreva o método obterPrazoEntrega que recebe os códigos de três discos voadores.
// O método deve retornar o prazo de entrega dependendo dos códigos dos discos voadores solicitados.

public static int obterPrazoEntrega(int disco1, int disco2, int disco3) {
    // Este método deve retornar o prazo de entrega
    if (disco1 != disco2 && disco2 != disco3 && disco3 != disco1) {
        int resultado = 30;
        return resultado;
    } else if (disco1 == disco2 && disco1!=disco3) {
        int resultado = 15;
        return resultado;
    } else if (disco2==disco3 && disco2!=disco1) {
        int resultado = 15;
        return resultado;
    } else if (disco1==disco3 && disco1 != disco2) {
        int resultado = 15;
        return resultado;
    } else {
        int resultado = 5;
        return resultado;
    }
}
