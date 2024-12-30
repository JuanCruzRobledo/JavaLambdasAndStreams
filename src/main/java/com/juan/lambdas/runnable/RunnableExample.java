package com.juan.lambdas.runnable;

public class RunnableExample {
    public static void main(String[] args) {
        /*
            Runnable
            No recibe parametros, ejecuta una tarea
         */

        Runnable runnable = () -> {
            System.out.println("Ejecutando Runnable");
        };
        runnable.run();
    }
}
