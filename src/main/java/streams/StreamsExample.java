package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        /*Streams
        Es un flujo de datos que van pasando en una linea
        y vamos operando uno por uno realizando distintas operaciones.
         */
        List<String> nameList = Arrays.asList("Juan","Cruz","Robledo","dsada","dsadadsaada");

        //Operador ForEach(): Aplica una accion a cada elemento Operador Final
        nameList.stream()
                .forEach((name)->{
                    System.out.println(name);
                });

        //Operador Filter(): Filtra los elementos que cumplen con una condicione.
        nameList.stream()
                .filter((name)->{
                    return name.length()>5;
                }).forEach(System.out::println);

        //Operador Map(): Transforma los elementos aplicando una funcion
        nameList.stream()
                .map((name)-> name.toUpperCase())
                .forEach(System.out::println);

        //Operador Sorted(): Ordena los elementos recibidos del stream
        nameList.stream()
                .sorted()
                .forEach(System.out::println);

        //Operador Reduce(): Convina todos los elementos en un solo valor
        String result = nameList.stream()
                .reduce("",(a,b)->{
                    return a+" "+b;
                });
        //Operador Collect(): Toma todos los elementos de una coleccion
        List<String>  nuevaLista = nameList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        //Operador distinct(): Elimina los elementos duplicados
        nameList.stream()
                .distinct()
                .forEach(System.out::println);

        //Operador Limit(): limita el numero de elementos procesados , operador intermedio
        nameList.stream()
                .limit(2)
                .forEach(System.out::println);

        ///Operador skip(): Omite un numero especifico de elementos
        nameList.stream()
                .skip(3)
                .forEach(System.out::println);

        //Operador AnyMatch(): Verifica si algun elemento cumple una condicion
        boolean resultAnyMatch = nameList.stream()
                .anyMatch((name)->{
                    return name.startsWith("J");
                });
        System.out.println(resultAnyMatch);

        //Operador allMatch(): Verifica si todos elemento cumplen una condicion
        boolean resultAllMatch = nameList.stream()
                .allMatch((name)->{
                    return name.startsWith("S");
                });
        System.out.println(resultAllMatch);

        //operador noneMatch(): Verifica si ningun elemento cumple una condicion
        boolean noneMatch = nameList.stream()
                .noneMatch((name)->{
                    return name.length()>8;
                });
        System.out.println(noneMatch);
    }
}
