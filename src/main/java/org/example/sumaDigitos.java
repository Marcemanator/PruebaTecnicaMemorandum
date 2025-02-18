package org.example;

public class sumaDigitos {
    public static int sumaDigitos(int num){
        int suma=0;


        //mientras num sea mayor que 0
        while (num >0){
            suma += num%10;//añadimos el ultimo digito a la suma
            num/=10;
        }
       return suma;
    }
    public static int calcularTotal(int num){
        int sumaTotal=0;

        for(int i=1; i <= num; i++){
            sumaTotal += sumaDigitos(i);//la función sumadigitos() obtiene la suma total de los digitos de i
        }
        return sumaTotal; // y se guardará y  devolverá en la variable sumaTotal
    }

}
