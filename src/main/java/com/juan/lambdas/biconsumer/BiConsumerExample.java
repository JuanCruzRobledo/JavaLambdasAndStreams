package com.juan.lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /*
            BiConsumer
            Recibe dos valores y no retorna nada
         */

        //Se le indica en <> los dos tipos de parametros que recibe
        BiConsumer<String,String> biConsumer = (a,b) ->{
            System.out.println(a + " " +b);
        };

        //Forma Corta

        BiConsumer<String,String> biconsumer2 = (a,b) -> System.out.println(a + " " +b);

        //Utilizacion
        biConsumer.accept("Hello","World");
        biconsumer2.accept("Hello","World");


    }
}
