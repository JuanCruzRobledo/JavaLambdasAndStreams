package com.juan.lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        /*
        * Consumer
        * Recibe un valor y no retorna nada
        */



        //Entre las <> se indica el tipo de valor que se envia por parametro
        Consumer<String> consumer = (parametro) ->{
            System.out.println(parametro); //Sin return
        };

        //FORMAS RESUMIDAS:
        //1
        Consumer<String> consumer2 = s -> System.out.println(s);
        //2
        Consumer<String> consumer3 = System.out::println;

        //UTILIZACION DE LAS FUNCIONES
        consumer.accept("Hello");
        consumer2.accept("Beautiful");
        consumer3.accept("World");
    }
}