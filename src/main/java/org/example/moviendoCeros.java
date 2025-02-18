package org.example;

import java.util.ArrayList;
import java.util.List;

public class moviendoCeros {

    public static List<Object> MoviendoCeros(Object[]array){
        int medidaArray=array.length;
        List<Object> arrayFinal= new ArrayList<>();

        int count=0; //contaremos los elementos que no sean 0;
        for (int i=0;i < medidaArray;i++) {
            if (!(array[i]).toString().equals("0")){
                array[count++]=array[i]; //Enviaremos el elemento que no sea 0 al indice count
            } else if(!(array[i] instanceof Integer)){
                array[count++] = array[i];//Mantenemos los demas objetos
            }
        }
        while(count < medidaArray){
            array[count++]="0";//a las posiciones que quedan, les añadimos 0
        }
        //Iteramos para llenar el arrayFinal con los objetos ordenados con los 0 al final
        for(Object obj: array){
            arrayFinal.add(obj);
        }
        return arrayFinal;
    }
}
