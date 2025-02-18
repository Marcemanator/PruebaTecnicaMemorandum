package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class moviendoCerosTest {

    @Test
    void moviendoCeros() {
        Object[] array={false,1,0,1,2,0,1,3,"a"};

        moviendoCeros.MoviendoCeros(array);

        Object[]esperado={false,1,1,2,1,3,"a",0,0};

        String actualString= Arrays.stream(array).map(Object::toString)
                .collect(Collectors.joining(","));
        String esperadoString=Arrays.stream(esperado).map(Objects::toString)
                .collect(Collectors.joining(","));
        System.out.println("Array despues de mover ceros: "+ actualString);
        System.out.println("Array esperado:  "+ esperadoString);

        assertEquals(esperadoString,actualString,"Los Arrays no coinciden");
    }
}