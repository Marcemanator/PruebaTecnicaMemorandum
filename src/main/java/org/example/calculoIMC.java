package org.example;

public class calculoIMC {
    public static String CalculoIMC(double peso,double altura){
        double imc= peso /(altura * altura); //hacemos el cálculo del imc con la fórmula
        System.out.println("Tu imc es de....."+ imc);
        //utilizamos comparadores de resultado y retornamos la frase que convenga a la comparación
        if(imc<=18.5){
            return "Estas en infrapeso";

            } else if (imc<=25) {

            return "Estás en peso normal";

            } else if (imc<=30) {

            return "Estás en sobrepeso";

            } else {

            return "Estas obeso";
        }


    }
}
