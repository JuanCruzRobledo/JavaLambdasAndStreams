package com.juan.lambdas.binary;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        /*
            BinaryOperator
            Recibe dos valores del mismo tipo y retorna un valor del mismo
         */
        BinaryOperator<String> binaryOperator1 = (a, b) -> a +""+ b;

        //Utilizacion
        binaryOperator1.apply("Hola","Mundo");
    }
}
