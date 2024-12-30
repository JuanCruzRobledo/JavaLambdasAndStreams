package com.juan.lambdas.bipredicate;

import java.util.function.BiPredicate;

public class BipredicateExample {
    public static void main(String[] args) {
        /*
            Bipredicate
            Recibe dos valores y devuelve un boleano
         */
        BiPredicate<String,Integer> bipredicate1 = (str,num) ->{
            boolean b1 = str.startsWith("a");
            boolean b2 = num % 2 == 0;
            return b1 && b2;
        };

        //Utilizacion
        System.out.println(bipredicate1.test("anuel",2));
        System.out.println(bipredicate1.test("peruano",2));

    }
}
