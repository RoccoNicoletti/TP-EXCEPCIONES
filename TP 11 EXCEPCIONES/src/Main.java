import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ///1. ¿Qué está mal en el siguiente bloque de código?
        //try
        //{
        //Persona p = baseDeDatos.buscar(datos);
        //System.out.println(“Los datos pertenecen a: ” + p);
        //}
        //catch(Exception e) {
        //// Maneja cualquiera de las excepciones comprobadas
        //}
        //catch(RuntimeException e) {
        //// Maneja cualquiera de las excepciones no comprobadas
        //}

        ///Lo que esta mal es que Excepcion es un termino muy global, se necesita ser mas especifico a la hora
        ///de identificar excepciones, y como segundo plano si no enconramos la excepcion deseada vemos con Excepcion
        //si hay alguna de otro tipo.Por eso en este caso deberia ir primero el RunTime el cual evalua mas especifico
        ///y luego evaluar Excepciones mas generales

        ///2. Explique lo que sucede el siguiente código y porque.
        //public static class EjemploExcepciones{ public
        //static int devuelveNumero(int num) { try {
        //if (num % 2 == 0) {
        //throw new Exception("Lanzando excepcion");
        //}
        //return 1;
        //} catch (Exception ex) { ex.getMessage().concat("Rompi
        ///todo y pase por Catch"); return 2;
        //} finally {
        //return 3;
        //}
        //}
        //}

        ///Lo que hace esto es que si el numero es par(1), ejecutara la excepcion(2) y pasara al bloque catch el
        ///cual terminara retornarnando 2 y el finally no tendra ningun efecto, en cambio, si el numero no es par no retornara nada


        ///EJERCICIO 3

     /*   Scanner teclado=new Scanner(System.in);
        int numeroAdivinar= (int)(Math.random()* 500)+1;
        boolean acertado=false;
        int intentos=0;

        do {
            try {
                System.out.println("Ingrese un numero del 1 al 500, pruebe su suerte! :");
                int numeroMio = teclado.nextInt();
                intentos++;


                if (numeroMio == numeroAdivinar) {
                    acertado = true;
                    System.out.println("Felicidades, acertaste el numero.");
                    System.out.println("En " + intentos + " intentos");
                } else if (numeroMio > numeroAdivinar) {

                    System.out.println("El numero que pusiste es mayor al numero a adivinar, siga intentando: ");
                } else if (numeroMio < numeroAdivinar) {

                    System.out.println("El numero que pusiste es menor al numero a adivinar, siga intentando: ");
                }
            }catch (InputMismatchException ex ) { ///excepcion para datos que sean de diferente tipo a lo que pido
                System.out.println("Fallaste, pusiste un caracter diferente a un numero entero");
                teclado.nextLine(); ///para limpiar el buffer de entrada y evitar bucle infinito
                intentos++;
            }

        }while(acertado==false);

*/
        ///EJERCICIO 4
        Colegio cole = new Colegio();
        try {
            Alumno alumno1 = new Alumno("Rocco", "argentino");
            Alumno alumno2 = new Alumno("Diana", "italiana");
            Alumno alumno3 = new Alumno("Titano", "italiana");
            Alumno alumno4 = new Alumno("Titano", "italiana");

            cole.agregarAlumno(alumno1);
            cole.agregarAlumno(alumno2);
            cole.agregarAlumno(alumno3);
            cole.borrar(alumno1);
            cole.verNacionalidad("italiana");



        } catch (NacionalidadFaltante e) {

            System.out.println(e.getMessage());

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());

        }


        cole.cuantos();
        cole.verTodos();

    }
}



