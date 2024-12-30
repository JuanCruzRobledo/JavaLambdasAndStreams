package com.juan.lambdas.suplier;

import java.util.function.Supplier;

public class SuplierExample {
    public static void main(String[] args) {
        /*
            Suplier
            No recibe nada, pero retorna un valor
         */

        //Se indica entre las <> el tipo de valor que retorna
        Supplier<String> sipplier1 = ()->{
            return "Hello World";
        };

        //Forma corta

        Supplier<String> supplier2 = () -> "Hola mundo";

        //Utilizacion
        System.out.println(sipplier1.get());
    }
}
