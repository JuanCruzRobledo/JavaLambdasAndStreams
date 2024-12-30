package com.juan.lambdas.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        /*
            UnaryOperator
            Recibe un valor, lo procesa y devuelve un resultado del mismo tipo
         */
        UnaryOperator<Integer> unaryOperator1 = (num) -> {
          return num*num;
        };

        //Utilizacion
        System.out.println(unaryOperator1.apply(5));
    }
}
