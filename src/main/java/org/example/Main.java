package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //las pruebas se ejecutarán en la clase Main, una detrás de otra, me habría gustado
        //añadir un switch para elegir entre ellas, pero por tiempo , es un poco justo.
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserta el peso y la altura del IMC que quieres calcular, recuerda que si es un decimal tienes que insertar una coma");

        System.out.println("El peso....");
        double peso=scan.nextDouble();

        System.out.println("La altura...");
        double altura=scan.nextDouble();

        System.out.println(calculoIMC.CalculoIMC(peso,altura));

        System.out.println("Escribe un numero para calcular la suma de todos sus digitos por separado");
        int num=scan.nextInt();

        System.out.println("La suma de sus digitos es.... "+ sumaDigitos.calcularTotal(num));

        Object[] array={false,1,0,1,2,0,1,3,"a"};

        System.out.println("Llevar los 0 de este array"+ Arrays.toString(array)+"Al final ...");

        System.out.println("Este es el array con los ceros al final"+moviendoCeros.MoviendoCeros(array));
    }
}