package com.juan.lambdas.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /*
            Function
            Recibe un valor y retorna un resultado
         */
        // Entre las <> se indica el tipo de parametro que recibe y el del que retorna
        Function<Integer,Integer> function = (x) ->{
            return x + 2;
        };

        //Forma corta
        Function<Integer, Integer> function2 = x -> x + 2;

        //Utilizacion
        System.out.println(function.apply(1));
    }
}
