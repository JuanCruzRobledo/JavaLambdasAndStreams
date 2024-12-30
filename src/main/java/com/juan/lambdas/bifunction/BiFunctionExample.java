package com.juan.lambdas.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /*
            Function
            Recibe dos valores y retorna un resultado
         */
        // Entre las <> se indica los dos tipos de parametros que recibe y el del que retorna
        BiFunction<Integer,Integer,Integer> bifunction1 = (a,b) ->{
          return a+b;
        };
        //Forma corta
        BiFunction<Integer,Integer,Integer> bifunction2 = (a,b) -> a+b;

        //Utilizacion
        System.out.println(bifunction1.apply(2,3));
        System.out.println(bifunction2.apply(2,3));
    }
}
