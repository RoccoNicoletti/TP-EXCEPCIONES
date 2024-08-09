import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Colegio {

     private ArrayList<Alumno> cole=new ArrayList<>();

     ///constructores
    public Colegio(){

    }

    public Colegio(ArrayList<Alumno> cole) {
        this.cole = cole;
    }

    //getters y setters

    public ArrayList<Alumno> getCole() {
        return cole;
    }

    public void setCole(ArrayList<Alumno> cole) {
        this.cole = cole;
    }

    //metodos

    public void agregarAlumno (Alumno alu) throws NacionalidadFaltante {

        if(alu.getNacionalidad()==null || alu.getNacionalidad().isEmpty()){
            throw new NacionalidadFaltante("Error falta nacionalidad en un alumno") ;
        }
            cole.add(alu);

    }

    public void verNacionalidad(String nacionalidad) throws NoSuchElementException{

        int contador=0;



        for(Alumno alu: cole){
            if(alu.getNacionalidad().equals(nacionalidad)){

                contador++;

            }
            else if(!alu.getNacionalidad().equals(nacionalidad)){

             throw new NoSuchElementException("La nacionalidad a ver no existe en la lista");
            }

        }

        System.out.println("La nacionalidad " + nacionalidad + " tiene: " + contador + " personas");


    }

    public void cuantos (){

        HashSet<String> contador=new HashSet<>();

        for(Alumno alu:cole){

          contador.add(alu.getNacionalidad());

        }

        System.out.println("Hay " + contador.size() + " nacionalidades diferentes");
    }

    public void borrar(Alumno alu) throws NoSuchElementException   {

        if (!cole.contains(alu)){
            throw new NoSuchElementException("Error, el alumno a borrar no existe en la lista");
        }
        cole.remove(alu);
    }

    public void verTodos (){

        HashMap<String, Integer> contadorNacionalidades = new HashMap<>();

        for (Alumno alumno : cole) {
            String nacionalidad = alumno.getNacionalidad();
            contadorNacionalidades.put(nacionalidad, contadorNacionalidades.getOrDefault(nacionalidad, 0) + 1);
        }

        for (String nacionalidad : contadorNacionalidades.keySet()) {
            int contador = contadorNacionalidades.get(nacionalidad);
            System.out.println("Nacionalidad: " + nacionalidad);
            System.out.println("Número de alumnos: " + contador);
            System.out.println("----------------------");
        }
    }
}
