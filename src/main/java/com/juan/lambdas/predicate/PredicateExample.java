package com.juan.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        /*
            Predicate
            Recibe un valor y devuelve un boleano
         */
        Predicate<String> predicate1 = (str) ->{
            return str.equals("holas");
        };

        //Forma corta
        Predicate<String> predicate2 = str -> str.equals("holas");

        //Utilizaciones
        System.out.println(predicate1.test("chais"));
        System.out.println(predicate2.test("holas"));
    }
}
