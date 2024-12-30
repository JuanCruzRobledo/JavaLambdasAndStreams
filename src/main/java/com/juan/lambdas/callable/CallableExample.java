package com.juan.lambdas.callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        /*
            Callable
            No recibe parametros, retorna un resultado y puede lanzar una excepcion a diferencia del Function.
         */
        Callable<String> callable = () -> {
            return "Resultado de la tarea";
        };

        //Utilizacion
        try{
            String result = callable.call();
            System.out.println(result);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
